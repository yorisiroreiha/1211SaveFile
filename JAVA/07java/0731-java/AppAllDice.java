import java.util.* ;
public class AppAllDice{
	public static void main(String[] args){
		int count = 0 ;
		Set<Integer> dice = new HashSet<>() ;
		while(true){
			count++ ;
			int n = new Random().nextInt(6)+1;
			System.out.println(n);
			dice.add(n);
			if( dice.size() >= 6){break;}
		}
		System.out.printf("%d回で揃いました",count);
	}
}