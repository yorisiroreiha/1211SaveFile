import java.util.* ;
public class AppSword{
	public static void main(String[] args){
		String[] csvData={
			"魔神の斧,1500,20000",
			"はやぶさの剣,1000,30000",
			"エクスカリバー,3000,50000",
		};
		ArrayList<Sword> list = new ArrayList<>();
		for( int i = 0 ; i < csvData.length ; i++ ){
			String[] weapon = csvData[i].split(",");
			String name = weapon[0] ;
			int power = Integer.parseInt(weapon[1]);
			int price = Integer.parseInt(weapon[2]);
			list.add(new Sword(name,power,price));
		}
		for( int i = 0 ; i < list.size() ; i++ ){
			System.out.println(list.get(i));
		}
	}
}
class Sword{
	String name;
	int power;
	int price;
	public Sword(String name,int power,int price){
		this.name = name ;
		this.power = power ;
		this.price = price ;
	}
	public String toString(){
		return String.format("武器名:%s 攻撃力%d 価格%d",this.name,this.power,this.price);
	}
}