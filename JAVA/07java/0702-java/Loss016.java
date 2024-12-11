import java.util.*;
public class Loss016{
	public static void main(String[] args){
		int[] number = {1,2,3,4,5,6,7,8,9} ;
		for( int i = 0 ; i < number.length ; i++ ){
			number[i] %= 3 ;
		}
		System.out.println(Arrays.toString(number));
	}
}