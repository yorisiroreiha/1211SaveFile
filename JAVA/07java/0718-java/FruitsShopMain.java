public class FruitsShopMain {
	public static void main(String[] args) {
		Fruits f1 = new Fruits("みかん",50) ;
		f1.showInfo(f1);
		Fruits f2 = new Fruits("りんご",150) ;
		f2.showInfo(f2);
	}
}
class Fruits{
	String name;
	int price;
	public Fruits(String n,int m){
		this.name = n ;
		this.price = m ;
	}
	public void showInfo(Fruits food){
		System.out.printf("なまえ：%s,価格：%d円%n",food.name,food.price);
	}
}