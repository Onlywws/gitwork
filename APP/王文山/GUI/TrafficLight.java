package com.GUI;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Collator;
import java.util.concurrent.TimeUnit;
import javax.xml.stream.events.StartDocument;

public class TrafficLight extends JFrame {
	public static void main(String [] args){
		new TrafficLight();
		
	}
	public TrafficLight(){
		this.setLayout(null);//�����û������ϵ���Ļ���
		this.setTitle("��ͨ�źŵ�");//����
		this.setSize(400, 400);//��С
		this.setVisible(true);//�����Ƿ���ʾ
		
		JTextArea jtextarea = new JTextArea();
		jtextarea.setText("");
		jtextarea.setOpaque(true);
		jtextarea.setBounds(10,100,500,100);
		this.add(jtextarea);
		
		JButton jbutton1 = new JButton();//����ؼ�
		jbutton1.setText("��ʼ");//����
		jbutton1.setBounds(10, 10, 130, 50);//λ�ô�С
		jbutton1.setFont(new java.awt.Font("΢���ź�",0,18));//����
		this.add(jbutton1);
		
		jbutton1.addActionListener(
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						String s = jtextarea.getText();
						new Thread(
								new Runnable(){

									@Override
									public void run() {
										// TODO Auto-generated method stub
										while(true){
											try{
												Thread.sleep(3000);
												jtextarea.setText("���ͣ");
												jtextarea.setBackground(Color.red);
												Thread.sleep(3000);
												jtextarea.setText("�̵���");
												jtextarea.setBackground(Color.green);
												Thread.sleep(1000);
												jtextarea.setText("�Ƶ����˵�һ��");
												jtextarea.setBackground(Color.yellow);
											}catch(Exception e){
												e.printStackTrace();
											}
										}
									}
									
								}
								).start();
					}
					
				}
				
				);
			
	}
}
	



