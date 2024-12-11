import java.util.* ;
public class AppNumberCount{
	public static void main(String[] args){
		Map<Integer,Integer> numbers = new TreeMap<>() ;
		System.out.println();
		for( int i = 0 ; i < 100 ; i++ ){
			int number = new Random().nextInt(100)+1 ;
			if( numbers.containsKey(number) ){
				numbers.put(number,numbers.get(number)+1);
			}else{
				numbers.put(number,1);
			}
		}
		System.out.println("***result***");
		System.out.println(numbers.size()+"種類の数値がでました");
		for( int key : numbers.keySet() ){
			System.out.printf("%d...%d%n",key,numbers.get(key));
		}
	}
}