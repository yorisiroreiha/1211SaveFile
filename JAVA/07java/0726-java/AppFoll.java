public class AppFoll{
	public static void main(String[] args){
		Fool f = new Fool("fool",50);
		Matango m = new Matango();
		f.attack(m);
		f.talk();
		f.watch();
		f.hear();
		f.run();
	}
}