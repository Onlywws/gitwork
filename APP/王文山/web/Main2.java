package com.web;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.*;
//������
public class Main2 {
	public static void main (String [] args){
		ServerSocket serversocket = null;//��������
		Socket socket =null;//��ʾ�ͻ���
		try{
			serversocket = new ServerSocket(4390);
			System.out.println("�����������ɹ����ȴ��ͻ�����");
			socket = serversocket.accept();//�ȴ��ͻ���
			System.out.println("���ӳɹ����ڶ�ȡ����");
			//���ܿͻ��˷���������
			InputStream inputstream = socket.getInputStream();
			int len = 0;
			byte [] bytes = new byte[1024];
			StringBuffer stringbuffer = new StringBuffer();
			while((len=inputstream.read(bytes))!=-1){
				stringbuffer.append(new String(bytes,0,len));
			}
			System.out.println("�ͻ��˷�����Ϣ��"+stringbuffer);
			String s = "���Ѿ��յ���Ϣ��"+stringbuffer.toString();
			
			//�����ݷ��͵��ͻ���
			System.out.println("������ͻ��˷�����Ϣ");
			OutputStream outputstream = socket.getOutputStream();
			outputstream.write(s.getBytes());
			
			outputstream.close();
			inputstream.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("�ر�����");
			if(socket!=null){
				if(socket.isConnected()){
					try {
						//socket.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			//�ر�����
			if(serversocket != null){
				if(serversocket.isClosed()){
					try {
						serversocket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}

	
