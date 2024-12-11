public abstract class Monster{
	private String name;
	private int hp;
	public Monster(String name,int hp){
		this.name = name ;
		this.hp = hp ;
	}
	public abstract void Escape();
	public void Attack(){
		System.out.println(this.name+"は攻撃した");
	}
	public String getName(){
		return this.name ;
	}
	public int getHp (){
		return this.hp ;
	}
}