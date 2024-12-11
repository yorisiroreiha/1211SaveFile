import java.util.*;
public class AppPc{
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in);
		Pc pc = new Pc();
		Browser b = new Browser("Chrome");
		pc.addApp(b);
		Editor e = new Editor("Edit");
		pc.addApp(e);
		Music m = new Music("music");
		pc.addApp(m);
		USBMemory um = new USBMemory();
		pc.setUSB(um);
		pc.executeUSB();
		while(true){
			pc.showApp();
			System.out.print("どのアプリケーションを開きますか？");
			int select = sca.nextInt();
			if( select >= pc.appList.size() ){break;}
			pc.selectApp(select);
			System.out.println();
		}
	}
}
class Pc{
	ArrayList<Application> appList;
	USB usb;
	public Pc(){
		this.appList = new ArrayList<Application>();
	}
	void addApp(Application app){
		this.appList.add(app);
	}
	void showApp(){
		for( int i = 0 ; i < this.appList.size() ; i++ ){
			System.out.println(i+"..."+this.appList.get(i).name);
		}
	}
	void selectApp(int select){
		if( this.appList.size() == 0 ){
			System.out.println("アプリケーションが未実装です");
			return;
		}
		this.appList.get(select).execute();
	}
	void setUSB(USB usb){
		this.usb = usb ;
	}
	void executeUSB(){
		if( this.usb == null ){System.out.println("USBが刺さっていません");}
		this.usb.execute();
	}
}
abstract class Application{
	String name;
	public Application(String name){
		this.name = name;
	}
	public abstract void execute();
}
class Browser extends Application{
	public Browser(String appName){
		super(appName);
	}
	@Override
	public void execute(){
		System.out.println("画面を開きWebサイトを表示");
	}
}
class Editor extends Application{
	public Editor(String appName){
		super(appName);
	}
	@Override
	public void execute(){
		System.out.println("画面を開き文字の入出力を行う");
	}
}
class Music extends Application{
	public Music(String appName){
		super(appName);
	}
	public void execute(){
		System.out.println("ランダムな曲を流します");
	}
}
interface USB{
	void execute();
}
class USBMemory implements USB{
	@Override
	public void execute(){
		System.out.println("メモリに書き込む");
	}
}
class USBFan implements USB{
	@Override
	public void execute(){
		System.out.println("扇風機を回す");
	}
}