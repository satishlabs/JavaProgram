package com.company.smiths;

public class Test6 {
	private Demo d;
	void start() {
		d = new Demo();
		this.takeDemo(d);
	}
	void takeDemo(Demo demo) {
		demo = null;
		demo = new Demo();
	}
}
