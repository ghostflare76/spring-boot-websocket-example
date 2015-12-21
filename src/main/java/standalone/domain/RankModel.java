package standalone.domain;

public class RankModel {

	private String title;
	
	private int ranking;
	
	private String rankName;
	
	private String rankLevel;
	
	private String rankUrl;
	
	public RankModel() {
		
	}
	
	public RankModel(String title, int ranking, String rankName, String rankLevel) {
		super();
		this.title = title;
		this.ranking = ranking;
		this.rankName = rankName;
		this.rankLevel = rankLevel;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public String getRankName() {
		return rankName;
	}

	public void setRankName(String rankName) {
		this.rankName = rankName;
	}

	public String getRankLevel() {
		return rankLevel;
	}

	public void setRankLevel(String rankLevel) {
		this.rankLevel = rankLevel;
	}

	public String getRankUrl() {
		return rankUrl;
	}

	public void setRankUrl(String rankUrl) {
		this.rankUrl = rankUrl;
	}
	
	
}
