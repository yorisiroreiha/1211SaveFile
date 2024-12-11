import java.util.*;
public class Arrayssort{
	public static void main(String[] args){
		System.out.print("配列の要素数を入力してください＞＞");
		int need = new Scanner(System.in).nextInt();
		int[] number = makeArray(need) ;
		System.out.println("配列を生成しました。");
		veiwArray(number);
		int[] copy = copy(number) ;
		while(true){
			System.out.print("1...元の配列を表示,2...配列を昇順ソート,3...配列を降順ソート,4...終了＞＞");
			int select = new Scanner(System.in).nextInt();
			boolean isDesc = false ;
			switch(select){
				case 1 :
					veiwArray(number);
					break;
				case 2 :
					sortArray(copy);
					veiwArray(copy);
					break;
				case 3 :
					isDesc = true ;
					sortArray(copy,isDesc);
					veiwArray(copy);
					break;
				default : 
					System.out.println("アプリケーションを終了します");
					return ;
			}
		}
	}
	
	public static int[] makeArray(int need){
		int[] number = new int[need];
		for( int i = 0 ; i < number.length ; i++ ){
			number[i] = new Random().nextInt(21)-10;
		}
		return number ;
	}
	public static int[] copy(int[] number){
		int[] copy = new int[number.length] ;
		for( int i = 0 ; i < copy.length ; i++ ){
			copy[i] = number[i];
		}
		return copy ;
	}
	public static void sortArray(int[] copy){
		Arrays.sort(copy);
	}
	public static void sortArray(int[] copy,boolean isDesc){
		sortArray(copy);
		for( int i = 0 ; i < copy.length/2 ; i++ ){
			int temp = copy[i] ;
			copy[i] = copy[copy.length-i-1];
			copy[copy.length-i-1] = temp ;
		}
	}
	public static void veiwArray(int[] number){
		System.out.println(Arrays.toString(number));
	}
}