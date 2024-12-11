import java.util.* ;
public class easy{
	public static void main(String[] args){
		hello() ;
		drawLine() ;
		dinner() ;
		drawLine() ;
		bye() ;
		drawLine() ;
	}
	public static void hello(){
		System.out.println("湊さん、こんにちは");
	}
	public static void bye(){
		System.out.println("湊さん、さようなら");
	}
	public static void dinner(){
		System.out.println("湊さんと夕食を食べた");
	}
	public static void drawLine(){
		System.out.println("--------------------");
	}
}