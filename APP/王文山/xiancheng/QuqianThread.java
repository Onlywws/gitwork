package com.xiancheng;


public class QuqianThread implements Runnable{
	private Zhuanghu zhuanghu;
	private int money;
	public QuqianThread(Zhuanghu zhuanghu,int money){
		this.zhuanghu = zhuanghu;
		this.money = money;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
		synchronized (zhuanghu) {	
			if(zhuanghu.getNumber()>=money){
				zhuanghu.setNumber(zhuanghu.getNumber()-money);
				System.out.println("ȡǮ�ɹ���ȡ��"+money+"Ԫ�������"+zhuanghu.getNumber());
			}else{
				System.out.print("����,��ʣ"+zhuanghu.getNumber()+"��"+(money-zhuanghu.getNumber()));
			}
		}
	}


	private void Synchronized(Zhuanghu zhuanghu2) {
		// TODO Auto-generated method stub
		
	}
	
}
