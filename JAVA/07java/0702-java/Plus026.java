import java.util.*;
public class Plus026{
	public static void main(String[] args){
		int[] number = {1,2,3,4,5} ;
		for( int i = 0 ; i < number.length ; i++ ){
			number[i]++ ;
		}
		System.out.println(Arrays.toString(number));
	}
}