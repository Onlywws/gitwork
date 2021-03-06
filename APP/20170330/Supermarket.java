import java.util.*;
public class Supermarket{
	public static void main(String [] args){
		menu();
	}
	static int i=0; 
	//属性
	static String goodname;
	static int goodamount;
	static double goodprice;
	static String goodkind;
	
	static Scanner sc = new Scanner(System.in);
	
	static Supermarket [] goods = new Supermarket[1000];

	//方法
	public static void menu(){
		System.out.println("-------------请选择------------");
		System.out.println("-----=========菜单========-----");
		System.out.println("----=======1.增加商品======----");
		System.out.println("----=======2.销售商品======----");
		System.out.println("----=======3.修改商品======----");
		System.out.println("----=======4.查询商品======----");
		System.out.println("----=======5.退出菜单======----");
		int a = sc.nextInt();
		switch(a){
			case 1:
				addgoods();
				break;
			case 2:
				salegoods();
				break;
			case 3:
				updategoods();
				break;
			case 4:
				selectgoods();
				break;
			case 5:
				exitmenu();
				break;
			default:
				System.out.println("输入有误，请重新输入");
				menu();
		}
	}

	//增加商品
	public static void addgoods(){
		boolean flag=true;
		while(true){
			System.out.println("请输入商品名称");
			String name = sc.next();
			System.out.println("请输入商品数量");
			int amount = sc.nextInt();
			System.out.println("请输入商品价格");
			double price = sc.nextDouble();
			System.out.println("请输入商品类型");
			String kind = sc.next();
			
			Supermarket good = new Supermarket(goodname,goodamount,goodprice,goodkind);
			goods[i]=good;	
			i++;
			System.out.println("1.录入完成，继续录入");
			System.out.println("2.返回菜单");
			int b = sc.nextInt();
			if(b==1){
				flag=true;
				addgoods();
			}else if(b==2){
				flag=false;
				menu();
			}else{
				System.out.println("输入有误，请重新输入");
				addgoods();
			}
		}
	}
	//销售商品
	public static void salegoods(){
		
	}
	//修改商品
	public static void updategoods(){
		System.out.println("===请输入要修改的商品==");
		String newname = sc.next();
		for(int p=0;p<goods.length;p++){
			if(goods[p]!=null && newname.equals(goods[p].goodname)){
				System.out.println("请输入商品名称");
				String name = sc.next();
				System.out.println("请输入商品数量");
				int amount = sc.nextInt();
				System.out.println("请输入商品价格");
				double price = sc.nextDouble();
				System.out.println("请输入商品类型");
				String kind = sc.next();
				Supermarket good = new Supermarket(goodname,goodamount,goodprice,goodkind);
				goods[p] = good;
				System.out.println("修改成功");
			}else{
				System.out.println("没有您输入的学生的资料，请重新输入");
			}
				System.out.println("===1.继续修改===");
				System.out.println("===2.返回菜单===");
				int l = sc.nextInt();
				if(l==1){
					updategoods();
				}else if(l==2){
					menu();
				 }
			}
	}

	//查询商品
	public static void selectgoods(){
		System.out.println("----1.指定查询----");
		System.out.println("----2.全部查询----");
		int j = sc.nextInt();
		if(j==1){
			System.out.println("输入你要查询的商品");
			String mingcheng = sc.next();
			for(Supermarket s:goods){
				if(s!=null && mingcheng.equals(s.goodname) ){
					s.speak();
				}
			}
		}else if(j==2){
			for(Supermarket s:goods){
				if(s!=null ){
					s.speak();
				}
			}
		}	
		System.out.println("--------1.继续查询----------");
		System.out.println("--------2.返回菜单----------");
		int h = sc.nextInt();
		if(h==1){
			selectgoods();
		}else if(h==2){
			menu();
		}else{
			System.out.println("输入有误");
		}
			
	}

	//退出菜单
	public static void exitmenu(){
		System.out.println("ByeBye!");
	}
	//输出内容
	public static void speak(){
		System.out.println("名称叫"+goodname+",数量有"+goodamount+",价格是"+goodprice+"种类为"+goodkind);
	}

	//构造器
	public Supermarket (String goodname,int goodamount,double goodprice,String goodkind){
		this.goodname=goodname;
		this.goodamount=goodamount;
		this.goodprice=goodprice;
		this.goodkind=goodkind;
	}
}