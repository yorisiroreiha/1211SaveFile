public class Maxarray{
	public static void main(String[] args){
		int[] number = {8,2,10} ;
		System.out.println(maxOf(number));
	}
	public static int maxOf(int[] number){
		int high = 0 ;
		for( int i = 0 ; i < number.length ; i++ ){
			if(i==0){
				high = number[i] ;
			}else{
				high = Math.max(high,number[i]) ;
			}
		}
		return high ;
	}
}