import java.util.*;
public class Appginkou{
	public static void main(String[] args){
		Ginkou a = new Ginkou("4649",1592) ;
		System.out.println(a);
		Ginkou a2 = new Ginkou(" 4649",1592) ;
		if( a.accountNumber.trim().equals(a2.accountNumber.trim()) ){
			System.out.println("there is same");
		}
	}
}
class Ginkou{
	String accountNumber;
	int balance;
	public Ginkou(String accountNumber,int balance){
		this.accountNumber = accountNumber ;
		this.balance = balance ;
	}
	@Override
	public String toString(){
		return String.format("\\%d(口座番号：%s)",this.balance,this.accountNumber);
	}
}