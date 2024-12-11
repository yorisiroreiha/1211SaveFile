public class Jan{
	public static void main(String[] args){
		
		String[] types = {"グー","チョキ","パー"};
		System.out.print("手を入力(0:グー,1:チョキ,2:パー");
		int hand = new java.util.Scanner(System.in).nextInt();
		System.out.printf("あなたは%s%n",types[hand]);
		int pcHand = new java.util.Random().nextInt(3);
		System.out.printf("PCは%s%n",types[pcHand]);
		
		if( hand == pcHand ){
			System.out.println("あいこ");
		}else if( ( hand + 3 -pcHand ) % 3 == 2 ){
			System.out.println("あなたの勝ち");
		}else{
			System.out.println("あなたの負け");
		}
		
	}
}