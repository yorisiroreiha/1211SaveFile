import java.util.* ;
public class AppWorkerCheck{
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in) ;
		System.out.println("あなたの部下に3人配属されました");
		ArrayList<OfficeWorker> ow = new ArrayList<>();
		for( int i = 0 ; i < 3 ; i++ ){
			System.out.printf("%d人目の名前を入力してください＞＞",i+1);
			String name = sca.next();
			int n = new Random().nextInt(3);
			switch(n){
				case 1 :
					ow.add(new OrdinaryOfficeWorker(name));
					break;
				case 2 :
					ow.add(new EliteOfficeWorker(name));
					break;
				default :
					ow.add(new LazyOfficeWorker(name));
					break;
			}
			ow.get(i).introduce();
		}

		while(true){
			System.out.println("誰の働きぶりを見にいきますか?");
			for( int i = 0 ; i < ow.size() ; i++ ){
				System.out.printf("%d・・・%s%n",i,ow.get(i).name);
			}
			System.out.println(ow.size()+"・・・終了");
			System.out.print("番号を入力してください>");
			int select = sca.nextInt();
			if( select == ow.size() ){break;}
			ow.get(select).work();
		}

	}
}