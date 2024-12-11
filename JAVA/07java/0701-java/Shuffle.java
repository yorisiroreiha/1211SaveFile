import java.util.*;
public class Shuffle{
	public static void main(String[] args){
		int[] boll = {1,2,3,4,5};
		for( int i = 0 ; i < boll.length-1 ; i++ ){
			int n = new Random().nextInt(boll.length-i)+i;
			int temp = boll[n];
			boll[n] = boll[i];
			boll[i] = temp;
			
		}
		System.out.println(Arrays.toString(boll));
		
	}
}