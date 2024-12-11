import java.util.* ;
public class AppStringError{
	public static void main(String[] args){
		try{
		String s = null ;
		System.out.println(s.length()) ;
		}catch(NullPointerException e){
			System.out.println("Error : app catch NullPointerException");
			System.out.println("-----------Start-----------");
			e.printStackTrace();
			System.out.println("------------End------------");
		}
	}
}