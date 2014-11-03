package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

import chatbot.controller.ChatbotAppController;

import java.awt.event.KeyAdapter;

public class ChatbotPanel extends JPanel
{
	private ChatbotAppController baseController;
	
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private String startMessage;
	
	public ChatbotPanel(ChatbotAppController baseController)
	{
		this.baseController = baseController;
		
		startMessage = "Welcome to the Derf chatbot. What is your name?";
		firstButton = new JButton("Click the button... it is so clicky :D");
		firstTextField = new JTextField(25);
		baseLayout = new SpringLayout();
		chatArea = new JTextArea(5, 20);
		chatPane = new JScrollPane(chatArea);
		
		chatArea.setText(startMessage);
		
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		
		
	}
	/**
	 * sets up the panel with the layout options and a button and text field
	 */
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.setSize(400, 400);
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
		this.add(chatPane);
		
		
		
	}
	/**
	 * sets up the layout, or the placement of the button and text field
	 */
	private void setupLayout()
	{
		//buttonLayout
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -10, SpringLayout.EAST, this);
		//ChatPane Layout
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 20, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 20, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatPane, -60, SpringLayout.NORTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.EAST, chatPane, 380, SpringLayout.WEST, this);
		//firstTextField Layout
		baseLayout.putConstraint(SpringLayout.SOUTH, firstTextField, -6, SpringLayout.NORTH, firstButton);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextField, 0, SpringLayout.EAST, firstButton);
	}
	
	
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				chatArea.append("\n You:" + (firstTextField.getText()));
				String currentInput = firstTextField.getText();
				String result = baseController.getChatbotDialog(currentInput);
				showTextMessage(currentInput);
				showTextMessage(result);
				firstTextField.setText("");
			}
		});
		
		firstTextField.addKeyListener(new KeyAdapter() 
		{
			public void keyPressed(KeyEvent event) 
			{
				if(event.getKeyCode() == KeyEvent.VK_ENTER)
				{
					chatArea.append("\nYou: " + (firstTextField.getText()));
					firstTextField.setText("");
				}
			}
		});
		 
		chatPane.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener()  
		{  
			public void adjustmentValueChanged(AdjustmentEvent e)  
			{  
				chatArea.select(chatArea.getCaretPosition()*12 , chatArea.getText().length());  
			}  
		});  
	}
	
	public void showTextMessage(String userInput)
	{
		chatArea.append("\n" + userInput);
	}
}
