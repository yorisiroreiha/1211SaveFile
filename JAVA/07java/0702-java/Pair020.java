import java.util.*;
public class Pair020{
	public static void main(String[] args){
		int[] number = {1,2,3,4,5,3,2,1} ;
		int[] temp = new int[number.length] ;
		for( int i = 0 ; i < number.length ; i++ ){
			temp[i] = number[i] ;
			for( int j = 0 ; j < i ; j++ ){
				System.out.printf("%s",temp[i]==temp[j]?temp[j]+" ":"");
			}
		}
	}
}