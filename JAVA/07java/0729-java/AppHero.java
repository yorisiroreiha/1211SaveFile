public class AppHero{
	public static void main(String[] args){
		Hero h = new Hero("",100);
		h.sleep();
		System.out.println(h.getName());
		h.setName("12345678");
		h.setHp(130);
	}
}