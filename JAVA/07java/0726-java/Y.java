public abstract class Y implements X{
	public abstract void a();
	public abstract void b();
}
interface X { void a() ;}
final class A extends Y{
	public void a(){	System.out.println("Aa") ;}
	public void b(){	System.out.println("Ab") ;}
}
class B extends Y{
	public void a(){	System.out.println("Ba") ;}
	public void b(){	System.out.println("Bb") ;}
	public void c(){	System.out.println("Bc") ;}
}