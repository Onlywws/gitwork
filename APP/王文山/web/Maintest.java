package com.web;

import java.io.*;
import java.net.*;
import java.util.*;

public class Maintest {
	public static void main(String [] args){
		try{
			//����������������ͨע��˿�
			ServerSocket serversocket = new ServerSocket(2347);
			while(true){
				System.out.println("�������˴����ɹ�");    
				//������Ӧ�˿�    
				Socket socket = serversocket.accept();
				System.out.println("���ڼ����˿�");
				//�����ͻ��˵���Ϣ
				InputStream inputstream = socket.getInputStream();
				//���������ſͻ��˵���Ϣ
				byte [] bytes = new byte[1024];
				int len = 0;
				
				StringBuffer stringbuffer = new StringBuffer();
				while ((len = inputstream.read(bytes))!=-1){
					stringbuffer.append(new String(bytes,0,len));
				}
				System.out.println("�������ˣ����Ǹ���ģ�");
				System.out.println("�ͻ��ˣ�"+stringbuffer);
				//���IP��ַ
				String address = new String(socket.getInetAddress().getHostAddress());
				System.out.println("����Ҫ������,��ַ��"+address);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
