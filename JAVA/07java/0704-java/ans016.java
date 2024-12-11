import java.util.*;
public class ans016{
	public static void main(String[] args){
		System.out.print("整数を入力＞＞");
		int make = new Scanner(System.in).nextInt();
		for( int i = 0 ; i < make ; i++ ){
			for( int j = 0 ; j < make-i ; j++ ){
				System.out.printf("%s",-i+j>0?"*":" ");
			}
			System.out.println();
		}
	}
}