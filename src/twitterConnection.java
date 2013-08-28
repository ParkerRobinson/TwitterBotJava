import twitter4j.TwitterException;
import twitter4j.TwitterFactory;


public class twitterConnection {


	public static searchTweet searchBot;
	public static postTweet postBot;
	public static String name;
	
	
	
	public static void main(String[] args) throws TwitterException
	{
		 searchBot = new searchTweet(TwitterFactory.getSingleton(), name);
		 searchBot.setSearchField("#whodat");
		 postBot = new postTweet(TwitterFactory.getSingleton(), searchBot.findTweet().getTweets().get(0).getUser().getScreenName());
		 // the extremly long series of methods gets the username.
		 postBot.createStatus();
		 
		 
		 

		
	}
	


}
