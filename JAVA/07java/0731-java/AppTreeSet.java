import java.util.* ;
public class AppTreeSet{
	public static void main(String[] args){
		System.out.println();
		List<Integer> allDice = new ArrayList<>() ;
		for( int i = 0 ; i < 10 ; i++ ){
			int n = new Random().nextInt(10)+1 ;
			allDice.add(n);
		}
		System.out.println(allDice);
		Set<Integer> squeezDice = new TreeSet<>(allDice) ;
		System.out.println();
		System.out.println(squeezDice);
	}
}