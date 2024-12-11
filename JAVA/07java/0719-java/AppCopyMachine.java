import java.util.* ;
public class AppCopyMachine{
	public static void main(String[] args){
		System.out.print("最初に給紙する枚数を入力して下さい >");
		int charge = new Scanner(System.in).nextInt();
		CopyMachine cm = new CopyMachine(charge) ;
		while(true){
			System.out.print("1. 給紙 / 2. コピー / 3. 表示 / 4. 終了>");
			int select = new Scanner(System.in).nextInt();
			switch(select){
				case 1 :
					System.out.print("給紙する枚数を入力して下さい >");
					charge = new Scanner(System.in).nextInt();
					cm.feedPaper(charge);
					break;
				case 2 :
					System.out.print("コピーする枚数を入力して下さい >");
					int usepaper = new Scanner(System.in).nextInt();
					cm.copy(usepaper);
					break;
				case 3 :
					cm.display();
					break;
				default :
					System.out.println("アプリケーションを終了します。");
					return;
			}
		}
	}
}
class CopyMachine{
	int paper;
	public CopyMachine(int sheet){
		this.paper = sheet ;
	}
	public void feedPaper(int sheet){
		this.paper += sheet ;
		System.out.printf("%d枚給紙しました。%n",sheet);
	}
	public void copy(int sheet){
		int count = 0 ;
		for( int i = 0 ; i < sheet ; i++ ){
			if( this.paper <= 0 ){
				break;
			}else{
				count++ ;
				this.paper-- ;
			}
		}
		System.out.printf("%d枚コピーしました。%n",count);
	}
	public void display(){
		System.out.printf("コピー可能な枚数は%d枚です。%n",this.paper);
	}
}