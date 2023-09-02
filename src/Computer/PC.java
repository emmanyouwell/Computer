package Computer;

import java.util.ArrayList;
import java.util.List;

public class PC {
	private List<Parts> parts;
	private float price;
	
	
	PC(){
		
	}
	PC(List<Parts> parts, float price){
		setParts(parts);
		setPrice(price);
	}
	
	public List<Parts> getParts() {
		return parts;
	}
	public void setParts(List<Parts> parts) {
		this.parts = parts;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
