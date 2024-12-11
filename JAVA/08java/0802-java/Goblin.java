public class Goblin extends Monster{
	public Goblin(char name,int hp){
		super("ゴブリン"+name,hp);
	}
	public void Escape(){
		System.out.println(this.getName()+"は一目散に逃げてった");
	}
}