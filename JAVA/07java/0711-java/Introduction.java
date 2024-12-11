import java.util.*;
public class Introduction{
	public static void main(String[] args){
		introduceOneself();
	}
	public static void introduceOneself(){
		String name = "湊雄輔" ;
		int age = 22 ;
		double high = 169.9 ;
		char zodiac = '辰' ;
		System.out.printf("私の名前は%sです。歳は%dです。身長は%.1fです。%n十二支は%cです。%n",name,age,high,zodiac);
	}
}