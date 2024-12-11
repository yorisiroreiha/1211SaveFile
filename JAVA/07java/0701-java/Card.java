import java.util.*;
public class Card{
	public static void main(String[] args){
		int[] card = {1,2,3,4,5,6,7,8,9,10};
		Integer[] get = new Integer[3];
		int guess = new Random().nextInt(10)+1;
		for( int i = 0 ; i < 3 ; i++ ){
			int n = new Random().nextInt(card.length-i)+i;
			int temp = card[n] ;
			card[n] = card[i] ;
			card[i] = temp ;
			get[i] = card[i] ;
		}
		Arrays.sort(get);
		System.out.println(Arrays.toString(get));
		System.out.printf("当選番号:%d%n",guess);
		System.out.printf("%s%n",Arrays.asList(get).contains(guess)?"当たり":"外れ");
		/*
		boolean isWin = false;
		for( int n : get ){
			if( get == guess ){
				isWin = true ;
				break;
			}
		}
		System.out.printf("%s%n",isWin?"当たり":"外れ")
		*/
	}
}