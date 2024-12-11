import java.util.*;
public class Twin{
	public static void main(String[] args){
		int[][] one = new int[3][3] ;
		for( int i = 0 ; i < one.length ; i++ ){
			int sum = 0 ;
			for( int j = 0 ; j < one[i].length ; j++ ){
				one[i][j] = new Random().nextInt(10);
				System.out.print(one[i][j]+" ");
				sum += one[i][j] ;
			}
			System.out.printf("|%d",sum);
			System.out.println();
			//System.out.println(Arrays.toString(one[i]));
		}
		
	}
}