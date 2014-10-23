package chatbot.view;

import javax.swing.JFrame;

import chatbot.controller.ChatbotAppController;
/**
 * GUI Frame Class for a chatbot. Shows the basic frameworl code for a JFrame extension.
 * @author Kosta Sergakis
 * @version 1.1 10/21/14
 */

public class ChatbotFrame extends JFrame
{
	private ChatbotPanel basePanel;
	
	public ChatbotFrame(ChatbotAppController baseController)
	{
		basePanel = new ChatbotPanel(baseController);
		
		setupFrame();
	}
	//sets up the frame with the size and the layout
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		this.setResizable(false);
		setVisible(true);
	}
}
