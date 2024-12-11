import java.util.*;
public class Tax{
	public static void main(String[] args){
		System.out.print("消費税は何％ですか＞＞");
		int tax = new Scanner(System.in).nextInt();
		int total = 0 ;
		while( true ){
			System.out.print("価格を入力(0でお会計)＞＞");
			int price = new Scanner(System.in).nextInt();
			total += price ;
			if( price == 0 ){
				break;
			}//else
		}//while
		System.out.printf("お買い物合計金額は%d円(税込み)です。",calcTax(tax,total));
	}
	public static int calcTax(int tax,int total){
		return ((tax+100)*total)/100 ;
	}
}