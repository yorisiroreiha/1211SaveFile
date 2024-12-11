public class Mailbox{
	public static void main(String[] args){
		String title = "メールのタイトル" ;
		String addless = "メールの宛先アドレス" ;
		String text = "メールの本文" ;
		email(title,addless,text);
		email(addless,text);
	}
	public static void email(String title,String addless,String text){
		System.out.printf("%sに、以下のメールを送信しました%n",addless);
		System.out.printf("件名：%s%n",title);
		System.out.printf("本文：%s%n",text);
	}
	public static void email(String addless,String text){
		System.out.printf("%sに、以下のメールを送信しました%n",addless);
		System.out.println("件名：無題");
		System.out.printf("本文：%s%n",text);
	}
}