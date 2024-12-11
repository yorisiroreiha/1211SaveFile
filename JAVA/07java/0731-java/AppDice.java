import java.util.* ;
public class AppDice{
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in) ;
		Set<Integer> dice = new HashSet<>() ;
		System.out.print("何回振りますか");
		int need = sca.nextInt();
		for( int i = 0 ; i < need ; i++ ){
			int n = new Random().nextInt(6)+1 ;
			System.out.println(n);
			dice.add(n);
		}
		if( dice.size() == 1 ){
			System.out.println("ゾロ目です");
		}else{
			System.out.println("ゾロ目ではありません");
		}
	}
}