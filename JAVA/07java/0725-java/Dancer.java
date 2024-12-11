public class Dancer extends Character{
	int mp;
	public Dancer(String name,int hp,int mp){
		super(name,hp);
		this.mp = mp ;
	}
	public void dance(){
		System.out.printf("%sは踊った%n",this.name);
	}
	@Override
	public void attack(Matango m){
		m.hp -= 5;
		System.out.printf("%sは%sに%dのダメージを与えた%n",this.name,"matango",5);
	}
}