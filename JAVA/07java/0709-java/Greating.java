import java.util.*;
public class Greating{
	public static void main(String[] args){
		//hello("湊") ;
		//hello("菅原") ;
		String name = new Scanner(System.in).nextLine();
		hello();
		/*
$ javac Greating.java
Greating.java:10: エラー: シンボルを見つけられません
                System.out.println(name+"さん、こんにちは！");
                                   ^
  シンボル:   変数 name
  場所: クラス Greating
エラー1個
		*/
	}
	public static void hello(){
		System.out.println(name+"さん、こんにちは！");
	}
}