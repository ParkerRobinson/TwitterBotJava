import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;


public class postTweet {
	static Twitter account;
	static String username;
	static String[] response;
	
	public postTweet(Twitter a, String b)
	{
		account = a;
		username = b;
	}
	
	public void createStatus() throws TwitterException
	{
		Status status = account.updateStatus("@" + username + " I'm sorry but the Falcons are soo much better.#riseup");
		System.out.println("Posted the Tweet");
	}



}
