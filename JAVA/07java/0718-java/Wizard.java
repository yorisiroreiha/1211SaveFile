public class Wizard{
	String name ;
	int maxHp ;
	int hp ;
	public void heal(Hero subject){
		int temp = subject.hp ;
		subject.hp = Math.min(subject.hp+10,subject.maxHp);
		int recover = subject.hp -temp ;
		System.out.printf("%sは%sを%dポイント回復した%n",this.name,subject.name,recover);
	}
}