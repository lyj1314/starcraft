package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Friebat;
import Model.Marin;
import Model.Unit;

public class Controller {

	public static void main(String[] args) {
		
//		Unit m1 = new Marin();
//	    Unit m2 = new Marin();	
//	    Unit f1 = new Friebat();
//	    Unit f2 = new Friebat();
	    
	  
	    
	    List<Unit> list = new ArrayList<Unit>();
	    Scanner scanner = new Scanner(System.in);
	    while(true) {
	    	System.out.println("��������: 1");
	    	System.out.println("�ĺ�����: 2");
	    	System.out.println("���� ��Ȳ ����: 3");
	    	System.out.println("���ּ���: 4");
	    	int input = scanner.nextInt();
	    	
	    	switch(input) {
	    	
	    	case 1 :
	    		System.out.println("�̸����Է���");
	    		String name = scanner.next();
	    		Marin marin = new Marin(name);
	    		list.add(marin);
	    		break;

	    	case 2 :
	    		System.out.println("�̸����Է���");
	    		String name1 = scanner.next();
	    		Friebat friebat = new Friebat(name1);
	    		list.add(friebat);
	    		break;
	    	
	    	case 3 :
	    		System.out.println(list.size() + "����");
	    		for(int i=0; i<list.size(); i++){
	    			Unit unit = list.get(i);
		    		unit.name();
		    		break;
	    		}
	    	
	    	case 4 :
	    		for (int i = 0; i < list.size(); i++) {
	    			Unit unit = list.get(i);
	    			System.out.println( i +":"+ unit.getName());
				}
	    		
	    		int input1 = scanner.nextInt();
	    		if(input1 >0) {
	    			System.out.println("1:���ݰ���");
	    			System.out.println("2:�̵��϶�");
	    		} else {
	    			System.out.println("1:���ݰ���");
	    			System.out.println("2:�̵��϶�");
	    			break;
	    		}
	    	int input2 = scanner.nextInt();	
	    		Unit unit = list.get(input2);
			System.out.println("�����Ҽ����´�� : " + unit.getName());
			 
					
				
	    	}
	    	}
	    }
}




//TODO Auto-generated method stub


		//Unit m1 = new Marin();
	    //Unit m2 = new Marin();	
	    //Unit f1 = new Friebat();
	    //Unit f2 = new Friebat();
	    
	    
	    //m1.inform();
	    //m1.attack(f2);