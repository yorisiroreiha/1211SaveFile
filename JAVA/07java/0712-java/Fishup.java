import java.util.* ;
public class Fishup{
	public static void main(String[] args){
		int rest = 100 ;
		int hitPoint = 2 ;
		System.out.println("");
		while(true){
			System.out.println("Press enter Key...");
			new Scanner(System.in).nextLine() ;
			rest = complete(rest);
			System.out.println("残り"+rest);
			hitPoint = lossHit(hitPoint) ;
			System.out.println("ダメージ："+hitPoint+"/5");
			if( rest == 0 ){
				System.out.println("釣り上げることに成功した!");
				break;
			}else if( hitPoint == 5 ){
				System.out.println("糸が切れてしまった。。。失敗");
				break;
			}
		}
	}
	public static int damage(){
		int[] damage = {1,1,1,1,1,1,0,0,0,-1} ;
		String[] ans = {"Bad","Bad","Bad","Bad","Bad","Bad","Good","Good","Good","Great"};
		int n = new Random().nextInt(damage.length);
		System.out.println(ans[n]);
		return damage[n] ;
	}
	public static int pulling(){
		int[] distance = {1,5,5,10,10,20} ;
		int n = new Random().nextInt(distance.length);
		System.out.println(distance[n]+"m");
		return distance[n] ;
	}
	public static int lossHit(int hitPoint){
		int damage = hitPoint + damage() ;
		damage = Math.max(0,damage);
		return damage ;
	}
	public static int complete(int distance){
		int fish = distance - pulling() ;
		fish = Math.max(0,fish);
		return fish ;
	}
}