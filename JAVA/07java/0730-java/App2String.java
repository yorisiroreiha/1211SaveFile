public class App2String{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		for( int i = 0 ; i < 1000 ; i++ ){
			sb.append("java");
		}
		String s = sb.toString() ;
		System.out.println(s);
		String msg = "hello" ;
		StringBuilder sb2 = new StringBuilder(msg) ;
		sb2.reverse();
		System.out.println(sb2);
		String result = msg.toUpperCase().substring(2).replace("L","1");
		System.out.println(result);
		String csv = "banana,apple,orange";
		String[] data = csv.split(",");
		System.out.println(data[0]+" "+data[1]+" "+data[2]);
		String ans = String.join("と",data);
		System.out.println(ans);
	}
}