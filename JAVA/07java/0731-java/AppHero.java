import java.util.* ;
public class AppHero{
	public static void main(String[] args){
		List<Hero> hList = new ArrayList<>() ;
		Map<Hero,Integer> killHero = new HashMap<>() ;
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		hList.add(h1);
		hList.add(h2);
		for( Hero h : hList ){
			System.out.println(h.getName());
		}
		killHero.put(h1,3);
		killHero.put(h2,7);
		for( Hero n : killHero.keySet() ){
			System.out.printf("%sの倒した敵・・%d体%n",n.getName(),killHero.get(n));
		}
	}
}
class Hero{
	private String name;
	public Hero(String name){		this.name = name ;	}
	public String getName(){		return this.name ;	}
}