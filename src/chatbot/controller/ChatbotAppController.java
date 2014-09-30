package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotView;
/**
 * controller class for the chatbot, used to start and quit the chatbot
 * @author Kosta Sergakis
 * @version 1.1 9/30/14
 */
public class ChatbotAppController
{
	private ChatbotView appView;
	private Chatbot mySillyChatbot;
	
	/**
	 * constructor for the controller, makes objects appView and mySillyChatbot
	 */
	public ChatbotAppController()
	{
		appView = new ChatbotView(this);
		mySillyChatbot = new Chatbot("Derf");
	}
	//Start method for the chatbot, runs the quick checker
	public void start()
	{
		String result = appView.showChatbot("Kosta");
		
		while(!mySillyChatbot.quitChecker(result))
		{
			result = appView.showChatbot(result);
		}
		
		quit();
		
	}
	
	//quit method, tells the user goodbye then quits
	private void quit()
	{
		JOptionPane.showMessageDialog(null, "Goodbye cruel world");
		System.exit(0);
	}
}
