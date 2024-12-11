import java.util.*;
public class word{
	public static void main(String[] args){
		System.out.print("半角英数で文字を打ち込んでください＞＞");
		String word = new Scanner(System.in).nextLine();
		decoration(word);
		System.out.printf("*%s*%n",word);
		decoration(word);
	}
	public static void decoration(String word){
		System.out.print("**");
		for( int i = 0 ; i < word.length() ; i++ ){
			System.out.print("*");
		}
		System.out.println(); 
	}
}