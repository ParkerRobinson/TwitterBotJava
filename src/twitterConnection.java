import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;


public class twitterConnection {


	public static searchTweet account;
	public static postTweet postBot;
	public static String name;
	
	
	
	public static void main(String[] args) throws TwitterException
	{
		 account = new searchTweet(TwitterFactory.getSingleton(), name);
		 account.setSearchField("#whodat");
		 postBot = new postTweet(TwitterFactory.getSingleton(), account.findTweet().getTweets().get(0).getUser().getScreenName());
		 // the extremly long series of methods gets the username.
		 postBot.createStatus();
		 
		 
		 

		
	}
	


}
