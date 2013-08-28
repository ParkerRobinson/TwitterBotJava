import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;


public class postTweet {
	static Twitter postBot;
	static String username;
	static String[] response;
	
	public postTweet(Twitter a, String b)
	{
		postBot = a;
		username = b;
	}
	
	public void createStatus() throws TwitterException
	{
		Status status = postBot.updateStatus("@" + username + " I'm sorry but the Falcons are soo much better.#riseup");
		System.out.println("Posted the Tweet");
	}



}
