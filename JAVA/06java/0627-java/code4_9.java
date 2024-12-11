public class code4_9{
	public static void main(String[] args){
		
		int[] scores = {20,30,40,50,80} ;
		int sum = 0 ;
		for( int i = 0 ; i< scores.length ; i++ ){
			sum += scores[i] ;
		}
		
		System.out.printf("合計点%d%n",sum);
		System.out.printf("平均点%d%n",sum/scores.length);
	}
}