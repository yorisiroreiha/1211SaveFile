public class NoteBook extends Book{
	String content;
	public NoteBook(int page,int price){
		super(page,price);
		this.content = "";
	}
	public void write(String content){
		this.content += content ;
	}
	@Override
	public void show(){
		super.show();
		System.out.println("内容："+content);
	}
}