import java.util.*;
public class Allzero028{
	public static void main(String[] args){
		int[] number = {1,2,3,4,5} ;
		for( int i = 0 ; i< number.length ; i++ ){
			number[i] = 0 ;
		}
		System.out.println(Arrays.toString(number));
	}
}