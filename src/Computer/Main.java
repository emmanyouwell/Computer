package Computer;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//List of parts
		ArrayList<Parts> parts = new ArrayList<Parts>();
		
		//Individual parts
		Parts pcCase = new Parts("Pc Case");
		Parts motherboard = new Parts("Motherboard");
		
		
		
		//Add individual parts to your list
		parts.add(pcCase);
		parts.add(motherboard);
		
		
		//Create your new PC
		PC pc1 = new PC(parts,50999.75f);
		
		
		
		//Print the parts using for each
		for (Parts p : pc1.getParts()) {
			//Check for broken parts and print it.
			
			System.out.println(p.getName());
		}
		
		//Print the price
		
		
		//Then, fix it.
		
		
		
	}

}
