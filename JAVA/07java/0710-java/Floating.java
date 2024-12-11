import java.util.*;
public class Floating{
	public static void main(String[] args){
		System.out.print("正の整数a：");
		int a = new Scanner(System.in).nextInt();
		System.out.print("正の整数b:");
		int b = new Scanner(System.in).nextInt();
		System.out.printf("生成したランダムな値は%dです",random(a,b));
	}
	public static int random(int a,int b){
		int max = Math.max(a,b) ;
		int min = Math.min(a,b) ;
		return new Random().nextInt(max-min+1)+min;
	}
}