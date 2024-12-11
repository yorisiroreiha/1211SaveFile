import java.util.*;
public class Drop024{
	public static void main(String[] args){
		int[] number = {1,2,3,4,5,6,7,8,9,10} ;
		int[] drop = new int[5] ;
		for( int i = 2 ; i < 7 ; i++ ){
			drop[i-2] = number[i] ;
		}
		System.out.println(Arrays.toString(drop));
	}
}