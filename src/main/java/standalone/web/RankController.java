package standalone.web;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import standalone.domain.RankModel;

@RestController
public class RankController {
	
	@RequestMapping("rank")
	public List<RankModel> top10rank() throws Exception {
		List<RankModel> list = new ArrayList<RankModel>();
		
		Document doc = Jsoup.connect("http://naver.com/").get();
		Elements elements = doc.select("ol#realrank > li:not(#lastrank) > a");
		for (int i = 0; i < elements.size(); i++) {
			RankModel rank = new RankModel();
			rank.setRanking(i+1);
			rank.setTitle(elements.get(i).attr("title"));
			rank.setRankName(elements.get(i).select("span.tx").text());
			rank.setRankLevel(elements.get(i).select("span.rk").text());
			rank.setRankUrl(elements.get(i).attr("href"));
			list.add(rank);
		}
		
		return list;
		
	}
		
}
