public class AppSchool{
	public static void main(String[] args){
		Teacher t = new Teacher("山田",35,"数学");
		t.greeting();
		t.teach();
		Student s = new Student("鈴木",15,8);
		s.greeting();
		s.showNumber();
		Staff sf = new Staff("田中",56);
	}
}
class Person{
	String name;
	int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void greeting(){
		System.out.printf("%s(%d)です。こんにちは%n",this.name,this.age);
	}
}

class Teacher extends Person{
	String subject;
	Teacher(String name,int age,String subject){
		super(name,age);
		this.subject=subject;
	}
	void teach(){
		System.out.printf("%sの授業を行います%n",this.subject);
	}
}

class Student extends Person{
	int number;
	Student(String name,int age,int number){
		super(name,age);
		this.number=number;
	}
	void showNumber(){
		System.out.printf("出席番号は%dです%n",this.number);
	}
}
class Staff extends Person{
	Staff(String name,int age){
		super(name,age);
	}
	public void patrol(){
		System.out.println("巡回した");
	}
}
