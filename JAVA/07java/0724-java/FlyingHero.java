public class FlyingHero extends Hero{
	boolean flying;
	public FlyingHero(String name){
		super(name);
		System.out.println("FlyingHero");
	}
	public void fly(){
		this.flying = true ;
		System.out.println("飛び上がった！");
	}
	public void land(){
		this.flying = false ;
		System.out.println("着地した！");
	}
	@Override
	public void run(){
		System.out.println("撤退した");
	}
	@Override
	public void attack(Matango m){
		super.attack(m);
		if( this.flying ){
			super.attack(m);
		}
	}
}