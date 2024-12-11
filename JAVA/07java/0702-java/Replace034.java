import java.util.*;
public class Replace034{
	public static void main(String[] main){
		int[] number = {1,2,3,2,4,2,5} ;
		for( int i = 0 ; i < number.length ; i++ ){
			if( number[i] == 2 ){
				number[i] = 0 ;
			}
		}
		System.out.println(Arrays.toString(number));
	}
}