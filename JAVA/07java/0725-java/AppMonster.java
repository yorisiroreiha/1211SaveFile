public class AppMonster{
	public static void main(String[] args){
		Goblin g = new Goblin(20,10);
		WarWolf ww = new WarWolf(40,5);
		DeathBat db = new DeathBat(5,500);
		g.attack();
		g.run();
		ww.attack();
		ww.run();
		db.attack();
		db.run();
	}
}
abstract class Monster{
	int hp;
	int mp;
	public Monster(int hp,int mp){
		this.hp = hp;
		this.mp = mp;
	}
	public abstract void attack();
	public abstract void run();
}
abstract class WalkingMonster extends Monster{
	WalkingMonster(int hp,int mp){
		super(hp,mp);
	}
	@Override
	public void run(){
		System.out.println("とことこ歩いて逃げる");
	}
}
abstract class FlyingMonster extends Monster{
	FlyingMonster(int hp,int mp){
		super(hp,mp);
	}
	@Override
	public void run(){
		System.out.println("ばさばさ飛んで逃げる");
	}
}
class Goblin extends WalkingMonster{
	Goblin(int hp,int mp){
		super(hp,mp);
	}
	@Override
	public void attack(){
		System.out.println("刃物で攻撃");
	}
}
class WarWolf extends WalkingMonster{
	WarWolf(int hp,int mp){
		super(hp,mp);
	}
	@Override
	public void attack(){
		System.out.println("噛みつく");
	}
}
class DeathBat extends FlyingMonster{
	DeathBat(int hp,int mp){
		super(hp,mp);
	}
	@Override
	public void attack(){
		System.out.println("突っつく");
	}
}