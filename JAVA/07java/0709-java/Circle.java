import java.util.*;
public class Circle{
	public static void main(String[] args){
		System.out.print("半径＞＞");
		double radius = new Scanner(System.in).nextDouble();
		System.out.printf("半径：%.1fの円の面積は%.1fです。",radius,ans(radius));
	}
	public static double ans(double a){
		double ans = a * a * Math.PI ;
		return ans ;
	}
}