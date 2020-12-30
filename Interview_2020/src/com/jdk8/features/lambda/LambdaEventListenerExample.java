package com.jdk8.features.lambda;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LambdaEventListenerExample {
	public static void main(String[] args) {
		JTextField tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		
		JButton jb = new JButton("click");
		jb.setBounds(80, 100, 70, 30);
		
		jb.addActionListener(e ->{
			tf.setText("Hello Swing");
		});
		
		JFrame jf = new JFrame();
		jf.add(tf);
		jf.add(jb);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setLayout(null);
		jf.setSize(300, 200);
		jf.setVisible(true);
	}
}
