package Model;

public class Marin extends Unit{
	public Marin() {
		super(100);
	}
	 
	
	
	
	public int HP = 50;
	public int damige = 5;
	
	public void inform0(){
		
	 System.out.println("ü����"+ this.HP);
//	 System.out.println("��������"+this.dam);
	 System.out.println("�Դϴ�");
	}
	
	public void attack(Marin target){
		target.HP = target.HP - this.damige;
		
	
	
		if(target.HP>0){
			System.out.println(target.HP);
			
		} else {
			System.out.println("���");
		}		
		}
	

	public void attack(Friebat target){
		target.HP = target.HP - this.damige;
		
		if(target.HP>0){
			System.out.println(target.HP);
		} else {
			System.out.println("���");
		}			
	}
	
	}


