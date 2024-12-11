import java.util.*;
public class Calculation{
	public static void main(String[] args){
		double bottom = 10.0 ;
		double height = 5.0 ;
		double radius = 5.0 ;
		System.out.printf("三角形の底辺の長さが%.1fｃｍ、高さが%.1fｃｍの場合、面積は%.1f平方ｃｍ%n",bottom,height,calcTriangleArea(bottom,height));
		System.out.printf("円の半径が%.1fｃｍの場合、面積は%.1f平方ｃｍ%n",radius,CalcCircleArea(radius));
	}
	public static double calcTriangleArea(double bottom,double height){
		return bottom * height / 2 ;
	}
	public static double CalcCircleArea(double radius){
		return radius * radius * Math.PI ;
	}
}