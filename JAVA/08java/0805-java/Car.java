public class Car extends Vehicle{
	private String brand ;
	public Car(int speed,String color,String brand){
		super(speed,color);
		this.brand = brand ;
	}
	public void honk(){
		System.out.println("クラクションを鳴らす");
	}
	/*
	//合ってるか自信なかったけど、こっちのが良き？
	public String honk(){
		return String s = "クラクションを鳴らす" ;
	}
	*/
}