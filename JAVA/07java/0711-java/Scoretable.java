import java.util.*;
public class Scoretable{
	public static void main(String[] args){
		System.out.print("人数＞＞");
		int human = new Scanner(System.in).nextInt();
		int[] score = new int[human] ;
		for( int i = 0 ; i < score.length ; i++ ){
			System.out.printf("%d人目＞＞",i+1);
			score[i] = new Scanner(System.in).nextInt();
		}
		System.out.println("点数グラフ");
		makeTable(score);
	}
	public static void makeTable(int[] score){
		for( int i = 0 ; i < score.length ; i++ ){
			for( int j = 0 ; j < score[i] ; j++ ){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}