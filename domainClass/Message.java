package qin.model.domainClass;

import java.io.Serializable;

public class Message implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int sourceID;
	
	// 目的用户ID 或者 目的群ID
	// 通过 QinMessagePacket.command 来判断具体是哪种
	private int descriptionID;
	
	private String message;
	
	// 时间由客户端设定
	private String time;
	
	
	public Message() {
		sourceID = 0;
		descriptionID = 0;
		message = "";
		time = "";
	}
	
	
	public Message(int s, int d, String _message, String _time) {
		sourceID = s;
		descriptionID = d;
		message = _message;
		time = _time;
	}
	
	
	public void setSourceID(int s) {
		sourceID = s;
	}
	
	
	public void setDescriptionID(int d) {
		descriptionID = d;
	}
	
	
	public void setMessage(String _message) {
		message = _message;
	}
	
	
	public int getSourceID() {
		return sourceID;
	}
	
	
	public int getDescriptionID() {
		return descriptionID;
	}
	
	public String getMessage() {
		return message;
	}
	
	
	public void setTime(String _time) {
		time = _time;
	} 
	
	
	public String getTime() {
		return time;
	}
}
