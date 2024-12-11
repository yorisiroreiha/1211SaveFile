public class AppY{
	public static void main(String[] args){
		Y[] y = new Y[2];
		y[0] = new A();
		y[1] = new B();
		for( int i = 0 ; i < y.length ; i++ ){
			y[i].b();
		}
	}
}