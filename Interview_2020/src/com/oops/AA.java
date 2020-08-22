package com.oops;

public interface AA {
	public void a();
	public void b();
	public void c();
	public void d();
}
 abstract class BB implements AA{
	 public void c() {
		 System.out.println("I am CC");
	 }
 }
 class M extends BB{

	@Override
	public void a() {
		System.out.println("I am AA");
	}

	@Override
	public void b() {
		System.out.println("I am BB");
		
	}

	@Override
	public void d() {
		System.out.println("I am DD");
	}
	 
 }