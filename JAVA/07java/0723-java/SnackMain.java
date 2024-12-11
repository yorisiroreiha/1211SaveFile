import java.util.*;
public class SnackMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Snack> snacks = new ArrayList<>();
		while(true){
			System.out.print("菓子名>>");
			String name = sc.next();
			if( name.equals("E") || name.equals("e") ){
				break;
			}
			System.out.print("価格>>");
			int price = sc.nextInt();
			snacks.add(new Snack(name,price));
		}
		System.out.println("[-お菓子一覧-]");
		int sum = 0 ;
		for( Snack s : snacks ){
			s.showInfo();
			sum += s.price ;
		}
		System.out.println(sum);
	}
}
class Snack{
	String name;
	int price;
	public Snack(String name,int price){
		this.name = name ;
		this.price = price ;
	}
	public void showInfo(){
		System.out.printf("菓子名:%s,価格%d%n",this.name,this.price);
	}
}