import java.util.*;
public class AppColorPencil{
	public static void main(String[] args){
		System.out.print("何本作成しますか>>");
		int many = new Scanner(System.in).nextInt();
		ColorPencil[] cp = new ColorPencil[many] ;
		for( int i = 0 ; i < cp.length ; i++ ){
			System.out.print((i+1)+"本目の色>>");
			String name = new Scanner(System.in).nextLine();
			System.out.print((i+1)+"本目の長さ>>");
			int len = new Scanner(System.in).nextInt();
			ColorPencil temp = new ColorPencil(name,len) ;
			cp[i] = temp ;
		}
		while(true){
			for( int i = 0 ; i < cp.length ; i++ ){
				cp[i].showInfo(i);
			}
			System.out.println(many+".終了");
			System.out.print("どの色でかきますか？＞＞");
			int select = new Scanner(System.in).nextInt();
			if( select >= many ){
				System.out.println("アプリケーションを終了します");
				return ;
			}else{
				cp[select].write();
			}
		}
	}
}
class ColorPencil{
	String color;
	int len;
	public ColorPencil(String color,int len){
		this.color = color ;
		this.len = len ;
	}
	public void showInfo(int n){
		System.out.printf("%d.%s",n,this.color);
		for( int i = 0 ; i < this.len ; i++ ){
			System.out.print("-");
		}
		System.out.println(">");
	}
	public void write(){
		if( this.len<=0 ){
			System.out.printf("%sはもうかけません%n",this.color);
		}else{
			this.len-- ;
			System.out.printf("%sで書いた!%n",this.color);
		}
	}
}