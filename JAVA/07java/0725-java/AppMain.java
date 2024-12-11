public class AppMain{
	public static void main(String[] args){
		Dancer d = new Dancer("nya",5,10);
		Matango m = new Matango();
		d.attack(m);
		d.run();
		d.dance();
	}
}