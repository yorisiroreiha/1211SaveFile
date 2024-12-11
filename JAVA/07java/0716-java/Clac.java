package calcapp.main;
import java.util.*;
import rootLogic.ClacLogic;
public class Clac{
	public static void main(String[] main){
		int a = 10 ;
		int b = 2 ;
		int total = ClacLogic.tasu(a,b) ;
		int delta = ClacLogic.hiku(a,b) ;
		System.out.printf("足すと%d、引くと%d%n",total,delta);
	}
}