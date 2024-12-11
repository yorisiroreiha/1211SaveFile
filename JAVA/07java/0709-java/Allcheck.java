import java.util.*;
public class Allcheck{
	public static void main(String[] args){
		int[] number = new int[3] ;
		for( int i = 0 ; i < number.length ; i++ ){
			number[i] = new Random().nextInt(10);
			System.out.print(number[i]+" ");
		}
		System.out.println();
		System.out.printf("%s%n",isSame(number)?"アタリ":"ハズレ");
	}
	public static boolean isSame(int[] arr){
		for( int i : arr ){
			if( arr[0] != arr[i] ){
				return false ;
			}
		}
		return true ;
	}
}