import java.util.*;
public class Hang{
	public static void main(String[] args){
		int[][] number = new int[9][9] ;
		for( int i = 0 ; i < number.length ; i++ ){
			for( int j = 0 ; j < number[i].length ; j++ ){
				number[i][j] = ( i+1 ) * ( j+1 ) ;
			}
		}
		for( int i = 0 ; i < number.length ; i++ ){
			for( int j = 0 ; j < number[i].length ; j++ ){
				System.out.printf("%3d",number[i][j]);
			}
			System.out.println();
		}
	}
}