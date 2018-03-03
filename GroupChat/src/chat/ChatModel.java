package chat;

public class ChatModel {
	private String message;
	private String name;
	
	public ChatModel(String name) {
		this.name = name;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	public String getName() {
		return name;
	}
}
