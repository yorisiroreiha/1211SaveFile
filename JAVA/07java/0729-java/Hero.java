public class Hero{
	private String name;
	private int hp;
	private String job;
	private int mp;
	private int speed;
	private boolean isAlive;
	/*以下操作*/
	public Hero(String name,int hp){
		this.name = name ;
		this.hp = hp ;
	}
	public void sleep(){
		this.hp = 100 ;
		System.out.println(this.name+"は眠って回復した");
	}
	public String getName(){
		return this.name ;
	}
	public void setName(String name){
		if( name == null ){
			throw new IllegalArgumentException
			("error : name is null");
		}else if( name.length() <= 1 ){
			throw new IllegalArgumentException
			("error : name is so short");
		}else if( name.length() >= 8 ){
			throw new IllegalArgumentException
			("error : name is so long ");
		}
		this.name = name ;
	}
	public int getHp(){return this.hp ;}
	public void setHp(int hp){
		this.hp = Math.max(hp,0) ;
	}
	public String getJob(){
		return this.job ;
	}
	public void setJob(String job){
		this.job = job ;
	}
	public int getMp(){
		return this.mp ;
	}
	public void setMp(int mp){
		this.mp = mp ;
	}
	public int getSpeed(){
		return this.speed ;
	}
	public void setSpeed(){
		this.speed = speed ;
	}
	public boolean isAlive(){
		return this.isAlive ;
	}
	public void setAlive(boolean isAlive){
		this.isAlive = isAlive ;
	}
}