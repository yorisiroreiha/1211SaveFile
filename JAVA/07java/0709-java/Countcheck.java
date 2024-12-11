import java.util.*;
public class Countcheck{
	public static void main(String[] args){
		int[][] number = new int[3][3] ;
		for( int i = 0 ; i < number.length ; i++ ){
			for( int j = 0 ; j < number[i].length ; j++ ){
				number[i][j] = new Random().nextInt(4);
			}
			System.out.println(Arrays.toString(number[i]));
		}
		System.out.println();
		int count = 0 ;
		for( int i = 0 ; i < number.length ; i++ ){
			if(isSame(number[i])){
				count++ ;
			}//else
		}
		System.out.printf("%s%n",isCount(count)?count+"回当たりました":"ハズレ");
	}
	public static boolean isSame(int[] arr){
		for( int i : arr ){
			if( arr[0] != i ){
				return false ;
			}
		}
		return true ;
	}
	public static boolean isCount(int n){
		return n>0?true:false ;
	}
}