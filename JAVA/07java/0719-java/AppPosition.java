import java.util.* ;
public class AppPosition{
	public static void main(String[] args) {
		Position p1 = new Position();
		p1.moveRight(5);
		p1.moveUp(10);
		p1.displayPosition();
		Position p2 = new Position(4,6);
		p2.moveLeft(8);
		p2.moveDown(20);
		p2.displayPosition();
	}
}
class Position{
	int x;
	int y;
	public Position(){
		this(0,0);
	}
	public Position(int x,int y){
		this.x = x ;
		this.y = y ;
		this.displayPosition();
	}
	public void displayPosition(){
		System.out.printf("現在位置は[x:%d,y:%d]です%n",this.x,this.y);
	}
	public void moveRight(int len){
		for( int i = 0 ; i < len ; i++ ){
			this.x++ ;
		}
		System.out.printf("右に%d移動しました%n",len);
	}
	public void moveLeft(int len){
		for( int i = 0 ; i < len ; i++ ){
			this.x-- ;
		}
		System.out.printf("左に%d移動しました%n",len);
	}
	public void moveUp(int len){
		for( int i = 0 ; i < len ; i++ ){
			this.y++ ;
		}
		System.out.printf("上に%d移動しました%n",len);
	}
	public void moveDown(int len){
		for( int i = 0 ; i < len ; i++ ){
			this.y-- ;
		}
		System.out.printf("下に%d移動しました%n",len);
	}
}