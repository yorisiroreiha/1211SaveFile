public abstract class Character{
	String name;
	int hp;
	public Character(String name,int hp){
		this.name = name ;
		this.hp = hp;
	}
	public abstract void attack(Matango m);
	public void run(){
		System.out.printf("%sは逃げ出した",this.name);
	}
}
class Matango{
	int hp = 10 ;
}