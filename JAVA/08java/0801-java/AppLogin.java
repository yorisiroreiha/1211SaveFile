import java.util.* ;
import java.io.* ;
public class AppLogin{
	public static void main(String[] args){
		boolean accountExists=false;//アカウントが存在するか
		boolean isLogin=false;//ログインしているか
		String[] account=new String[2];//アカウント情報[0]にid、[1]にpass
		System.out.println("ログインアプリケーションを作成します");
		//ここから下を作成する
		while(true){
			int n = 0 ;
			try{
				n = mainSystem(accountExists,isLogin,account);
			}catch(Exception e){
				System.out.println("Error : app reset");
			}
			if(n==1){break;}
		}
	}
	public static int mainSystem(boolean accountExists,boolean isLogin,String[] account){
		int select = 0 ;
		while(true){
			System.out.println("どの処理をしますか?");
			System.out.println("1:新規作成  2:ID・PASS確認   3:ログイン  4:実行  5:ログアウト  6:終了");
			select = new Scanner(System.in).nextInt();
			switch(select){
				case 1 :
					accountExists = createAccount(accountExists,account);
					break;
				case 2 :
					displayAccount(accountExists,account);
					break;
				case 3 :
					isLogin = login(accountExists,account,isLogin);
					break;
				case 4 :
					execute(account,isLogin);
					break;
				case 5 :
					isLogin = logout(isLogin);
					break;
				default :
					System.out.println("アプリケーションを終了します");
					return 1 ;
			}
			partition();
		}
	}
	public static boolean createAccount(boolean accountExists,String[] account){
		if(accountExists){
			System.out.println("Error : account is not null");
			return true ;
		}else{
			System.out.println("IDを入力して下さい");
			String name = sca();
			System.out.println("PASSを入力して下さい");
			String pass = sca();
			if( name.length() == 0 || pass.length() == 0 ){
				System.out.println("ID・PASSは1文字以上入力してください");
				return false ;
			}else{
				account[0] = name ;
				account[1] = pass ;
				System.out.println("登録が完了しました");
				return true ;
			}
		}
	}
	public static void displayAccount(boolean accountExists,String[] account){
		if(accountExists){
			System.out.printf("あなたのIDは%s,PASSは%s%n",account[0],account[1]);
		}else{
			System.out.println("アカウント作成してください");
		}
	}
	public static boolean login(boolean accountExists,String[] account,boolean isLogin){
		if(accountExists){
			if(isLogin){
				System.out.println("Error : you now Logined");
				return true ;
			}else{
				System.out.println("");
				System.out.println("IDを入力して下さい");
				String name = sca();
				System.out.println("PASSを入力して下さい");
				String pass = sca();
				if( name.equals(account[0]) && pass.equals(account[1]) ){
					System.out.println("ログイン完了");
					return true ;
				}else{
					System.out.println("入力が間違っています");
					return false ;
				}
			}
		}else{
			System.out.println("アカウント作成してください");
			return false ;
		}
	}
	public static void execute(String[] account,boolean isLogin){
		if(isLogin){
			System.out.printf("%sさん、こんにちは%n",account[0]);
		}else{
			System.out.println("ログインしてください");
		}
	}
	public static boolean logout(boolean isLogin){
		if(isLogin){
			System.out.println("ログアウトしました");
		}else{
			System.out.println("ログインしてください");
		}
		return false ;
	}
	public static void partition(){
		System.out.println("----------------------------------------------");
	}
	public static String sca(){		return new Scanner(System.in).nextLine();	}
}
/*
//アカウントを作成する処理
createAccount()

//ID、PASSを表示する処理
displayAccount()

//ログイン処理
login()

//実行処理
execute()

//ログアウト処理
logout()
*/