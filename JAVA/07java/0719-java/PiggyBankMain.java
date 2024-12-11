import java.util.* ;
public class PiggyBankMain{
	public static void main(String[] args){
		PiggyBank pb = new PiggyBank();
		pb.saveMoney(100);
		pb.saveMoney(250);
		pb.showMoney();
	}
}
class PiggyBank{
	int money;
	public PiggyBank(){
		this.money = 0 ;
	}
	public void saveMoney(int money){
		this.money += money ;
		System.out.printf("%d円貯金しました！%n",money);
	}
	public void showMoney(){
		System.out.printf("現在の貯金額は%d円です%n",this.money);
	}
}