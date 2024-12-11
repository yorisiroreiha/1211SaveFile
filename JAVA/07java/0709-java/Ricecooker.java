import java.util.* ;
public class Ricecooker{
	public static void main(String[] args){
		riceCooker(3);
	}
	public static void riceCooker(int go){
		System.out.printf("%d合分のお米を入れてください。%n",go);
		System.out.printf("%dccのお水を入れてください。%n",go*200);
		System.out.println("40分お待ちください。");
		System.out.printf("%d合のご飯が出来ました！%n",go);
	}
}