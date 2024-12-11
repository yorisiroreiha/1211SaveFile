import java.util.*;
public class SearchNumber{
	public static void main(String[] args){
		System.out.print("正の整数＞＞");
		int number = new Scanner(System.in).nextInt();
		int[] search = new int[number];
		for( int i = 0 ; i < search.length ; i++ ){
			search[i] = i+1 ;
		}
		System.out.println(Arrays.toString(search));
	}
}