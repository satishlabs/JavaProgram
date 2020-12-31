package com.jdk8.features.base64;

import java.util.Base64;

public class Base64BasicEncryption2 {
	public static void main(String[] args) {
		Base64.Encoder encoder = Base64.getUrlEncoder();
		
		String eStr = encoder.encodeToString("http://localhost:4200/".getBytes());
		System.out.println("Encoded URL: "+eStr);
		
		Base64.Decoder decoder = Base64.getUrlDecoder();
		
		String dStr = new String(decoder.decode(eStr));
		System.out.println("Decoded URL: "+dStr);
	}
}
