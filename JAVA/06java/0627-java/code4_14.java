public class code4_14{
	public static void main(String[] args){
		int[] scores = {20,30,40,50,80} ;
		/*拡張for文*/
		for( int value : scores){
			System.out.println(value);
		}
		
		String[] names = {"John","Paul","George","Ringo"};
		for( String name : names ){
			System.out.println(name);
		}
		
		double[] weight = {53.2,48.6,81.3,77.4};
		double total = 0 ;
		for( Double w : weight ){
			total += w ;
		}
		System.out.printf("平均体重は%.1fです%n",total/weight.length);
		
		
	}
}