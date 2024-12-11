public class AppGinkou{
	public static void main(String[] args){
		Ginkou a = new Ginkou("4649",1592) ;
		System.out.println(a);
		Ginkou a2 = new Ginkou(" 4649",2000) ;
		if(a.equals(a2)){
			System.out.println("同じアカウントです");
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
		return String.format("￥%d(口座番号：%s)",this.balance,this.accountNumber);
	}
	@Override
	public boolean equals(Object o){
		if( this == o ){return true ;}
		if( o instanceof Ginkou s ){
			if( this.accountNumber.trim().equals(s.accountNumber.trim()) ){return true ;}
		}
		return false ;
	}
}
