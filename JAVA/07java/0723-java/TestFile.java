import java.util.*;
public class TestFile{
	public static void main(String[] args){
		ArrayList<Vegetable> list = new ArrayList<>();
		Vegetable v1 = new Vegetable("トマト",50);
		list.add(v1);
		list.add(new Vegetable("レタス",150));
		list.add(3,new Vegetable("ピーマン",60));
		for( Vegetable n : list ){
			n.showInfo();
		}
		Collections.sort(list,(o1,o2)->o1.price-o2.price);
		for( Vegetable n : list ){
			n.showInfo();
		}
		Collections.sort(list,(o1,o2)->o1.name.compareTo(o2.name));
		for( Vegetable n : list ){
			n.showInfo();
		}
	}
}
class Vegetable{
	String name;
	int price;
	public Vegetable(String name,int price){
		this.name = name ;
		this.price = price ;
	}
	public void showInfo(){
		System.out.printf("名前：%s価格：%d%n",this.name,this.price);
	}
}