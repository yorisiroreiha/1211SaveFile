import java.util.*;
public class Les2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		String s = sc.next();
		System.out.printf("%d%d%s%n",n1,n2,s);
		System.out.print("age");
		int age = sc.nextInt();//←ここで改行コードを生成
		sc.nextLine();//改行コードを消費する
		System.out.print("name");
		String name = sc.nextLine();
		/*↑12がないと11で生成された改行コードを消費するためname入力が飛ばされる*/
		System.out.printf("%d%s",age,name);
	}
}