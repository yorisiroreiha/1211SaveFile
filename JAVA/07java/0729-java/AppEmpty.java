import java.util.*;
public class AppEmpty{
	public static void main(String[] args){
		Empty e = new Empty();
		Empty e2 = e;
		if(e.equals(e2)){
			System.out.println("same date");
		}else{
			System.out.println("Another date");
		}
		String s = e.toString();
		System.out.println(s);
		Hero h1 = new Hero("ゼシカ",100);
		Hero h2 = new Hero("ゼシカ",100);
		if(h1.equals(h2)){
			System.out.println("same date");
		}else{
			System.out.println("Another date");
		}
		Date now = new Date();
		System.out.println(now);
	}
}
class Empty{}