import java.util.*;
public class TestCounter{
	public static void main(String[] args){
		
		System.out.print("何人＞＞");
		int human = new Scanner(System.in).nextInt();
		int[] test = new int[human] ;
		for( int i = 0 ; i < test.length ; i++ ){
			System.out.printf("%d人目の点数>>",i+1);
			test[i] = new Scanner(System.in).nextInt();
		}
		System.out.println(Arrays.toString(test));
		
	}
}