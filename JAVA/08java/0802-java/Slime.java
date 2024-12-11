public class Slime extends Monster implements DropMonsterItem{
	public Slime(char name,int hp){
		super("スライム"+name,hp);
	}
	@Override
	public void Escape(){
		System.out.println(this.getName()+"は跳ねながら何処かへ消えてった");
	}
	public void DropItem(){
		System.out.println("スライム核を落とした");
	}
}