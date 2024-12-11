import java.util.*;
public class Areaantisort033{
	public static void main(String[] args){
		int[] number = {1,2,3,4,5,6,7,8,9,10} ;
		for( int i = 2 ; i < 5 ; i++ ){
			int temp = number[8-i] ;
			number[8-i] = number[i] ;
			number[i] = temp ;
		}
		System.out.println(Arrays.toString(number));
	}
}