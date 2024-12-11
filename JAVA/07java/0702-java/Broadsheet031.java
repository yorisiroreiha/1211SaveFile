import java.util.*;
public class Broadsheet031{
	public static void main(String[] args){
		int[] number = {1,2,3,2,1} ;
		int count = 0 ;
		for( int i = 0 ; i < number.length/2 ; i++ ){
			if( number[i] == number[number.length-1-i]){
				count++ ;
			}//else
		}
		System.out.printf("%s%n",count==number.length/2?"Yes":"No");
	}
}