import java.util.*;
public class Triangle{
	public static void main(String[] args){
		System.out.print("底辺＞＞");
		double bottom = new Scanner(System.in).nextDouble();
		System.out.print("高さ＞＞");
		double height = new Scanner(System.in).nextDouble();
		System.out.printf("底辺：%.2f高さ：%.2fの三角形の面積は%.1fです%n",bottom,height,sqarea(bottom,height));
	}
	public static double sqarea(double a,double b){
		double ans = a * b / 2 ;
		return ans ;
	}
}