package com.GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;


public class TextBen extends JFrame{
	public static void main(String [] args){
		new TextBen();
	}
	public TextBen(){	
		this.setLayout(null);
		this.setTitle("���±�");
		//����˵�
		JMenuBar jmenubar = new JMenuBar();
		
		JMenu jmenu = new JMenu();
		jmenu.setText("�ļ�");
		jmenu.setFont(new java.awt.Font("΢���ź�",0,18));
		JMenuItem jmenuitem = new JMenuItem();
		jmenuitem.setText("�½�");
		JMenuItem jmenuitem12 = new JMenuItem();
		jmenuitem12.setText("����");
		JMenuItem jmenuitem13 = new JMenuItem();
		jmenuitem13.setText("��");
		jmenu.add(jmenuitem);
		jmenu.add(jmenuitem12);
		jmenu.add(jmenuitem13);
		jmenubar.add(jmenu);
		
		jmenuitem12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				File file = new File("W:/JAVA/APP��ҵ/wws.txt");
				try {
					file.createNewFile();
					char [] cc = new char[10];
					String s = jtextarea.getText();
					FileWriter fw = new FileWriter(file);
					fw.write(s);
					fw.close();
					System.out.println(s+"����ɹ�");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			
			}
		});
		
		JMenu jmenu2 = new JMenu();
		jmenu2.setText("�༭");
		jmenu2.setFont(new java.awt.Font("΢���ź�",0,18));
		JMenuItem jmenuitem2 = new JMenuItem();
		jmenuitem2.setText("����");
		jmenu2.add(jmenuitem2);
		jmenubar.add(jmenu2);
		
		JMenu jmenu3 = new JMenu();
		jmenu3.setText("��ʽ");
		JMenuItem jmenuitem3 = new JMenuItem();
		jmenuitem3.setText("����");
		jmenu3.add(jmenuitem3);
		jmenubar.add(jmenu3);
		
		JMenu jmenu4 = new JMenu();
		jmenu4.setText("�鿴");
		JMenuItem jmenuitem4 = new JMenuItem();
		jmenuitem4.setText("����");
		jmenu4.add(jmenuitem4);
		jmenubar.add(jmenu4);

		JMenu jmenu5 = new JMenu();
		jmenu5.setText("����");
		JMenuItem jmenuitem5 = new JMenuItem();
		jmenuitem5.setText("����");
		jmenu5.add(jmenuitem5);
		jmenubar.add(jmenu5);
		
		JTextArea jtextarea = new JTextArea();
		jtextarea.setText("");
		jtextarea.setBounds(0,0,1960,1080);
		this.add(jtextarea);
		
		this.setJMenuBar(jmenubar);
		this.setBounds(400,400,400,400);
		this.setVisible(true);
	}
}
