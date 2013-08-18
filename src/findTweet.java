import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;


public class findTweet {



	public static void main(String[] args) throws TwitterException
	{
		 
		   
		    
		  

		
	}
	
	public static QueryResult searchTweet() throws TwitterException
	{
		Query query = new Query("#whodat");
	    QueryResult result = Main.account.search(query);
		return result;
	}



}
