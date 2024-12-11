import java.util.*;
public class Poptest{
	public static void main(String[] args){
		System.out.print("クラスの数＞＞");//howmanyclass
		int team = new Scanner(System.in).nextInt();
		int human = 0 ;
		int[][] ans = new int[team][] ;
		for( int i = 0 ; i < ans.length ; i++ ){
			System.out.printf("%s組のクラスの人数＞＞",i+1);//howmanyhuman
			human = new Scanner(System.in).nextInt();
			ans[i] = new int[human] ;
			for( int j = 0 ; j < ans[i].length ; j++ ){
				System.out.printf("%s組%s人目の点数＞＞",i+1,j+1);//howmuchtest
				ans[i][j] = new Scanner(System.in).nextInt();
			}
		}
		System.out.println("--表出力--");
		for( int i = 0 ; i < ans.length ; i++ ){
			System.out.print((i+1)+"組");
			for( int j = 0 ; j < ans[i].length ; j++ ){
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
}