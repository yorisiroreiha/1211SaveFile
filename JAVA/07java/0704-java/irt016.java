import java.util.*;
public class irt016{
	public static void main(String[] args){
		System.out.print("整数を入力");
		int make = new Scanner(System.in).nextInt();
		for( int i = 0 ; i < make ; i++ ){
			for(int j = 0 ; j < make-i-1 ; j++ ){
				System.out.print(" ");
			}
			for( int j = 0 ; j <= i ; j++ ){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}