import java.util.*;
public class Shuffle022{
	public static void main(String[] args){
		int[] number = {1,2,3,4,5} ;
		for( int i = 0 ; i < number.length/2 ; i++ ){
			int n = new Random().nextInt(number.length-i)+i;
			int temp = number[i] ;
			number[i] = number[n] ;
			number[n] = temp ;
		}
		System.out.println(Arrays.toString(number));
	}
}