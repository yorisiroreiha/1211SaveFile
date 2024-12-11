import java.util.* ;
public class AppString03{
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in) ;
		System.out.print("最初の文字列を入れてください");
		String firstWord = sca.nextLine();
		System.out.print("２つ目の文字列を入れてください");
		String secondWord = sca.nextLine();
		if( firstWord.equals(secondWord) ){
			System.out.println("同じだよ");
		}else{
			System.out.println("違うよ");
		}
		if( firstWord.startsWith(secondWord) ){
			System.out.println("最初の文字列は2つ目の文字列から始まるよ");
		}else{
			System.out.println("最初の文字列は2つ目の文字列から始まらないよ");
		}
	}
}