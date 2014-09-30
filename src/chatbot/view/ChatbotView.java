package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatbotAppController;

public class ChatbotView
{
	private ChatbotAppController baseController;
	
	public ChatbotView(ChatbotAppController baseController)
	{
		this.baseController = baseController; 
	}
	/**
	 * shows the pop up window for the user to interact with the chatbot
	 * @param currentInput most recent input from the user
	 * @return 
	 */
	public String showChatbot(String currentInput)
	{
		String result = "";
		
		JOptionPane.showMessageDialog(null, "Hello, " + currentInput);
		result = JOptionPane.showInputDialog(null, "Are you done? Type 'seeya' to quit");
		
		return result;
	}
}
