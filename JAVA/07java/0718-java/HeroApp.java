public class HeroApp{
	public static void main(String[] args){
		Sword s1 = new Sword();
		s1.name = "firesword" ;
		s1.power = 100 ;
		Hero player1 = new Hero("受け取り予定");
		Wizard player2 = new Wizard();
		player2.name = "n" ;
		player2.maxHp = 100 ;
		player2.hp = player2.maxHp ;
		player1.weapon = s1 ;
		player1.slip() ;
		System.out.println(player1.hp);
		player2.heal(player1);
		System.out.println(player1.hp);
		player1.attack();
		player1.run() ;
	}
}