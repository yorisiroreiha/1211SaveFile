public class Method03{
	public static void printLine(){
		for( int i = 0 ; i < 20 ; i++ ){
			System.out.print("*");
		}
		System.out.println();
	}
	public static void main(String[] args){
		for( int i = 1 ; i <= 3 ; i++ ){
			printLine();
			System.out.println("見出し"+i);
			System.out.println("見出し"+i+"の内容");
		}
	}
}