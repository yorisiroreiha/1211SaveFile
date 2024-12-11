import java.util.*;
public class AppCalc{
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in);
		while(true){
			System.out.print("1. 立方体 / 2. 球 / 3.終了 ");
			int select = sca.nextInt();
			if( select == 3 ){break;}
			clacer(select);
		}
	}
	public static void clacer(int select){
		Scanner sca = new Scanner(System.in);
		if( select == 1 ){
			System.out.print("１辺の長さを入力して下さい >");
			double len = sca.nextDouble();
			Cube c = new Cube(len);
			System.out.println(c.displayAreaInfo());
		}else{
			System.out.print("半径を入力して下さい >");
			double radius = sca.nextDouble();
			Sphere s = new Sphere(radius);
			System.out.println(s.displayAreaInfo());
		}
	}
}
