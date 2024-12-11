import java.util.*;
public class Humantest{
	public static void main(String[] args){
		
		System.out.print("何人＞＞");
		int human = new Scanner(System.in).nextInt();
		Integer[] test = new Integer[human] ;
		for( int i = 0 ; i < test.length ; i++ ){
			test[i] = new Random().nextInt(101);
		}
		System.out.println(Arrays.toString(test));
		Arrays.sort(test);
		System.out.printf("最高点は%d%n",test[test.length-1]);
		System.out.printf("最低点は%d%n",test[0]);
		//System.out.println("昇順に並び替えました");
		//System.out.println(Arrays.toString(test));
		/*
		//数値の場合は配列の型をIntegerに変更しないと文字として認識しない
		if(Arrays.asList(test).contains(77)){
			System.out.println("77は含まれています");
		}else{
			System.out.println("77は含まれていません");
		}*/
	}
}