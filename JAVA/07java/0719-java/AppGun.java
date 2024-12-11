import java.util.* ;
public class AppGun {
	public static void main(String[] args) {
		Gun g1 = new Gun() ;
		g1.shot();
		g1.displayInfo();
		g1.shot();
		g1.displayInfo();
		Gun g2 = new Gun("44マグナム",6) ;
		for( int i = 0 ; i < 10 ; i++ ){
			g2.shot();
		}
		g2.displayInfo();
		g2.loading(10);
		g2.displayInfo();
	}
}
class Gun{
	String name;
	int maxBullet;
	int bullet;
	public Gun(){
		this("P38",12);
	}
	public Gun(String name,int max){
		this.name = name ;
		this.maxBullet = max ;
		this.bullet = this.maxBullet ;
	}
	public void shot(){
		if( bullet<=0 ){
			System.out.println("弾切れだ!");
		}else{
			this.bullet-- ;
			System.out.println("---------->");
		}
	}
	public void loading(int bullet){
		this.bullet = Math.min(this.maxBullet,this.bullet+bullet);
	}
	public void displayInfo(){
		String ans = check(this.name,this.bullet,this.maxBullet);
		System.out.printf("%s%n",ans);
	}
	public String check(String name,int now,int max){
		String s = "["+name+",";
		for( int i = 0 ; i < now ; i++ ){
			s = s + "*" ;
		}
		for( int i = 0 ; i < (max-now) ; i++ ){
			s = s + "_" ;
		}
		s = s + "]" ;
		return s ;
	}
}