public abstract class Vehicle{
	int speed ;
	String color ;
	public Vehicle(int speed,String color){
		this.speed = speed ;
		this.color = color ;
	}
	public boolean start(){
		//エンジンの状態をtrue/falseで返す予定trueなら稼働中
		System.out.println("エンジンをかける");
		return true ;
	}
	public boolean stop(){
		//エンジンの状態をtrue/falseで返す予定falseなら停止中
		System.out.println("エンジンを止める");
		return false ;
	}
}