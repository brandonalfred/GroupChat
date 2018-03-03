package chat;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class ChatView extends JFrame {
	
	private JTextField userText = new JTextField(20);
	private JTextArea chatWindow = new JTextArea(20, 30);
	private JButton sendButton = new JButton("Send");
	
	public ChatView(ChatModel x) {
		super("CHATTY: " + x.getName());
		
		JPanel chatPanel = new JPanel();
		chatPanel.setLayout(new FlowLayout());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 425);
		
		chatPanel.add(userText);
		
		chatPanel.add(chatWindow);
		
		chatPanel.add(sendButton);
		
		this.add(chatPanel);
	}
	
	public JTextField getUserText() {
		return userText;
	}
	
	public JTextArea getTextArea() {
		return chatWindow;
	}
	
	public JButton getButton() {
		return sendButton;
	}
	
	void addSendListener(ActionListener l) {
		sendButton.addActionListener(l);
	}
}
