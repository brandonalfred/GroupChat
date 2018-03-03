package chat;

public class Main {
	public static void main(String[] args) {
		
		ChatModel theModel1 = new ChatModel("Joe");
		ChatModel theModel2 = new ChatModel("Sue");
		ChatModel theModel3 = new ChatModel("Billy");
		ChatView theView1 = new ChatView(theModel1);
		ChatView theView2 = new ChatView(theModel2);
		ChatView theView3 = new ChatView(theModel3);
		
		@SuppressWarnings("unused")
		ChatController theController = new ChatController(theView1, theView2, theView3,
														 theModel1, theModel2, theModel3);
		
		theView1.setVisible(true);
		theView2.setVisible(true);
		theView3.setVisible(true);
	}
}
 