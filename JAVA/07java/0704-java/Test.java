import java.util.*;
public class Test{
	public static void main(String[] args){
		int[][] human = new int[2][] ;
		human[0] = new int[3] ;
		human[1] = new int[5] ;
		for( int i = 0 ; i < human.length ; i++ ){
			for( int j = 0 ; j < human[i].length ; j++ ){
				human[i][j] = new Random().nextInt(100);
				System.out.print(human[i][j]+" ");
			}
			System.out.println();
		}
	}
}