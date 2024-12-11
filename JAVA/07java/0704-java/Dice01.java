import java.util.*;
public class Dice01{
	public static void main(String[] args){
		int[] roll = new int[5] ;
		int count = 0 ;
		int shutout = 0 ;
		int[] save = new int[5] ;
		for( int i = 0 ; i < roll.length ; i++ ){
			roll[i] = new Random().nextInt(6)+1 ;
			count++ ;
			if( roll[i] == 1 ){
				shutout++ ;
				save[shutout-1] = count ;
			}
		}
		System.out.println(Arrays.toString(roll));
		if( shutout > 0 ){
			System.out.print("1が出たのは");
			for( int i = 0 ; i < shutout ; i++ ){
				System.out.printf("%s",shutout==i+1?save[i]+"回目":save[i]+"回目と");
			}
				System.out.println("です。");
		}else{
				System.out.println("1は出ませんでした。");
		}
	}
}