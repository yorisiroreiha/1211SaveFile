import java.util.*;
public class Clonearray{
	public static void main(String[] args){
		int[] array = {10,20,30} ;
		System.out.println(Arrays.toString(copyArea(array)));
	}
	public static int[] copyArea(int[] array){
		int[] secondArray = new int[array.length] ;
		for( int i = 0 ; i < secondArray.length ; i++ ){
			secondArray[i] = array[i] ;
		}
		return secondArray ;
	}
}