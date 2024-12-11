import java.util.*;
public class RootCat{
	public static void main(String[] args){
		String[] type = {"白","黒","茶トラ"};
		Scanner sca = new Scanner(System.in);
		ArrayList<HaveCat> cats = new ArrayList<>();
		System.out.println("***猫集め***");
		while(true){
			System.out.print("1.集める 2.遊ぶ 3.終了>>");
			int select = sca.nextInt();
			if( select == 3 ){
				for( HaveCat n : cats ){
					n.showCat();
				}
				System.out.println("また遊んでね。おしまい");
				break;
			}
			notEnd(cats,select,type);
		}
	}
	public static void notEnd(ArrayList<HaveCat> hc,int select,String[] type){
		if( select == 1 ){
			int n = new Random().nextInt(type.length);
			System.out.printf("%s猫を見つけた！%n",type[n]);
			System.out.print("名前をつけてください＞＞");
			String name = new Scanner(System.in).nextLine();
			hc.add(new HaveCat(name,type[n]));
		}else{
			if( hc.size() == 0 ){
				System.out.println("まだ遊ぶ猫がいません。。。");
			}else{
				Collections.sort(hc,(c1,c2)->-(c1.getLike()-c2.getLike()));
				int count = 0 ;
				for( HaveCat n : hc ){
					System.out.print(count+"・・・");
					count++ ;
					n.showCat();
				}
				System.out.print("どの猫とあそびますか?>>");
				select = new Scanner(System.in).nextInt();
				hc.get(select).playCat();
			}
		}
	}
}
class HaveCat{
	String name;
	int like;
	String type;
	public HaveCat(String name,String type){
		this.name = name ;
		this.type = type ;
		this.like = 0 ;
	}
	public void playCat(){
		this.like++;
		System.out.printf("%sと遊んだ%n...%n%sの親密度がアップした！%n",this.name,this.name);
	}
	public void showCat(){
		System.out.printf("%s[%s](%d)%n",this.name,this.type,this.like);
	}
	public int getLike(){
		return this.like ;
	}
}