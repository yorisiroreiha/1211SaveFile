public class AppSleep{
	public static void main(String[] args){
		System.out.println("Start");
		try{
			method();
		}catch(Exception e){
			System.out.println("Error : App IOException");
		}
		System.out.println("End");
	}
	public static void method() throws Exception{
		Thread.sleep(3000);
	}
}