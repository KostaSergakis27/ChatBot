package chatbot.model;

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

	public int getChatCount()
	{
		return chatCount;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
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
