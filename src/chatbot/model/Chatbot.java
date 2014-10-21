package chatbot.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

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
		memeList = new ArrayList<String>();
		this.name = name;
		chatCount = 0;
		fillTheMemeList();
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
	 * fills the memeList with words for the chatbot to check
	 */
	private void fillTheMemeList()
	{
		memeList.add("Puppies");
		memeList.add("Doge");
		memeList.add("y u no");
		memeList.add("forever alone");
		memeList.add("darth vader");
		memeList.add("wut");
	}
	
	/**
	 * Processes input from the user against the checker methods. returns the next output for the view
	 * @param currentInput The supplied Text
	 * @return The processed text based on checker or other methods.
	 */
	public String processText(String currentInput)
	{
		String result = "";
		
		int randomPosition = (int) (Math.random() * 3);
		if(currentInput != null)
		{
			if(randomPosition == 0)
			{
				if(stringChecker(currentInput))
				{
					result = "too long :(";
				}
				else
				{
					result = "short words";
				}
			}
			else if(randomPosition == 1)
			{
				if(contentChecker(currentInput))
				{
					result = "Wow! I like to play Halo too!";
				}
				else
				{
					result = "That is not as fun as Halo";
				}
			}
			else
			{
				if(memeChecker(currentInput))
				{
					result = "wow " + currentInput + " is a meme. Wahoo!";
				}
				else
				{
					result = "not a meme, try again";
				}
			}
		}
		else
		{
			result = "use words!!!";
		}
		return result;
		
	}
	
	/**
	 * increments the chat count.
	 */
	private void updateChatCount()
	{
		chatCount++;
	}
	/**
	 * method checks the content of the input
	 * @param input takes the input about halo
	 * @return
	 */
	private boolean contentChecker(String input)
	{
		boolean videoGames = false;
		
		if(input.contains("Halo"))
		{
			videoGames = true;
		}
		
		return videoGames;
		
	}
	/**
	 * checks to see if the users input is a meme or not.
	 * @param input The supplied text
	 * @return isAMeme boolean
	 */
	private boolean memeChecker(String input)
	{
		boolean isAMeme = false;
		
		for(String currentMeme : memeList)
		{
			if(input.equalsIgnoreCase(currentMeme))
			{
				isAMeme = true;
			}
		}
		return isAMeme;
	}
	/**
	 * Checks the input from the User to see if it is too long
	 * @param input Supplied text.
	 * @return StringTooLong.
	 */
	private boolean stringChecker(String input)
	{
		
		boolean stringTooLong = false;
		
		if(input.length() > 20)
		{
			stringTooLong = true;
		}
		return stringTooLong;
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

}

