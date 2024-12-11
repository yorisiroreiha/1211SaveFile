import java.util.* ;
import java.io.* ;
public class AppMonster{
	public static void main(String[] args){
		char[] name = new char[26] ;
		for( char c = 'A' ; c <= 'Z' ; c++ ){
			name[c-'A'] = c ;
		}
		ArrayList<Monster> enemys = new ArrayList<>();
		int popEnemy = new Random().nextInt(10)+1;
		int slimeCount = 0 ;
		int goblinCount = 0 ;
		//生成
		for( int i = 0 ; i < popEnemy ; i++ ){
			int branch = new Random().nextInt(2);
			int hp = new Random().nextInt(20)+30;
			if(branch == 0){
				enemys.add(new Slime(name[slimeCount],hp));
				slimeCount++;
			}else{
				enemys.add(new Goblin(name[goblinCount],hp));
				goblinCount++;
			}
		}
		System.out.println(enemys.size());
		//行動
		while( enemys.size() != 0 ){
			for( int i = 0 ; i < enemys.size() ; i++ ){
				int move = new Random().nextInt(6);
				switch(move){
					case 1 :
						enemys.get(i).Escape();
						break;
					case 2 :
						enemys.get(i).Attack();
						break;
					case 3 :
						System.out.printf("私は%sです%n",enemys.get(i).getName());
						break;
					case 4 :
						System.out.printf("残りHP:%d%n",enemys.get(i).getHp());
						break;
					case 5 :
						if( enemys.get(i) instanceof DropMonsterItem e ){
							e.DropItem();
						}else{
							System.out.println("このモンスターはアイテムを持たない");
						}
						break;
					default :
						enemys.get(i).Escape();
						enemys.remove(i);
						break;
				}
			}
			System.out.println();
			System.out.println("------------------------");
			System.out.println();
		}
	}
}