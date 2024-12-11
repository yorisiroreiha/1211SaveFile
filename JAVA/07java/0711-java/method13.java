import java.util.*;
public class method13{
	public static void main(String[] args){
		int[] arr1 = {1,2,3} ;
		int[] arr2 = {4,5,6,7} ;
		int[] mergedArr = arrMerge(arr1,arr2);
		System.out.println(Arrays.toString(mergedArr));
	}
	public static int[] arrMerge(int[] arr1, int[] arr2){
		int[] mergedArr = new int[arr1.length+arr2.length] ;
		for( int i = 0 ; i < arr1.length ; i++ ){
			mergedArr[i] = arr1[i];
		}
		for( int i = 0 ; i < arr2.length ; i++ ){
			mergedArr[i+arr1.length] = arr2[i] ;
		}
		return mergedArr ;
	}
}