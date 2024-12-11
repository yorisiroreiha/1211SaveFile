public class Wizard{
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	/*以下操作*/
	public Wizard(String name,int hp,int mp,Wand wand){
		setName(name) ;
		setHp(hp) ;
		setMp(mp) ;
		setWand(wand) ;
	}
	public String getName(){return this.name ;}
	public int getHp(){return this.hp ;}
	public int getMp(){return this.mp ;}
	public Wand getwand(){return this.wand ;}
	public void setName(String name){
		if( name.length() < 3 ){
			throw new IllegalArgumentException
			("error : name is short");
		}
		this.name = name ;
	}
	public void setHp(int hp){
		this.hp = Math.max( hp , 0 ) ;
	}
	public void setMp(int mp){
		if( mp < 0 ){
			throw new IllegalArgumentException
			("error : must mp is over 0");
		}
		this.mp = mp ;	}
	public void setWand(Wand wand){
		if( wand == null ){
			throw new IllegalArgumentException
			("error : can not have wand");
		}
		this.wand = wand ;
	}
	public void heal(Hero hh){
		int basePoint = 10 ;
		int recovPoint = ( (int)( basePoint * this.wand.getPower() ) );
		hh.setHp( hh.getHp() + recovPoint );
		System.out.println(hh.getName()+"のHPを"+recovPoint+"回復した！");
	}
}