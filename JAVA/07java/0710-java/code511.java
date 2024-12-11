public class code511{
	public static void main(String[] args){
		int n = 10 ;
		methodA(n);
		System.out.println(n);
		n = methodA(n) ;
		System.out.println(n);
		int[] arr = {1,2,3,4} ;
		methodB(arr);
		System.out.println(arr[0]);
	}
	public static int methodA(int n){
		n = n * 10 ;
		System.out.println(n+"!");
		System.out.println("\\?");
		return n ;
	}
	public static void methodB(int[] arr){
		arr[0] = 100 ;
		System.out.println(arr[0]);
	}
}