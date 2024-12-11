import java.util.*;
public class SeatChecker{
	public static void main(String[] args){
		
		boolean[] seat = new boolean[10] ;
		for( int i = 0 ; i < seat.length ; i++){
			int check = new Random().nextInt(2);
			if( check == 0 ){
				seat[i] = true ;
			}else{
				seat[i] = false ;
			}
		}
		//System.out.println(Arrays.toString(seat));
		while(true){
			int count = 0 ;
			for( int i = 0 ; i < seat.length ; i++ ){
				System.out.printf("%2d:%s%n",i+1,seat[i]?"〇":"×");
				if( seat[i] ){
					count++;
				}
			}
			System.out.print("何番の席を予約しますか(0:で終了＞＞)");
			int need = new Scanner(System.in).nextInt();
			
			if( need == 0 ){
				System.out.println("サービス利用ありがとうございました。");
				break;
			}else if( count <= 0 ){
				System.out.println("ご予約できる席がありませんでした");
				break;
			}
			if( seat[need-1] ){
				System.out.printf("%d番の席を予約しました%n",need);
				seat[need-1] = false ;
			}else{
				System.out.printf("%d番は埋まっています%n",need);
			} 
		}
		
	}
}