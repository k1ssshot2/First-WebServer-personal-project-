package http;

import java.util.HashMap;

public class Session {
	private HashMap<String, Object> table= null;
	private static Session instance = null;
	
	public Session() { // new Session() 형태로생성자를호출할경우, 기존방식으로객체를별도로생성
		table= new HashMap<String, Object>();
	} 
	
	public static Session getInstance() { // Session.getInstance()로호출할경우, 공유객체생성
		if(instance == null) {instance = new Session();}
		return instance;
	}
	
	public void set(String key, Object val) {
		table.put(key, val);
	}
	
	public Object get(String key) {
		return table.get(key);
	}
	
	public Object remove(String key) {
		return table.remove(key);
	}
}
