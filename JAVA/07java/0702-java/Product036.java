import java.util.*;
public class Product036{
	public static void main(String[] args){
		int[] number = {1,2,3,4,5} ;
		int product = 1 ;
		for( int i = 0 ; i < number.length ; i++ ){
			product *= number[i] ;
		}
		System.out.println(product);
	}
}