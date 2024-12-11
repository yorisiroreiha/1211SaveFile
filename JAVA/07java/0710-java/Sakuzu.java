import java.util.*;
public class Sakuzu{
	public static void main(String[] args){
		System.out.print("一文字入れてください＞");
		String transChar = new Scanner(System.in).next();
		char c = transChar.charAt(0);
		System.out.print("幅を入れてください＞");
		int width = new Scanner(System.in).nextInt();
		printSquare(c,width);
		
	}
	public static void printSquare(char c,int width){
		for( int i = 0 ; i < width ; i++ ){
			for( int j = 0 ; j < width ; j++ ){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}