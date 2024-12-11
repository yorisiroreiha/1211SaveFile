public class WeaponMain{
	public static void main(String[] args){
		Weapon w = new Weapon("w");
	}
}
class Item{
	String name;
	int price;
	public Item(String name){
		this.name=name;
		this.price =0;
	}
	public Item(String name,int price){
		this.name=name;
		this.price=price;
	}
}
class Weapon extends Item{
	public Weapon(String name){
		super(name);
	}
}