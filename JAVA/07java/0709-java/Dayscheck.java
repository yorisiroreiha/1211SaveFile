import java.util.*;
public class Dayscheck{
	public static void main(String[] args){
		System.out.print("西暦を入力＞＞");
		int year = new Scanner(System.in).nextInt();
		System.out.print("月を入力＞＞");
		int month = new Scanner(System.in).nextInt();
		System.out.printf("%d年%d月の日数は%dです%n",year,month,getDaysInMonth(year,month));
	}
	public static int getDaysInMonth(int year,int month){
		int[] a = {31,28,31,30,31,30,31,31,30,31,30,31} ;
		int[] b = {31,29,31,30,31,30,31,31,30,31,30,31} ;
		if( year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0 ) ){
			return b[month-1] ;
		}else{
			return a[month-1] ;
		}
	}
}