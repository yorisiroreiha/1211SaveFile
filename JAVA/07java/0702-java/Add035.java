import java.util.*;
public class Add035{
	public static void main(String[] main){
		int[] number = {1,2,4,5} ;
		int[] ans = new int[number.length+1] ;
		int count = 0 ;
		for( int i = 0 ; i < ans.length ; i++ ){
			if( i == 2 ){
				count++ ;
				ans[i] = 3 ;
			}else{
				ans[i] = number[i-count] ;
			}
		}
		System.out.println(Arrays.toString(ans));
	}
}