import java.util.*;
public class Map{
	public static void main(String[] args){
		String[] name = {"地","木","岩","水"} ;
		System.out.print("幅＞＞");
		int m = new Scanner(System.in).nextInt();
		System.out.print("高さ＞＞");
		int n = new Scanner(System.in).nextInt();
		int[][] number = new int[n][m] ;
		for( int i = 0 ; i < number.length ; i++ ){
			for( int j = 0 ; j < number[i].length ; j++ ){
				number[i][j] = new Random().nextInt(name.length);
			}
		}
		String[][] map = new String[n][m] ;
		for( int i = 0 ; i < map.length ; i++ ){
			for( int j = 0 ; j < map[i].length ; j++){
				map[i][j] = name[number[i][j]];
			}
		}
		for( int i = 0 ; i < map.length ; i++ ){
			for( int j = 0 ; j < map[i].length ; j++ ){
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
}