import java.util.*;
public class Sum{
	public static void main(String[] args){
		data({2,3,4});
		int[] number = {3,4,5} ;
		arraySum(number);
	}
	public static void arraySum(int[] data){
		int sum = 0 ;
		for( int n : data ){
			sum += n ;
		}
		System.out.printf("合計は%dです",sum);
	}
}