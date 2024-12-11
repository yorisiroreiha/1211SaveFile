import java.util.* ;
public class AppString{
	public static void main(String[] args){
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		if(s2.equals(s3)){
			System.out.println("ｓ2とｓ3は等しい");
		}
		if(s2.equalsIgnoreCase(s3)){
			System.out.println("ｓ2とｓ3は大文字小文字を区別しなければ同じ");
		}
		System.out.printf("ｓ1の長さは%dです%n",s1.length());
		char c1 = s1.charAt(2) ;
		String s4 = "Java Programming";
		String s5 = s4.substring(3);
		System.out.printf("%c...%s%n",c1,s5);
		String s6 = s4.substring(3/*以上*/,7/*未満*/);
		System.out.println(s6);
		String s7 = s4.substring(0,s4.length()-1);
		System.out.println(s7);
		String s8 = "Java and JavaScript" ;
		if( s8.contains("Java")){
			System.out.println("Javaを含んでいる");
		}
		if( s8.startsWith("Ja") ){
			System.out.println("Jaから始まる");
		}
		if( s8.endsWith("ipt") ){		}
		int idx8 = s8.indexOf("v") ;
		int idx08 = s8.indexOf("z");/*indexをlastIndexにすると後ろから観測するよ*/
		System.out.printf("%s,%s(含まれてないから-1)%n",idx8,idx08);
		String s9 = s8.toLowerCase();
		System.out.println(s9);
		String s10 = s8.toUpperCase();
		System.out.println(s10);
		String s11 = " hello world " ;
		String s12 = s11.trim() ;
		System.out.println(s12) ;
		String s13 = s11.replace("l","?");
		System.out.println(s13);
	}
}