public class Fool extends Character implements Human{
	public Fool(String name,int hp){
		super(name,hp);
	}
	@Override
	public void attack(Matango m){
		System.out.println("遊んでいる");
	}
	@Override
	public void talk(){
		System.out.println("めっさ眠い");
	}
	@Override
	public void watch(){
		System.out.println("焦点が合っていないようだ");
	}
	@Override
	public void hear(){
		System.out.println("聞こえているのかはわからない");
	}
	@Override
	public void run(){
		System.out.println("一目散に逃げ去っていった");
	}
}