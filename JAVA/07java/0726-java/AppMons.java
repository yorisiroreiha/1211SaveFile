public class AppMons{
	public static void main(String[] args){
		Mons[] m = new Mons[4] ;
		m[0] = new Slime();
		m[1] = new Goblin();
		m[2] = new DeathBat();
		m[3] = new Necromancer(50);
		for( int i = 0 ; i < m.length ; i++ ){
			m[i].run();
			if( m[i] instanceof Droper d ){
				d.drop();
			}
		}
	}
}