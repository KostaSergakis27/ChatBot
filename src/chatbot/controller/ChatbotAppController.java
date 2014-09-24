package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.view.ChatbotView;

public class ChatbotAppController
{
	private ChatbotView appView;
	
	public ChatbotAppController()
	{
		appView = new ChatbotView(this);
	}
	
	public void start()
	{
		String result = appView.showChatbot("Kosta");
		
		if(result.equalsIgnoreCase("exit"))
		{
			quit();
		}
	}
	private void quit()
	{
		JOptionPane.showMessageDialog(null, "good bye cruel world");
		System.exit(0);
	}
}
