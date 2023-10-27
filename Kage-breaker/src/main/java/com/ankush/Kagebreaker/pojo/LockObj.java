package com.ankush.Kagebreaker.pojo;

public class LockObj {

	
	private int id;	
	private String key;
	
	public int getCmId() {
		return id;
	}
	public void setCmId(int cmId) {
		this.id = cmId;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	public LockObj(int cmId, String key) {
		super();
		this.id = cmId;
		this.key = key;
	}
	
}
