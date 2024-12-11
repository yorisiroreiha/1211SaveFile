import java.util.*;
public class Right017{
	public static void main(String[] args){
		int[] number = {1,2,3,4,5,6,7,8} ;
		for( int i = 0 ; i < number.length-1 ; i++ ){
			int temp = number[i] ;
			number[i] = number[number.length-1] ;
			number[number.length-1] = temp ; 
		}
		System.out.println(Arrays.toString(number));
	}
}