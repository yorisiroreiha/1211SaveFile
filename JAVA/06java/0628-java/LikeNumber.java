import java.util.*;
public class LikeNumber{
	public static void main(String[] args){
		
		System.out.print("好きな自然数は＞＞");
		int like = new Scanner(System.in).nextInt();
		int[] number = new int[like] ;
		for( int i = 0 ; i < number.length ; i++ ){
			number[i] = like ;
		}
		System.out.println(Arrays.toString(number));
		
	}
}