import java.util.*;
public class Check{
	public static void main(String[] args){
		System.out.print("整数：");
		int number = new Scanner(System.in).nextInt();
		System.out.printf("実行結果は%dです。",check(number));
	}
	public static int check(int number){
		if( number == 0 ){
			return 0 ;
		}else if( number < 0 ){
			return -1 ;
		}else{
			return 1 ;
		}
	}
}