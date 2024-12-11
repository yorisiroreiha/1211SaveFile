public class Omikuji{
	public static void main(String[] args){
		
		String[] fortunes = {"大吉","中吉","吉","凶"};
		int number = new java.util.Random().nextInt(fortunes.length);
		System.out.printf("今日のあなたの運勢は%s%n",fortunes[number]);
		
	}
}