import java.util.* ;
public class AppCamp{
	public static void main(String[] args){
		String[] csv = {
			"山田,ビール,4600",
			"田中,ガソリン,5200",
			"鈴木,駐車場,2500",
			"田中,食材,6000",
			"鈴木,ガソリン,2000",
			"大野,食材,2400",
			"山田,キャンプ場,10000",
		};
		List<Data> list = new ArrayList<>() ;
		Map<String,Integer> human = new HashMap<>();
		Map<String,Integer> item = new HashMap<>();
		for( int i = 0 ; i < csv.length ; i++ ){
			String[] temp = csv[i].split(",") ;
			int n = Integer.parseInt(temp[2]) ;
			list.add(new Data(temp[0],temp[1],n) );
		}
		for( int i = 0 ; i < list.size() ; i++ ){
			if( human.containsKey(list.get(i).name) ){
				human.put(list.get(i).name,human.get(list.get(i).name)+list.get(i).price);
			}else{
				human.put(list.get(i).name,list.get(i).price);
			}
			if( item.containsKey(list.get(i).item) ){
				item.put(list.get(i).item,item.get(list.get(i).item)+list.get(i).price);
			}else{
				item.put(list.get(i).item,list.get(i).price);
			}
		}
		int total = 0 ;
		for( String key : item.keySet()){
			System.out.printf("%s%d%n",key,item.get(key));
			total += item.get(key) ;
		}
		int ans = total / human.size() ;
		System.out.printf("個人別会計(１人あたり:%d円)%n",ans);
		for( String key : human.keySet()){
			System.out.printf("%s%d%n",key,human.get(key)-ans);
		}
	}
}
class Data{
	String name;
	String item;
	int price;
	public Data(String name,String item,int price){
		this.name = name ;
		this.item = item ;
		this.price = price ;
	}
}