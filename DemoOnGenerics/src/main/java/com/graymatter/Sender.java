package com.graymatter;

public class Sender<T> {
	
	T msg;
	
	public void setMsg(T msg)
	{
		this.msg=msg;
	}
	
	public void sendMsg()
	{
		System.out.println("from sender to receiver");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sender<String> strMsg = new Sender<String>();
		strMsg.setMsg("hello");
		strMsg.sendMsg();

	}

}
