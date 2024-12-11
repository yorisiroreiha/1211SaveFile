import java.util.*;
public class AppMovei{
	public static void main(String[] args){
		Movie m1 = new Movie("シャイニング","スタンリー・キューブリック",5);
		Movie m2 = new Movie("ローマの休日","ウィリアム・ワイラー",5);
		Movie m3 = new Movie("シン・ゴジラ","樋口　真嗣",4);
		Movie[] movies = {m1,m2,m3} ;
		for( int i = 0 ; i < movies.length ; i++ ){
			movies[i].show();
		}
	}
}
class Movie{
	String name;
	String author;
	int star;
	public Movie(String name,String author,int star){
		this.name = name ;
		this.author = author ;
		this.star = star ;
	}
	public void show(){
		String n = evaluate(this.star);
		System.out.printf("%s / %s %s%n",this.name,this.author,n);
	}
	public static String evaluate(int star){
		String n = "";
		for( int i = 0 ; i < star ; i++ ){
			n = n + "★" ;
		}
		return n ;
	}
}