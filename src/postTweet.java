import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;


public class postTweet {
	static String newStatus;



	public static void main(String[] args) throws TwitterException
	{
		

		
	}
	
	public static void createTweet(String tweet) throws TwitterException
	{
		Status status = Main.account.updateStatus(tweet);
	}


}
