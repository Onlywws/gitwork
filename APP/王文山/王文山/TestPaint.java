package com.GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JComponent;

public class TestPaint extends JComponent implements MouseListener{
	
	java.util.List<Wuziqi> pointList = new ArrayList<Wuziqi>();
	
	private boolean isHei = true;
	private int currentX = 0;
	private int currentY = 0;
	
	//������
	public TestPaint(){
		this.addMouseListener(this);
	}
	
	//�Զ���ؼ�
	public void paint(Graphics g){
		//��������
		for(int i = -1;i<10;i++){
			g.drawLine(20, (i*50+70), 520,(i*50+70) );
			g.drawLine((i*50+70),20 , (i*50+70),520 );
		}
		
		//��������
		for(Wuziqi p : pointList){
			g.setColor(p.getColor());
			g.fillOval(p.getX(),p.getY(),p.POINT_size,p.POINT_size);
		}
		
		//�ж���Ӯ
		isWin();
		
	}
	
	
	//�ж���Ӯ�Ĺ���
	public void isWin(){
		int dongxi = 0;
		//��
		for(int nowX = currentX,i=0;i<5&&nowX<=520;nowX+=50,i++){
			Wuziqi point = findPoint(nowX,currentY);
			if(point!=null){
				if(isHei!=true){
					if(point.getColor()==Color.black){
						dongxi++;
					}else{
						break;
					}
				}
				if(isHei!=false){
					if(point.getColor()==Color.white){
						dongxi++;
					}else{
						break;
					}
				}
			}
		}
		if(dongxi>5){
			if(isHei != true){
				System.out.println("����Ӯ");
			}else{
				System.out.println("����Ӯ");
			}
		}
	
		
		//��
		for(int nowX = currentX,i=0;i<5&&nowX>=0;nowX-=50,i++){
			Wuziqi point = findPoint(nowX,currentY);
			if(point!=null){
				if(isHei!=true){
					if(point.getColor()==Color.black){
						dongxi++;
					}else{
						break;
					}
				}
				if(isHei!=false){
					if(point.getColor()==Color.white){
						dongxi++;
					}else{
						break;
					}
				}
			}
		}
		if(dongxi>5){
			if(isHei != true){
				System.out.println("����Ӯ");
			}else{
				System.out.println("����Ӯ");
			}
		}
		
		
		//��
		int nanbei = 0;
		
		for(int nowX = currentX,i=0;i<5&&nowX<=520;nowX+=50,i++){
			Wuziqi point = findPoint(nowX,currentY);
			if(point!=null){
				if(isHei!=true){
					if(point.getColor()==Color.black){
						nanbei++;
					}else{
						break;
					}
				}
				if(isHei!=false){
					if(point.getColor()==Color.white){
						nanbei++;
					}else{
						break;
					}
				}
			}
		}
		if(nanbei>5){
			if(isHei != true){
				System.out.println("����Ӯ");
			}else{
				System.out.println("����Ӯ");
			}
		}
		//��
		for(int nowX = currentX,i=0;i<5&&nowX>=0;nowX-=50,i++){
			Wuziqi point = findPoint(nowX,currentY);
			if(point!=null){
				if(isHei!=true){
					if(point.getColor()==Color.black){
						nanbei++;
					}else{
						break;
					}
				}
				if(isHei!=false){
					if(point.getColor()==Color.white){
						nanbei++;
					}else{
						break;
					}
				}
			}
		}
		if(nanbei>5){
			if(isHei != true){
				System.out.println("����Ӯ");
			}else{
				System.out.println("����Ӯ");
			}
		}
		
		
		int dongbeixinan = 0;
		//����
		for( int nowX = currentX , nowY = currentY,i=0 ; i<5 && nowY>=0 && nowX<=520;i++,nowX+=50){
			Wuziqi point = findPoint(nowX,nowY); 
			if(point!=null){
				if(isHei!=true){
					if(point.getColor()==Color.black){
						dongbeixinan++;
					}else{
						break;
					}
				}
				if(isHei!=false){
					if(point.getColor()==Color.white){
						dongbeixinan++;
					}else{
						break;
					}
				}
			}
		}
		if(dongbeixinan>5){
			if(isHei != true){
				System.out.println("����Ӯ");
			}else{
				System.out.println("����Ӯ");
			}
		}
		
		
		//����
		for( int nowX = currentX-50 , nowY = currentY-50,i=0 ; i<5 && nowY<=520 && nowX>=0;i++,nowX-=50){
			Wuziqi point = findPoint(nowX,nowY); 
			if(point!=null){
				if(isHei!=true){
					if(point.getColor()==Color.black){
						dongbeixinan++;
					}else{
						break;
					}
				}
				if(isHei!=false){
					if(point.getColor()==Color.white){
						dongbeixinan++;
					}else{
						break;
					}
				}
			}
		}
		if(dongbeixinan>5){
			if(isHei != true){
				System.out.println("����Ӯ");
			}else{
				System.out.println("����Ӯ");
			}
		}
		
		
		
		
	}
	
	//�ҵ�
	
	public Wuziqi findPoint(int x,int y ){
		//boolean isHave = false;
		for(Wuziqi p :pointList){
			if(p.getX()== x && p.getY() == y){
				//isHave = true;
				return p ;
			}
		}return null;
		
	}
	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("����"+e.getX()+"\t"+e.getY());
		int x = e.getX();
		int y = e.getY();
		//�������һ������
		double xianx = Math.round(x-20)/50.0;
		double xiany = Math.round(y-20)/50.0;
		//System.out.println("�ڼ�����"+xian+"\t"+Math.round(xian));
		x=((int)xianx)*50;
		y=((int)xiany)*50;
		currentX = x;//��¼��ǰ����λ��
		currentY = y;//��¼��ǰ����λ��
		boolean isHave = false;
		for (Wuziqi p : pointList) {
			if (p.getX() == x && p.getY() == y) {
				isHave = true;
			}
		}

		if(!isHave){
			Wuziqi point = new Wuziqi(x,y);
			
			if (isHei == true){
				//����
				point.setColor(Color.black);
				isHei = false;
			}else{
				//����
				point.setColor(Color.white);
				
				isHei = true;
			}
			pointList.add(point);
			//�û����������»�
			this.repaint();
			
		}
		System.out.println("Ŀǰ������"+pointList.size());
		
		//int x = e.getX()-Wuziqi.POINT_size/2;
		//int y = e.getY()-Wuziqi.POINT_size/2;
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
