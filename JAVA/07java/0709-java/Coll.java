public class Coll{
	public static void main(String[] args){
		methodA();
		System.out.println("end");
	}
	public static void methodA(){
		System.out.println("methodA");
		methodB();
	}
	public static void methodB(){
		System.out.println("methodB");
	}
}