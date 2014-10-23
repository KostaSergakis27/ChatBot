package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotFrame;
import chatbot.view.ChatbotView;
/**
 * Runs the Chatbot Project. Owns the model and associated views.
 * @author Kosta Sergakis
 * @version 1.2 10/2/14 cleaned the quit method.
 */
public class ChatbotAppController
{
	//instance od the chatbotView, the view of the application.
	private ChatbotView appView;
	//The instance of the Chatbot, the Model of this application.
	private Chatbot mySillyChatbot;
	//Message greeting the user
	private String startMessage;
	//goodby message to the user
	private String quitMessage;
	//reference to the GUI JFrame object for the application.
	private ChatbotFrame appFrame;
	/**
	 * constructor for the controller, makes objects appView and mySillyChatbot
	 */
	public ChatbotAppController()
	{
		appView = new ChatbotView(this);
		appFrame = new ChatbotFrame(this);
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
	//	String result = appView.showChatbotDialog(startMessage);
		
//		while(!mySillyChatbot.quitChecker(result))
//		{
	//		result = mySillyChatbot.processText(result);
//			result = appView.showChatbotDialog(result);
	//	}
		
//		quit();
	}
	
	//quit method, tells the user goodbye then quits
	private void quit()
	{
		appView.showChatbotMessage(quitMessage);
		System.exit(0);
	}
	
}
