package qin.model.domainClass;

import java.io.Serializable;

public class Qun implements Serializable{
	private static final long serialVersionUID = 1L;

	private int qunOwnerID;
	
	private int qunID;
	private String qunName;
	private String qunDescription;
	
	public Qun() {
		qunID = 0;
		qunOwnerID = 0;
		qunName = "";
		qunDescription = "";
	}
	
	
	public Qun(int _qunID) {
		qunID = _qunID;
		qunOwnerID = 0;
		qunDescription = "";
		qunName = "";
	}
	
	
	public void setQunOwnerID(int _qunOwnerID) {
		qunID = _qunOwnerID;
	}
	
	
	public int getQunOwnerID() {
		return qunOwnerID;
	}
	
	
	public void setQunID(int _qunID) {
		qunID = _qunID;
	}
	
	
	public int getQunID() {
		return qunID;
	}
	
	public void setQunName(String _qunName) {
		qunName = _qunName;
	}
	
	
	public String getQunName() {
		return qunName;
	}
	
	
	public void setQunDescription(String _qunDescription) {
		qunDescription = _qunDescription;
	}
	
	
	public String getQunDescription() {
		return qunDescription;
	}
}
