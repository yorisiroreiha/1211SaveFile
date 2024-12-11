import java.util.*;
public class AppSong{
	public static void main(String[] args){
		Song s1 = new Song("Let It Be","The Beatles",230);
		Song s2 = new Song("Yesterday","The Beatles",125);
		s1.displayInfo();
		s2.displayInfo();
	}
}
class Song{
	String title;
	String singer;
	int second;
	public Song(String title,String singer,int second){
		this.title = title ;
		this.singer = singer ;
		this.second = second ;
	}
	public void displayInfo(){
		System.out.printf("%s / %s %d:%02d%n",this.title,this.singer,this.second/60,this.second%60);
	}
}