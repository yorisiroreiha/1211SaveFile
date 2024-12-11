import java.util.*;
public class Twinarrays{
	public static void main(String[] args){
		
		//2行3列の2次元配列の作成
		int[][] scores = new int[2][3];

		//データの格納
		for(int i=0;i<scores.length;i++){
			for(int j=0;j<scores[i].length;j++){
				scores[i][j] = new Random().nextInt(101);
			}
		}

		//データの表示
		for(int[] arr : scores){
			System.out.println(Arrays.toString(arr));
		}
	}
}