public class Matango{
	int hp = 50 ;
	char suffix ;
	public Matango(char suffix){
		this.suffix = suffix ;
	}
	public void attack(Hero h){
		System.out.printf("�L�m�R%c�̍U��%n%d�̃_���[�W%n",this.suffix,h.name);
		h.hp -= 10 ;
	}
}