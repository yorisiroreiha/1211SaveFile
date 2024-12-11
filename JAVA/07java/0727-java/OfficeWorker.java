public abstract class OfficeWorker{
	String name;
	public OfficeWorker(String name){
		this.name = name ;
	}
	public void introduce(){
		System.out.printf("はじめまして。私は%sです%n",this.name);
	}
	public abstract void work();
}
class OrdinaryOfficeWorker extends OfficeWorker{
	public OrdinaryOfficeWorker(String name){
		super(name);
	}
	@Override
	public void work(){	System.out.printf("%sは９時から５時まで働いている。遅刻や欠勤はない%n",this.name); }
}
class EliteOfficeWorker extends OfficeWorker{
	public EliteOfficeWorker(String name){
		super(name);
	}
	@Override
	public void work(){	System.out.printf("%sは仕事がはやい！しかも正確だ。%n",this.name); }
}
class LazyOfficeWorker extends OfficeWorker{
	public LazyOfficeWorker(String name){
		super(name);
	}
	@Override
	public void work(){	System.out.printf("%sはPCの画面を即座に切り替えた。何をしていたのだろう。%n",this.name); }
}