import java.util.* ;
public class Greeting{
	public static void main(String[] args){
		greeting("山田","こんにちは");
	}
	public static void greeting(String name,String msg){
		System.out.printf("%sさん、%s！%n",name,msg);
	}
}