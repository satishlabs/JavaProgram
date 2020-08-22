package com.jdk8.features.methodreference;
 interface Messageable{
	Message getMessage(String msg);
 }
 class Message{
	 public Message(String msg) {
		System.out.println(msg);
	}
 }
public class ConstructorReference {
	public static void main(String[] args) {
		Messageable mess = Message::new;
		mess.getMessage("hello... ");
	}
}
