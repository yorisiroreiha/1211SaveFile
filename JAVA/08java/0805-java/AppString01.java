import java.util.* ;
public class AppString01{
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in) ;
		System.out.print("文字列を入力してください＞＞");
		String userInput = sca.nextLine();
		//文字列受け取り
		int len = userInput.length() ;//何回も書くの面倒だった
		System.out.println( len );
		//長さの表示
		if( len >= 6 ){
			String firstWord = userInput.substring(1,2) ;
			String endWord = userInput.substring(len-3) ;
			System.out.printf("%s%s%n",firstWord,endWord) ;
		}else{
			System.out.println("文字が短かったので諦めました");
		}
	}
}