public class Arrayssum{
	public static void main(String[] args){
		int[] number = {1,5,7} ;
		System.out.println(arraysSum(number));
	}
	public static int arraysSum(int[] number){
		int sum = 0 ;
		for( int i : number ){
			sum += i ;
		}
		return sum ;
	}
}