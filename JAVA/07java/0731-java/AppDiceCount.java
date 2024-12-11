import java.util.* ;
public class AppDiceCount{
	public static void main(String[] args){
		System.out.print("サイコロを何回ふりますか>");
		int need = new Scanner(System.in).nextInt();
		Map<Integer,Integer> data = new LinkedHashMap<>() ;
		for( int i = 1 ; i <= 6 ; i++ ){
			data.put(i,0);
		}
		for( int i = 0 ; i < need ; i++ ){
			int dice = new Random().nextInt(6)+1;
			data.put(dice,data.get(dice)+1);
		}
		System.out.println("result");
		for( int key : data.keySet() ){
			System.out.printf("%dは%d回%n",key,data.get(key));
		}
	}
}