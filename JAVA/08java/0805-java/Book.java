public class Book{
	private String title;
	private String author;
	private double price;
	public Book(String title,String author,double price){
		this.title = title ;
		this.author = author ;
		this.price = price ;
	}//問題にはないけど作ってみたの
	public String getTitle(){
		return this.title ;
	}
	public String getAuthor(){
		return this.author ;
	}
	public double getPrice(){
		return this.price ;
	}
	public void setPrice(double newPrice){
		this.price = newPrice ;
	}
}