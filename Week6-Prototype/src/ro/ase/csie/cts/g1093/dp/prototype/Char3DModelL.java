package ro.ase.csie.cts.g1093.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Char3DModelL implements Cloneable {
	
	CharacterType type;
	String color;
	
	ArrayList<Integer> graphicPoints=new ArrayList<>();

	public Char3DModelL(CharacterType type, String color) {
		super();
		this.type = type;
		this.color = color;
		
		System.out.println("Generating the 3D model points....");
		
		try {
			Thread.sleep(2000);
			Random random = new Random(10);
			for (int i = 0; i<20; i++) {
				graphicPoints.add(random.nextInt(1000));
			}
			
			System.out.println("Model loaded.");
			
		}catch(InterruptedException e) {
			//TODO auto generated catch block
			e.printStackTrace();
			
		}
	}

	

	private Char3DModelL() {
		// TODO Auto-generated constructor stub
	}



	@Override  
	public Object clone() throws CloneNotSupportedException {
		
		//DONT
//		Char3DModelL copy = new Char3DModelL(this.type, this.color);
		
		Char3DModelL copy = new Char3DModelL();
		copy.type = this.type;
		copy.color=this.color;
		copy.graphicPoints = (ArrayList<Integer>) this.graphicPoints.clone();
		
				
				return copy;
		
	}
	
	

}
