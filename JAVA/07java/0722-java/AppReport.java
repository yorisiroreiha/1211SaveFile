import java.util.*;
public class AppReport{
	public static void main(String[] args){
		System.out.print("映画を何件登録しますか＞＞");
		int n = new Scanner(System.in).nextInt();
		Movie[] ms = new Movie[n] ;
		for( int i = 0 ; i < ms.length ; i++ ){
			System.out.print((i+1)+"件目タイトルを入力＞＞");
			String titel = new Scanner(System.in).nextLine();
			System.out.print((i+1)+"件目の監督を入力＞＞");
			String human = new Scanner(System.in).nextLine();
			System.out.print((i+1)+"件目のレートを入力＞＞");
			int late = new Scanner(System.in).nextInt();
			Movie m = new Movie(titel,human,late) ;
			ms[i] = m ;
		}
		for( int i = 0 ; i < ms.length ; i++ ){
			ms[i].show();
		}
	}
}
class Movie{
	String titel;
	String human;
	int late;
	public Movie(String titel,String human,int late){
		this.titel = titel ;
		this.human = human ;
		this.late = late ;
	}
	public void show(){
		String n = evaluate(this.late);
		System.out.printf("%s / %s %s%n",this.titel,this.human,n);
	}
	public static String evaluate(int star){
		String n = "";
		for( int i = 0 ; i < star ; i++ ){
			n = n + "★" ;
		}
		return n ;
	}
}