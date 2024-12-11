import java.util.*;
public class AppScores{
	public static void main(String[] args){
		final String[] NAMES = {
            "佐藤", "鈴木", "高橋", "田中", "渡辺", "伊藤", "山本", "中村", "小林", "加藤",
            "吉田", "山田", "山口", "松本", "井上", "木村", "斎藤", "清水", "山崎", "池田",
            "橋本", "阿部", "石川", "山下", "中島", "小川", "前田", "岡田", "藤田", "後藤",
            "石井", "村上", "近藤", "遠藤", "青木", "坂本", "斉藤", "福田", "太田", "西村",
            "藤井", "三浦", "藤原", "岡本", "松田", "中川", "原田", "田村", "金子", "和田",
		};
		Random rand = new Random();
		Scanner sca = new Scanner(System.in);
		/*//①
		String name = NAMES[rand.nextInt(NAMES.length)];
		System.out.println(name);
		//②
		int score = rand.nextInt(100000);
		System.out.println(score);
		//③*/
		ArrayList<Player> list = new ArrayList<>() ;
		/*
		Player temp = new Player(name,score);
		pl.add(temp) ;
		System.out.println(pl.get(0).info());
		*/
		System.out.print("何人分のデータを作成しますか>>");
		int make = sca.nextInt();
		for( int i = 0 ; i < make ; i++ ){
			String name = NAMES[rand.nextInt(NAMES.length)];
			int score = rand.nextInt(100000);
			Player temp = new Player(name,score);
			list.add(temp) ;
		}
		Collections.sort(list,(p1,p2) -> -( p1.score - p2.score ) );
		int brank = (int)Math.log10(make)+1 ;
		for( int i = 0 ; i < list.size() ; i++ ){
			String width = String.format("%%%dd",brank);
			System.out.printf(width+".%s%n",i+1,list.get(i).info());
		}
	}
}
class Player{
	String name;
	int score;
	public Player(String name,int score){
		this.name = name ;
		this.score = score ;
	}
	public String info(){
		return String.format("%s %5d",this.name,this.score);
	}
}