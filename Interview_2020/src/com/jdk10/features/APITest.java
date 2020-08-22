package com.jdk10.features;

import java.lang.Runtime.Version;

public class APITest {
	public static void main(String[] args) {
		Version version = Runtime.version();
		System.out.println("Feature: "+version.feature());
		System.out.println("interim: "+version.interim());
		System.out.println("update: "+version.update());
		System.out.println("Patch: "+version.patch());
		System.out.println("Feature: "+version.feature());
		
		System.out.println("==========================");
		Version version1 = Runtime.Version.parse("10.0.1");
		
		System.out.println("Feature: "+version1.feature());
		System.out.println("interim: "+version1.interim());
		System.out.println("update: "+version1.update());
		System.out.println("Patch: "+version1.patch());
	}
}
