import java.util.*;
public class Yearcheck{
	public static void main(String[] args){
		System.out.print("西暦＞＞");
		int year = new Scanner(System.in).nextInt();
		System.out.printf("%d年は%sです%n",year,isLeapYear(year)?"うるう年":"平年");
	}
	public static boolean isLeapYear(int year){
		if( year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0 ) ){
			return true ;
		}else{
			return false ;
		}
	}
}