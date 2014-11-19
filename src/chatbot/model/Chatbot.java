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
	private ChatbotUser myUser;
	private ChatbotUser myAge;
	private ArrayList<String> userInputList;
	/**
	 * Creates a Chatbot with the supplied name and initializes the current number of chats to zero.
	 * @param name The supplied name for the Chatbot.
	 */
	public Chatbot(String name)
	{
		memeList = new ArrayList<String>();
		userInputList = new ArrayList<String>();
		this.name = name;
		chatCount = 0;
		myUser = new ChatbotUser();
		myAge = new ChatbotUser();
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
	
	public ChatbotUser getMyUser()
	{
		return myUser;
	}


	public void setMyUser(ChatbotUser myUser)
	{
		this.myUser = myUser;
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
		if(getChatCount() < 5)
		{
			result = introduceUser(currentInput);
		}
		else if(currentInput != null && currentInput.length() > 0)
		{
			int randomPosition = (int) (Math.random() * 6);
			result =randomChatConvo(currentInput);
		}
		else
		{
			result = "use words!!!";
		}
		updateChatCount();
		return result;
		
	}
	

	private String introduceUser(String input)
	{
		String userQuestion = "";
		
		if(getChatCount() < 7)
		{
			//ask questions about all data members here
			//you will need ifs or a switch
			//assign via myUser.set...
			if(getChatCount() == 0)
			{
				myUser.setUserName(input);
				userQuestion = "Good name " + myUser.getUserName() + " how old are you?";
			}
			else if(getChatCount() == 1)
			{
				int userAge = Integer.parseInt(input);
				myUser.setUserAge(userAge);
				userQuestion = "Wow you are really old" + myUser.getUserName() + " how much do you weigh?";
				
			}
		}
	}
		
	private String randomChatConvo(String input)
	{
		String conversation = "";
		int randomPosition = (int) (Math.random() * 6);
		if(randomPosition == 0)
		{
			if(stringChecker(input))
			{
				conversation = "too long :(";
			}
			else
			{
				conversation = "short words";
			}
		
		}
		else if(randomPosition == 1)
		{
			if(contentChecker(input))
			{
				conversation = "Wow! I like to play Halo too!";
			}
			else
			{
				conversation = "That is not as fun as Halo";
			}
		}
		else if(randomPosition == 2)
		{
			if(memeChecker(input))
			{
				conversation = "wow " + input + " is a meme. Wahoo!";
			}
			else
			{
				conversation = "not a meme, try again";
			}
			
		}
		else if(randomPosition == 3)
		{
			//from chat user
		}
		else if(randomPosition == 4)
		{
			//add current input to the userlist. result = something
		}
		else
		{
			if(userInputChecker(input))
			{
				
			}
		}
	}
	private boolean userInputChecker(String userInput)
	{
		boolean matchesInput = false;
		
		for(int loopCount = 0; loopCount > userInputList.size(); loopCount ++)
		{
			if(userInput.equalsIgnoreCase(userInputList.get(loopCount)))
			{
				matchesInput = true;
				userInputList.remove(loopCount);
				loopCount--;
			}
		}
		return matchesInput;
	}
	
		return userQuestion;
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

