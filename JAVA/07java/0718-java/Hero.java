public class Hero{
	String name ;
	int maxHp ;
	int hp ;
	Sword weapon ;
	public Hero(){
		this.maxHp = 100 ;
		this.hp = this.maxHp ;
	}
	public Hero(String name){
		this.name = name ;
		this.maxHp = 100 ;
		this.hp = this.maxHp ;
	}
	public void sleep(){
		this.hp = this.maxHp ;
		System.out.println(this.name+"は、眠って回復した！");
	}
	public void slip(){
		this.hp -= 5 ;
		System.out.println(this.name+"は、転んだ！");
	}
	public void sit(int sec){
		int temp = this.hp ;
		this.hp = Math.min(this.hp+sec,this.maxHp) ;
		int recover = this.hp-temp ;
		System.out.printf("%sは%d座った%n",this.name,sec);
		System.out.printf("%dポイント回復した%n",recover);
	}
	public void run(){
		System.out.println(this.name+"は逃げ出した");
	}
	public void attack(){
		if( this.weapon == null ){
			System.out.println("素手でパンチした！1ポイントのダメージを与えた");
		}else{
			System.out.printf("%sで攻撃した。%dポイントのダメージを与えた%n",this.weapon.name,this.weapon.power);
		}
	}
}