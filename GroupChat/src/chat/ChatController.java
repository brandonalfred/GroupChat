package chat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatController {
	private ChatView theView1;
	private ChatView theView2;
	private ChatView theView3;
	private ChatModel theModel1;
	private ChatModel theModel2;
	private ChatModel theModel3;
	
	public ChatController(ChatView theView1, ChatView theView2, ChatView theView3, ChatModel theModel1, ChatModel theModel2, ChatModel theModel3) {
		this.theView1 = theView1;
		this.theView2 = theView2;
		this.theView3 = theView3;
		this.theModel1 = theModel1;
		this.theModel2 = theModel2;
		this.theModel3 = theModel3;
		
		this.theView1.addSendListener(new SendListener1());
		this.theView2.addSendListener(new SendListener2());
		this.theView3.addSendListener(new SendListener3());
	}
	
	public class SendListener1 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			theModel1.setMessage(theView1.getUserText().getText());
			theView1.getTextArea().append("\n" + "Me: " + theModel1.getMessage());
			theView2.getTextArea().append("\n" + theModel1.getName() + ": " + theModel1.getMessage());
			theView3.getTextArea().append("\n" + theModel1.getName() + ": " + theModel1.getMessage());

			theView1.getUserText().setText("");
		}
	}
	
	public class SendListener2 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			theModel2.setMessage(theView2.getUserText().getText());
			theView2.getTextArea().append("\n" + "Me: " + theModel2.getMessage());
			theView1.getTextArea().append("\n" + theModel2.getName() + ": " + theModel2.getMessage());
			theView3.getTextArea().append("\n" + theModel2.getName() + ": " + theModel2.getMessage());
			
			theView2.getUserText().setText("");
		}
	}
	
	public class SendListener3 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			theModel3.setMessage(theView3.getUserText().getText());
			theView3.getTextArea().append("\n" + "Me: " + theModel3.getMessage());
			theView1.getTextArea().append("\n" + theModel3.getName() + ": " + theModel3.getMessage());
			theView2.getTextArea().append("\n" + theModel3.getName() + ": " + theModel3.getMessage());
			
			theView3.getUserText().setText("");
		}
	}
}
