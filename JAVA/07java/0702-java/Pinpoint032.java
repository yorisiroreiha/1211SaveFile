import java.util.*;
public class Pinpoint032{
	public static void main(String[] args){
		int[] number = {1,2,3,4,5} ;
		int count = 0 ;
		for( int i = 0 ; i < number.length ; i++ ){
			if( number[i] == 3 ){
				count++ ;
			}//else
		}
		int[] ans = new int[number.length-count] ;
		count = 0 ;
		for( int i = 0 ; i < ans.length ; i++ ){
			if( number[i] == 3 ){
				count++ ;
			}//else
			ans[i] = number[i+count] ;
		}
		System.out.println(Arrays.toString(ans));
	}
}