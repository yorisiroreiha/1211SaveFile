public class Monkey{
	String name ;
	int age ;
	public Monkey(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public void greet(Monkey subject){
		System.out.printf("こんにちは%s(%d歳)です。よろしく！%n",subject.name,subject.age);
	}
	public void takeuma(Monkey subject){
		System.out.printf("%sは上手に竹馬にのった！%n",subject.name);
	}
	public void sakadachi(Monkey subject){
		System.out.printf("%sはひょいと逆立ちをした！%n",subject.name);
	}
}