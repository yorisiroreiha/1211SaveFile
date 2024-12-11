import java.util.*;
public class Spell{
	public static void main(String[] args){
		System.out.print("文字列：");
		String word = new Scanner(System.in).nextLine();
		System.out.print("実行回数：");
		int count = new Scanner(System.in).nextInt();
		roop(word,count);
	}
	public static void roop(String word,int count){
		for( int i = 0 ; i < count ; i++ ){
			System.out.println(word);
		}
	}
}