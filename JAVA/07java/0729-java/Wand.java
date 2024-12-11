public class Wand{
	private String name;
	private double power;
	/*以下操作*/
	public Wand(String name,double power){
		setName(name) ;
		setPower(power) ;
	}
	public String getName(){
		return this.name ;
	}
	public void setName(String name){
		if( name.length() < 3 ){
			throw new IllegalArgumentException
			("error : name is short");
		}
		this.name = name ;
	}
	public double getPower(){
		return this.power ;
	}
	public void setPower(double power){
		if( power < 0.5 || power > 100 ){
			throw new IllegalArgumentException
			("error : power is over or low , can set 0.5-100");
		}
		this.power = power ;
	}
}