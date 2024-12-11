import java.util.*;
public class Last037{
	public static void main(String[] args){
		int[] number = {9,1,2,3,4,5,6,7,8,9,10} ;
		int count = 0 ;
		for( int i = 0 ; i < number.length ; i++ ){
			if( number[i] < 5 ){
				count++ ;
			}//else
		}
		int[] ans = new int[count];
		count = 0 ;
		for( int i = 0 ; i < number.length ; i++ ){
			if( number[i] < 5 ){
				for( int j = count ; j < ans.length ; j++ ){
					ans[j] = number[i] ;
				}
				count++ ;
			}//else
		}
		System.out.println(Arrays.toString(ans));
	}
}