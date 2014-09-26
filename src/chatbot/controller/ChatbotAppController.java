package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotView;

public class ChatbotAppController
{
	private ChatbotView appView;
	private Chatbot mySillyChatbot;
	
	public ChatbotAppController()
	{
		appView = new ChatbotView(this);
		mySillyChatbot = new Chatbot("Derf");
	}
	
	public void start()
	{
		String result = appView.showChatbot("Kosta");
		
		if(mySillyChatbot.quitChecker(result))
		{
			quit();
		}
	}
	
	private void quit()
	{
		JOptionPane.showMessageDialog(null, "Goodbye cruel world");
		System.exit(0);
	}
}
