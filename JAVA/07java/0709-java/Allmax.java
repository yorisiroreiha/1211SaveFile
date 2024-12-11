public class Allmax{
	public static void main(String[] args){
		System.out.println(maxOf(8,2,10));
	}
	public static int maxOf(int a,int b,int c){
		int max = Math.max(a,b) ;
		int high = Math.max(max,c) ;
		return high ;
	}
}