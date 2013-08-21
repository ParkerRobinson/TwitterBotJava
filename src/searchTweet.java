import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;


public class searchTweet {
	static String searchField;
	static Twitter account;
	
	public searchTweet(Twitter a, String b)
	{
		account = a;
		System.out.println(a);
		searchField = b;
	}


	
	public QueryResult findTweet() throws TwitterException
	{
		Query query = new Query(searchField);
	    QueryResult result = account.search(query);
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
		return account;
	}



}
