package qin.model.domainClass;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int ID = 0;
	private String nickname = null;
	private String password = null;
	
	private String email = "";
	
	private int age = 0;
	
	private String gender = "";

	private Address address = new Address();
	
	private String headImage = "1.png";
	
	private String IP = null;
	private int port = 0;
	
	private boolean isOnline = false;
	
	public User() {
		ID = 0;
		nickname = "";
	}
	
	/***
	 * 
	 * @param _ID
	 * @param _nickname
	 * @param _password
	 */
	public User(int _ID, String _nickname, String _password) {
		
		ID = _ID;
		nickname = _nickname;
		password = _password;
	}
	
	public void setID(int _ID) {
		ID = _ID;
	}
	
	public void  setNickname(String _nickname) {
		nickname = _nickname;
	}
	
	public void  setPassword(String _password) {
		password = _password;
	}
	
	public void  setEmail(String _email) {
		email = _email;
	}
	
	public void setAge(int _age) {
		age = _age;
	}
	
	public void  setGender(String _gender) {
		gender = _gender;
	}

	public void  setAddress(Address _address) {
		address = _address;
	}
	
	public void  setHeadImage(String _headImage) {
		headImage =  _headImage;
	}
	
	public void  setIP(String _IP) {
		IP = _IP;
	}
	
	public void setPort(int _port) {
		port = _port;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}

	public Address getAddress() {
		return address;
	}
	
	public String getHeadImage() {
		return headImage;
	}
	
	public String getIP() {
		return IP;
	}
	
	public int getPort() {
		return port;
	}

	public boolean isUserOnline() {
		return isOnline;
	}
	
	public void online() {
		isOnline = true;
	}
	
	public void offline() {
		isOnline = false;
	}

}
