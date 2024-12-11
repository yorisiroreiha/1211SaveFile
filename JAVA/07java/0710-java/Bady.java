import java.util.*;
public class Bady{
	public static void main(String[] args){
		System.out.print("体重を入力してください(kg)＞＞");
		double weight = new Scanner(System.in).nextDouble();
		System.out.print("身長を入力してください(cm)＞＞");
		double high = new Scanner(System.in).nextDouble();
		System.out.printf("体重：%.1fＫｇ身長：%.1fｃｍのＢＭＩは%.1fです%n",weight,high,calcBMI(high,weight));
	}
	public static double calcBMI(double heightCm,double weightKg){
		return (weightKg * 10000) / (heightCm * heightCm) ;
	}
}