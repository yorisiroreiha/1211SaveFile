public class PoisonMatango extends Matango{
	int bless = 5 ;
	public PoisonMatango(){
		super('A');
	}
	@Override
	public void attack(Hero h){
		super.attack(h);
		if( this.bless != 0 ){
			System.out.println("さらに毒の胞子をばら撒いた");
			System.out.printf("%dポイントのダメージ！%n",h.hp/5);
			h.hp = h.hp - h.hp/5 ;
			this.bless-- ;
		}
	}
}