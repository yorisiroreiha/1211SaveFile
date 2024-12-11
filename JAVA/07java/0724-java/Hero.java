import java.util.*;
public class Hero{
	String name;
	int hp;
	public Hero(String name){
		System.out.println("Hero");
		this.name = name ;
		this.hp = 100 ;
	}
	public void attack(Matango m){
		System.out.println("kougeki");
		m.hp -= 5 ;
		System.out.println("mni-5");
	}
	public void run(){
		System.out.println("tousou");
	}
}
class Matango{
	int hp = 10 ;
}