import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;


public class findTweet {
	static String searchField;


	
	public static QueryResult searchTweet(Twitter a) throws TwitterException
	{
		Query query = new Query(searchField);
	    QueryResult result = a.search(query);
		return result;
	}
	public static void setSearchField(String a)
	{
		searchField = a;
	}
	public static String getSearchField()
	{
		return searchField;
	}



}
