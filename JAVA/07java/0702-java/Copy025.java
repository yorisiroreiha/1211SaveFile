import java.util.*;
public class Copy025{
	public static void main(String[] args){
		int[] number = {1,2,3,4,5,6,7,8,9,10} ;
		int[] copy = new int[5] ;
		for( int i = 2 ; i < 7 ; i++){
			copy[i-2] = number[i] ;
		}
		System.out.println(Arrays.toString(copy));
	}
}