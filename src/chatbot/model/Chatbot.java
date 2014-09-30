package chatbot.model;

/**
 * The chatbot model class, used for checking and manipulating Strings.
 * @author Kosta Sergakis
 * @version 1.1 9/26/14
 */
public class Chatbot
{
	
	private String name;
	private int chatCount;
	
	/**
	 * Creates a Chatbot with the supplied name and initializes the current number of chats to zero.
	 * @param name The supplied name for the Chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
		chatCount = 0;
	}
	
	/**
	 * Returns the name of the Chatbot object.
	 * @return The current name of Chatbot.
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Returns the number of times Chatbot has Chatted. :D
	 * @return The current number of chats
	 */
	public int getChatCount()
	{
		return chatCount;
	}
	
	/**
	 * Sets the name of the Chatbot.
	 * @param name The new name of the Chatbot.
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * increments the chat count.
	 */
	private void updateChatCount()
	{
		chatCount++;
	}
	
	/**
	 * Checks to see if the application can quit
	 * @param input
	 * @return
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
		
		if(input.equalsIgnoreCase("Seeya"))
		{
			okToQuit = true;
		}
		return okToQuit;
		
	}
}
