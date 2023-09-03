package Computer;


import java.util.List;

public class Parts {
	private String name;
	private boolean isFunctional;
	private List<String> specs;
	
	//Constructors
	Parts(){
		setFunctional(true);
	}
	Parts(String name){
		setName(name);
		setFunctional(true);
	}
	Parts(String name, boolean isFunctional){
		setName(name);
		setFunctional(isFunctional);
		
	}
	Parts(String name, List<String> specs){
		setName(name);
		setSpecs(specs);
		setFunctional(true);
	}
	Parts(String name, boolean isFunctional, List<String> specs){
		setName(name);
		setFunctional(isFunctional);
		setSpecs(specs);
		
	}
	//End of Constructor
	
	public String checkPart() {
		String msg="";
		if (isFunctional()) {
			msg = " (Functional)";
		}
		else {
			msg = " (Broken)";
		}
		return msg;
	}
	
	public void printSpecs() {
		for (String item : getSpecs()) {
			System.out.println(item);
		}
	}
	
	
	
	
	
	public void fixPart() {
		setFunctional(true);
	}
	
	public List<String> getSpecs() {
		return specs;
	}

	public void setSpecs(List<String> specs) {
		this.specs = specs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFunctional() {
		return isFunctional;
	}
	public void setFunctional(boolean isFunctional) {
		this.isFunctional = isFunctional;
	}
}
