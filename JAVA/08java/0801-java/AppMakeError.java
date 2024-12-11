public class AppMakeError{
	public static void main(String[] args){
		try{
			throw new UnsupportAppException
			("error : this app is Error");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}