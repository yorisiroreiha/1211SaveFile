public class Thief{
	String name ;
	int maxHp ;
	int hp ;
	int mp ;
	public Thief(String name,int maxHp,int mp){
		this.name = name ;
		this.maxHp = maxHp ;
		this.hp = this.maxHp ;
		this.mp = mp ;
	}
	public Thief(String name){
		this(name,maxHp);
		maxHp = 40 ;
	}
	public Thief(String name,int maxHp){
		this(name,maxHp,mp);
		mp = 5 ;
	}
}