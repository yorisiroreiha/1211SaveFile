import java.util.*;
public class AppSubject{
	public static void main(String[] args){
		Scanner esn = new Scanner(System.in);
		System.out.print("何科目ありますか>>");
		int many = esn.nextInt();esn.nextLine();
		Subject[] sj = new Subject[many];
		for( int i = 0 ; i < sj.length ; i++ ){
			System.out.print((i+1)+"科目の名前>>");
			String name = esn.nextLine();
			System.out.print((i+1)+"科目の点数>>");
			int score = esn.nextInt();esn.nextLine();
			Subject temp = new Subject(name,score);
			sj[i] = temp ;
		}
		for( int i = 0 ; i < sj.length ; i++ ){
			sj[i].showInfo();
			System.out.println();
		}
	}
}
class Subject{
String name;
int score;
	public Subject(String name,int score){
		this.name = name ;
		this.score = score ;
	}
	public void showInfo(){
		System.out.printf("%s:",this.name);
		for( int i = 1 ; i <= this.score ; i++ ){
			System.out.printf("%s",i%10==0?"*|":"*");
		}
	}
}