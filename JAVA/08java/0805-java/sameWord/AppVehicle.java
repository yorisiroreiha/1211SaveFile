public class AppVehicle{
	public static void main(String[] args){
		Vehicle vcl = new Car() ;
		if( vcl instanceof Car car ){
			car.start();
			car.honk();
		}else{
			System.out.println(" Error : vcl is not Car ");
		}
		vcl.start(); // "Car starting" が表示される
	}
}
//2.:普通に"Car starting"が表示されるんじゃないの？