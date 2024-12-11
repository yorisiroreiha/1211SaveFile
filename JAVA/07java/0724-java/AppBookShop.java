import java.util.*;
public class AppBookShop{
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in);
		System.out.print("本のページ数を入力して下さい >");
		int page = sca.nextInt();
		System.out.print("本の価格を入力して下さい >");
		int price = sca.nextInt();
		Book bk = new Book(page,price);
		System.out.print("ノートのページ数を入力して下さい >");
		page = sca.nextInt();
		System.out.print("ノートの価格を入力して下さい >");
		price = sca.nextInt();
		NoteBook nb = new NoteBook(page,price);
		while(true){
			System.out.print("1. 本の情報表示 / 2. ノートの情報表示 / 3. ノートに追加書込 / 4.   終了>");
			int select = sca.nextInt();
			if( select == 4 ){
				System.out.println("アプリケーションを終了します。");
				break;
			}else if( select == 3 ){
				System.out.print("書き込む内容を入力して下さい >");
				String content = sca.next();
				nb.write(content);
			}else if( select == 2){
				nb.show();
			}else{
				bk.show();
			}
		}
	}
}