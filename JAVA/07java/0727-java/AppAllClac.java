import java.util.*;
public class AppAllClac{
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in);
		ArrayList<SolodFigure> sf = new ArrayList<>();
		while(true){
			System.out.print("1. 立方体 / 2. 球 / 3.終了 ");
			int select = sca.nextInt();
			if( select == 3 ){
				for( int i = 0 ; i < sf.size() ; i++ ){
					System.out.println(sf.get(i).displayAreaInfo());
				}
				break;
			}
			clacer(select,sf);
		}
	}
	public static void clacer(int select,ArrayList<SolodFigure> sf){
		Scanner sca = new Scanner(System.in);
		if( select == 1 ){
			System.out.print("１辺の長さを入力して下さい >");
			double len = sca.nextDouble();
			sf.add(new Cube(len));
		}else{
			System.out.print("半径を入力して下さい >");
			double radius = sca.nextDouble();
			sf.add(new Sphere(radius));
		}
	}
}
