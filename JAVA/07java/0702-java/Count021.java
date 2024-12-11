import java.util.*;
public class Count021{
	public static void main(String[] args){
		int[] number = {1,2,3,2,4,2,5} ;
		int count = 0 ;
		for( int i = 0 ; i < number.length ; i++){
			if( number[i] == 2 ){
				count++;
			}//else
		}
		System.out.println(count);
	}
}