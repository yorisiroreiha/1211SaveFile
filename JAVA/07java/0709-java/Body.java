import java.util.*;
public class Body{
	public static void main(String[] args){
		System.out.print("身長(cm)を入力＞＞");
		double cm = new Scanner(System.in).nextDouble();
		System.out.print("体重(kg)を入力＞＞");
		double kg = new Scanner(System.in).nextDouble();
		System.out.printf("あなたのBMIは%.1fです。",calcBMI(cm,kg));
	}
	public static double calcBMI(double heightCm,double weightKg){
		double ans = ( weightKg * 10000 ) / ( heightCm * heightCm ) ;
		return ans ;
	}
}