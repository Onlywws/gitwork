package com.GUI;

import javax.swing.JFrame;

public class TestMain extends JFrame {
	public TestMain(){
		this.setLayout(null);//�����û������ϵ���Ļ���
		
		TestPaint testpaint = new TestPaint();
		testpaint.setBounds(40,40,600,600);
		this.add(testpaint);
		
		this.setTitle("������");
		this.setBounds(200,200,650,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رճ���
		this.setVisible(true);
	}
	public static void main(String [] args){
		new TestMain();
	}
}
