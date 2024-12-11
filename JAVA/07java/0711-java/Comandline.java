import java.util.*;
public class Comandline{
	public static void main(String[] args){
		if(args.length==0){
			noMsg();
		}else{
			sumArgs(args);
		}
	}
	public static void noMsg(){
		System.out.println("引数を入力してください");
	}
	public static void sumArgs(String[] number){
		int sum = 0 ;
		for(int i = 0 ; i < number.length ; i++ ){
			sum += Integer.parseInt(number[i]);
		}
		System.out.printf("合計は%dです",sum);
	}
}