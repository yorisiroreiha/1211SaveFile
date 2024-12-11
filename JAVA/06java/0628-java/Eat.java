import java.util.*;
public class Eat{
	public static void main(String[] args){
		
		String[] menu = {"まぐろ","えび","いか","たこ","ほたて","うに"};
		System.out.print("何皿食べる？");
		int need = new Scanner(System.in).nextInt();
		int[] eat = new int[need] ;
		String[] eatMenu = new String[need];
		for( int i = 0 ; i < eat.length ; i++){
			eat[i] = new Random().nextInt(6);
			eatMenu[i] = menu[eat[i]] ;
		}
		System.out.println(Arrays.toString(eatMenu));
		
		if( Arrays.asList(eatMenu).contains(menu[0]) ){
			System.out.printf("%sを食べました。%n",menu[0]);
		}else{
			System.out.printf("%sを食べていません。%n",menu[0]);
		}
		
		int count = 0 ;
		for( int i = 0 ; i < eat.length ; i++ ){
			if(eat[i] == 5){
				count++;
			}
		}
		System.out.printf("%sを%d皿食べました。%n",menu[5],count);
		
	}
}