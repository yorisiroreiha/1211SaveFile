import java.util.*;
public class Ball{
	public static void main(String[] args){
		
		int[] ball = {1,2,3,4,5};
		Integer[] get = new Integer[ball.length];
		while(Arrays.asList(get).contains(null)){
			for( int i = 0 ; i < ball.length ; i++ ){
				int n = new Random().nextInt(ball.length);
				int tmp = ball[n] ;
				if( Arrays.asList(get).contains(5)){
				}else{
					get[i] = tmp ;
				}
			}
		}
		System.out.println(Arrays.toString(get));
	}
}