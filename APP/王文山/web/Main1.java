package com.web;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

public class Main1 {
	public static void main(String [] args){
		Socket socket = null;
		try{
			System.out.println("�������ӷ�����");
			socket = new Socket("192.168.199.126",4390);
			String s = "hello";
			//���������������
			System.out.println("���ӳɹ������������������");
			OutputStream outputstream = socket.getOutputStream();
			outputstream.write(s.getBytes());
			outputstream.flush();			
			//outputstream.close();
			socket.shutdownOutput();
			//���ܷ�������������
			System.out.println("���ڽ��ܷ��������ص���Ϣ");
			InputStream inputstream = socket.getInputStream();
			int len = 0;
			byte[] bytes = new byte[1024];
			StringBuffer stringbuffer = new StringBuffer();
			while((len = inputstream.read(bytes))!=-1){
				stringbuffer.append(new String(bytes,0,len));
			}
			System.out.println("�������˷�������Ϣ��"+stringbuffer);
			
			outputstream.close();
			inputstream.close();
	
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(socket != null){
				if(socket.isConnected()){
					try {
						//socket.close();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
