import java.util.*;
public class Carry{
	public static void main(String[] args){
		
		final String[] TOPPINGS ={
				"大根","セロリ","里芋","カブ","ゴーヤ","キュウリ","カツオのたたき","ラム肉",
				"鯖の水煮","ブリ","タコ","ちくわ","魚肉ソーセージ","こんにゃく","ツナ缶",
				"納豆","アボガド","レーズン","あげ玉",
		};
		//↑情報
		System.out.println("今夜のカレーを決めます");
		System.out.print("ベースとなるカレーを選択してください0:ポーク,1:ビーフ,2:チキン＞＞");
		int meat = new Scanner(System.in).nextInt();
		String[] base = {"ポーク","ビーフ","チキン"};
		System.out.print("トッピングは何種類？＞＞");
		int choice = new Scanner(System.in).nextInt();
		String[] adds = new String[choice] ;
		for( int i = 0 ; i < TOPPINGS.length ; i++ ){
			int n = new Random().nextInt(TOPPINGS.length-i)+i;
			String temp = TOPPINGS[n] ;
			TOPPINGS[n] = TOPPINGS[i] ;
			TOPPINGS[i] = temp ;
		}
		System.out.print("今日のカレーは「");
		for( int i = 0 ; i < choice ; i++){
			adds[i] = TOPPINGS[i] ;
			System.out.printf("%s",adds[i]);
		}
		System.out.printf("%sカレー」に決まりました！%n",base[meat]);
	}
}