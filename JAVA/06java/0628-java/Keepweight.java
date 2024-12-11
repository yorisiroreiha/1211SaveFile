import java.util.*;
public class Keepweight{
	public static void main(String[] args){
		
		System.out.print("今日の日付は何日ですか＞＞");
		int day = new Scanner(System.in).nextInt();
		double[] weight = new double[7];
		for( int i = 0 ; i < weight.length ; i++ ){
			System.out.printf("%d日の体重＞＞",(day+i)>30?day+i-30:day+i);
			weight[i] = new Scanner(System.in).nextDouble();
		}
		System.out.println(Arrays.toString(weight));
	}
}