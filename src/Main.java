import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;


public class Main {


	public static Twitter account;
	
	

	public static void main(String[] args) throws TwitterException
	{
		 account = TwitterFactory.getSingleton();
		 System.out.println(findTweet.searchTweet());

		
	}


}
