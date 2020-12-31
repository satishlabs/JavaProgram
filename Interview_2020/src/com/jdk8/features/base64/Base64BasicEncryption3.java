package com.jdk8.features.base64;

import java.util.Base64;

public class Base64BasicEncryption3 {
	public static void main(String[] args) {
		
		//Getting MIME encode
		Base64.Encoder encoder = Base64.getMimeEncoder();
		String message = "Hello, \n You are informed regarding your inconsistency of workd!";
		String eStr = encoder.encodeToString(message.getBytes());
		System.out.println("Encoded MIME message: "+eStr);
		
		//Getting MIME decode
		Base64.Decoder decoder = Base64.getMimeDecoder();
		String dStr = new String(decoder.decode(eStr));
		System.out.println("Decoded messgae: "+dStr);
	}
}
