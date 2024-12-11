import java.util.* ;
public class AppString02{
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in) ;
		System.out.print("置換したいワードを入れてください");
		String originalWord = sca.nextLine();
		System.out.print("そのうち置換したいワードを入れてください");
		String changeWord = sca.nextLine();
		System.out.print("そのワードを何に置換しますか？");
		String switchWord = sca.nextLine();
		String changedWord = "" ;
		if( originalWord.contains(changeWord) ){
			changedWord = originalWord.replace(changeWord,switchWord);
			System.out.println( changedWord );
		}else{
			System.out.println(" Error : originalWord donot hava changeWord");
		}
		if( changedWord.contains(switchWord) ){
			changedWord = changedWord.replace(switchWord," "+switchWord+" ");
			System.out.println( changedWord );
		}else{
			System.out.println("文字置換は行われなかった可能性があります");
		}
	}
}