import java.util.*;
public class Delete030{
	public static void main(String[] args){
		int[] number = {1,2,3,4,5,6,7,8,9,10} ;
		int[] pair ;
		int count = 0 ;
		int completion = 0 ;
		
		for( int i = 0 ; i < number.length ; i++ ){
			if( number[i] % 2 == 1 ){
				count++ ;
			}//else
		}
		pair = new int[count] ;
		count = 0 ;
		for( int i = 0 ; i < number.length ; i++ ){
			if( number[i] % 2 == 1 ){
				count++ ;
				for( int j = completion ; j < count ; j++ ){
					completion++ ;
					pair[j] = number[i] ;
				}
			}//else
		}
		System.out.println(Arrays.toString(pair));
	}
}