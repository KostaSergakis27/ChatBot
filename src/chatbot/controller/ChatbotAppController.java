package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotView;
/**
 * Runs the Chatbot Project. Owns the model and associated views.
 * @author Kosta Sergakis
 * @version 1.2 10/2/14
 */
public class ChatbotAppController
{
	private ChatbotView appView;
	private Chatbot mySillyChatbot;
	private String startMessage;
	private String quitMessage;
	
	/**
	 * constructor for the controller, makes objects appView and mySillyChatbot
	 */
	public ChatbotAppController()
	{
		appView = new ChatbotView(this);
		mySillyChatbot = new Chatbot("Derf");
		startMessage = "Welcome to the " + mySillyChatbot.getName() + " chatbot. What is your name?";
		quitMessage = "Goodbye user :(";
	}
	
	public Chatbot getMySillyChatbot()
	{
		return mySillyChatbot; 
	}
	
	//Start method for the chatbot, runs the quick checker
	public void start()
	{
		String result = appView.showChatbotDialog(startMessage);
		
		while(!mySillyChatbot.quitChecker(result))
		{
			result = appView.showChatbotDialog(result);
		}
		
		quit();
	}
	
	//quit method, tells the user goodbye then quits
	private void quit()
	{
		appView.showChatbotDialog(quitMessage);
		System.exit(0);
	}
	
}
