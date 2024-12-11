import java.util.*;
public class AppHero{
	public static void main(String[] args){
		FlyingHero fh = new FlyingHero("a");
		Matango m = new Matango();
		fh.attack(m);
		fh.fly();
		fh.attack(m);
		fh.land();
		fh.run();
	}
}