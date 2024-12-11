import java.util.*;
public class Practice41{
	public static void main(String[] args){
		int[] points = new int[4] ;
		System.out.println(Arrays.toString(points));
		double[] weights = new double[5] ;
		System.out.println(Arrays.toString(weights));
		boolean[] answers = new boolean[3] ;
		System.out.println(Arrays.toString(answers));
		String[] names = new String[3] ;
		System.out.println(Arrays.toString(names));
		/*4-2*/
		int[] moneyList = {121902,8302,55100} ;
		for( int i = 0 ; i < moneyList.length ; i++ ){
			System.out.println(moneyList[i]);
		}
		for( int i : moneyList ){
			System.out.println(i);
		}
		/*4-4*/
		int[] numbers = {3,4,9} ;
		while(true){
			System.out.print("1桁の数字を入力してください＞＞");
			int input = new	Scanner(System.in).nextInt();
			for( int i = 0 ; i < numbers.length ; i++ ){
				if( input == numbers[i] ){
					System.out.println("アタリ！");
					return;
				}//else
			}
		}
	}
}