import java.util.*;
public class Move017{
	public static void main(String[] args){
		int[] number = {1,2,3,4,5} ;
		int[] temp = new int[number.length] ;
		for( int i = 0 ; i < number.length ; i++ ){
			temp[i] = number[i] ;
		}
		for( int i = 0 ; i < number.length ; i++ ){
			if( i == 0){
				number[i] = temp[temp.length-1] ;
			}else{
				number[i] = temp[i-1] ;
			}
		}
		System.out.println(Arrays.toString(number));
	}
}