public abstract class Character{
	String name;
	int hp;
	public Character(String name,int hp){
		this.name = name ;
		this.hp = hp ;
	}
	public abstract void attack(Matango m);
}
class Matango{
	int hp = 50;
}