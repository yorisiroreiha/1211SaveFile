public class AppBird{
	public static void main(String[] args){
		Bird bird = new Bird() ;
		bird.fly() ;
	}
}
/*インターフェイスは属性を基本持つことができず、操作しか持たない(例外：finalで定数化したもの)
操作はpublic abstract が省略されているのでpublic をつけ忘れるとコンパイルエラーになる
全ての操作をOverrideしないとコンパイルエラーになる
たぶん以上！
*/