package Computer;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//List of parts
		ArrayList<Parts> parts = new ArrayList<Parts>();
		
		//List of Specifications
		ArrayList<String> motherboardSpecs = new ArrayList<String>();
		
		motherboardSpecs.add("Manufacturer – ASOS");
		motherboardSpecs.add("Socket - LGA1200");
		motherboardSpecs.add("Chipset – INTOL H310");
		motherboardSpecs.add("Form Factor – miniITX");
		motherboardSpecs.add("RAM type – DDR4");
		motherboardSpecs.add("Max RAM size – 64 GB");
		motherboardSpecs.add("RAM slots count – 2");
		motherboardSpecs.add("SATA slots count – 4");
		motherboardSpecs.add("M2 slots count – 2");
		
	
		
		//Individual parts
		Parts pcCase = new Parts("Pc Case", false, pcCaseSpecs);
		Parts motherboard = new Parts("Motherboard", motherboardSpecs);
		
		
		
		//Add individual parts to your list
		parts.add(pcCase);
		parts.add(motherboard);
		
		
		//Create your new PC
		PC pc1 = new PC(parts,50999.75f);
		
		
		
		//Print the parts using for each
		for (Parts p : pc1.getParts()) {
			//Check for broken parts and print it.
			
			System.out.println(p.getName() + p.checkPart());
		}
		System.out.println();
		//Print the price
		System.out.println(pc1.getPrice());
		System.out.println();
		
	
		
		//Then, fix it.
		pc1.getParts().get(0).fixPart();
		
		//pc1 : Object
		//pc1.getParts() : ArrayList<Parts> parts
		//parts.get(0) : Parts pc_case
		//pc_case.fixPart()
		
		
		//Print the parts again
		for (Parts p : pc1.getParts()) {
			//Check for broken parts and print it.
			
			System.out.println(p.getName() + p.checkPart());
		}
		System.out.println();
		
		//Print specifications
//		for (Parts p : pc1.getParts()) {
//		System.out.println(p.getName() + " specifications:");
//		if (p.getSpecs().isEmpty()) {
//			System.out.println("None");
//		}
//		else {
//			p.printSpecs();
//		}
//	}
		
		
		
		
		//Nested for each
//		for (Parts p : pc1.getParts()) {
//			for (String s : p.getSpecs()) {
//				System.out.println(s);
//			}
//		}
		
		

		
		
	}

}
