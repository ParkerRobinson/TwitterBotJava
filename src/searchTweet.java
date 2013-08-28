import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterException;


public class searchTweet {
	static String searchField;
	static Twitter searchBot;
	
	public searchTweet(Twitter a, String b)
	{
		searchBot = a;
		System.out.println(a);
		searchField = b;
	}


	
	public QueryResult findTweet() throws TwitterException
	{
		Query query = new Query(searchField);
	    QueryResult result = searchBot.search(query);
		return result;
	}
	public void setSearchField(String a)
	{
		searchField = a;
	}
	public String getSearchField()
	{
		return searchField;
	}
	public Twitter getTwitter()
	{
		return searchBot;
	}



}
