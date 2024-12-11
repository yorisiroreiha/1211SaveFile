import java.util.*;
public class Shoujun{
	public static void main(String[] args){
		
		System.out.print("要素数");
		int many = new Scanner(System.in).nextInt();
		int[] number = new int[many] ;
		for( int i = 0 ; i < number.length ; i++ ){
			number[i] = new Random().nextInt(101);
		}
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
		int[] reverseNumber = new int[many] ;
		for( int i = 0 ; i < number.length ; i++ ){
			reverseNumber[i] = number[number.length-i-1] ;
		}
		System.out.println(Arrays.toString(reverseNumber));
		
	}
}