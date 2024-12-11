public class AppParseIntError{
	public static void main(String[] args){
		String s = "三" ;
		try{
			int i = Integer.parseInt(s);
		}catch(NumberFormatException e){
			System.out.println("Error : "+s+"can not change int");
		}
		System.out.println("App End");
	}
}