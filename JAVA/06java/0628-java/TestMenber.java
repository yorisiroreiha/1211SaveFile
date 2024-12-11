import java.util.*;
public class TestMenber{
	public static void main(String[] args){
		
		System.out.print("何人＞＞");
		int human = new Scanner(System.in).nextInt();
		String[] name = new String[human] ;
		for( int i = 0 ; i < name.length ; i++ ){
			System.out.printf("%s人目の名前は＞＞",i+1);
			name[i] = new Scanner(System.in).nextLine();
		}
		
		System.out.println(Arrays.toString(name));
	}
}