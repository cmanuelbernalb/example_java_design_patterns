package cSTest;

public class Member extends Thread{
	Logger logger;
	String name;
	
	public Member(String name){
		this.name = name;
		start();
	}
	
	public void run(){
		logger = FileLogger.getFileLogger();
		logger.log("A message by: "+name+" ");
		System.out.println("Message logged succesfully by:"+name);
	}
}
