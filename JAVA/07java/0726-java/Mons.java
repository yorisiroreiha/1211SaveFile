public abstract class Mons{
	public abstract void run();
}
class Slime extends Mons{
	int hp = 5 ;
	@Override
	public void run(){	System.out.println("体をうねらせて");}
}
class Goblin extends Mons{
	int hp = 20 ;
	@Override
	public void run(){	System.out.println("腕を振って");}
}
class DeathBat extends Mons{
	int hp = 10 ;
	@Override
	public void run(){	System.out.println("羽ばたいて");}
}
class Necromancer extends Mons implements Droper{
	int hp;
	public Necromancer(int hp){
		this.hp = hp ;
	}
	@Override
	public void drop(){	System.out.println("術符を落とした");}
	public void run(){	System.out.println("屍を大量生成して退散した");}
}
interface Droper{
	void drop();
}
