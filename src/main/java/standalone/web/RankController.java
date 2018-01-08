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
		
		Document doc = Jsoup.connect("https://datalab.naver.com/keyword/realtimeList.naver").get();
		Elements elements = doc.select("ul.rank_list").last().select("li.list").select("span");
		
		for (int i = 0; i < elements.size(); i++) {		
			RankModel rank = new RankModel();
			rank.setRanking(i+1);
			rank.setTitle(elements.get(i).select(".title").text());					
			list.add(rank);
		}
		
		return list;
		
	}
		
}
