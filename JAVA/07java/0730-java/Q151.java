public class Q151{
	public static void main(String[] args){
		String s = "" ;
		for( int i = 0 ; i < 100 ; i++ ){
			s += (i+1) + ",";
		}
		String[] a = s.split(",");
		for( int i = 0 ; i < a.length ; i++ ){
			System.out.println(a[i]);
		}
	}
}