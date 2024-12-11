import java.util.*;
public class Fakerandom{
	public static void main(String[] args){
		System.out.print("名前を入力してください＞＞");
		String name = new Scanner(System.in).next();
		long seed = calcSeed(name);
		call(seed) ;
	}
	public static long calcSeed(String name){
		long seed = 0 ;
		for( int i = 0 ; i < name.length() ; i++ ){
			seed += name.charAt(i) ;
		}
		return seed ;
	}
	public static void call(long seed){
		for( int i = 0 ; i < 1000 ; i++ ){
			String[] fortunes = {"大吉","中吉","吉","凶"};
			seed++ ;
			int ans = new Random(seed).nextInt(fortunes.length);
			System.out.printf("%sさんの運勢は%sです%n","re",fortunes[ans]);
		}
	}
}