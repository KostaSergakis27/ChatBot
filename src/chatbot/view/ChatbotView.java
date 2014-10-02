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
	 * shows a String from the Chatbot with the availability of user input.
	 * @param currentInput most recent input from the user, The supplied String.
	 * @return The users typed response.
	 */
	public String showChatbotDialog(String currentInput)
	{
		String result = "";
		
		result = JOptionPane.showInputDialog(null, baseController.getMySillyChatbot().getName() + " says: " + currentInput);
		
		return result;
	}
	/**
	 * Shows a String from the Chatbot as a popup window.
	 * @param currentInput The String from the chatbot
	 */
	public void showChatbotMessage(String currentInput)
	{
		JOptionPane.showMessageDialog(null, baseController.getMySillyChatbot().getName() + " says: " + currentInput);
	}
}
