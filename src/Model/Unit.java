package Model;

public class Unit {
	protected int hp;
	protected int hit;
	protected String name;

	
	public Unit(String name, int hp, int hit) {
		this.name = name;
		this.hp = hp;
		this.hit = hit;
	}
	
	public void inform() {
		System.out.println("hp = " + this.hp);
	}
	
	public void name() {
		System.out.println(name);
	}
	
	public void attack(Unit unit){
		 System.out.println(this.hp = this.hp - this.hit);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
