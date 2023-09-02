package Computer;

public class Parts {
	private String name;
	private boolean isFunctional;
	
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
	
	
	
	public void fixPart() {
		setFunctional(true);
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
