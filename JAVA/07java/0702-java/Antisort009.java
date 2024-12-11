import java.util.*;
public class Antisort009{
	public static void main(String[] args){
		int[] number = {1,2,3,4,5} ;
		Arrays.sort(number);
		int many = number.length ;
		for( int i = 0 ; i < many/2 ; i++ ){
			int temp = number[many-i-1] ;
			number[many-i-1] = number[i] ;
			number[i] = temp ;
		}
		System.out.println(Arrays.toString(number));
	}
}