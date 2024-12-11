import java.util.*;
public class Sharch012{
	public static void main(String[] args){
		int[] number = {1,2,3,4,5} ;
		int count = 0 ;
		for( int i = 0 ; i < number.length ; i++ ){
			count = i ;
			if( number[i] == 4 ){
				System.out.println(count);
				break;
			}//else
		}
	}
}