import java.util.* ;
public class Makemap{
	public static void main(String[] args){
		String[] mapName = {"土","木","岩","水"} ;
		int[][] mapChep = {
												{0,0,1,3,3,3},
												{0,0,1,1,3,2},
												{0,0,0,1,1,2},
												{0,2,0,0,0,2},
												{0,0,0,2,0,0}
											};
		String[][] map = new String[5][6] ;
		for( int i = 0 ; i < mapChep.length ; i++ ){
			for( int j = 0 ; j < map[i].length ; j++ ){
				map[i][j] = mapName[mapChep[i][j]] ;
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
}