package com.web;

import java.io.*;
import java.net.Socket;

public class Kehu {
	public static void main(String [] args){
		try{
			//��������
			Socket socket = new Socket("192.168.199.126",2347);
			System.out.println("�Ƿ�����"+socket.isConnected());
			OutputStream o = socket.getOutputStream();
			o.write("��������ɽ".getBytes());
			o.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
