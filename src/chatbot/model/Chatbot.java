package chatbot.model;

import java.util.ArrayList;

/**
 * The chatbot model class, used for checking and manipulating Strings.
 * @author Kosta Sergakis
 * @version 1.1 9/26/14
 */
public class Chatbot
{
	private ArrayList<String> memeList;
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
	 * Processes input from the user against the checker methods. returns the next output for the view
	 * @param currentInput The supplied Text
	 * @return The processed text based on checker or other methods.
	 */
	public String processText(String currentInput)
	{
		String result = "";
		
		
		return result;
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
	 * Sets the name of the Chatbot to the supplied name.
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
		
		if(input != null && input.equalsIgnoreCase("Seeya"))
		{
			okToQuit = true;
		}
		return okToQuit;
		
	}
	
	private void stringChecker()
	{
		
	}

}

