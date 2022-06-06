package p2;

/*
 * Entity  @Entity 
 * POJO  :- Plain Old Java Object
 * Bean class :- 
 * 
 * 
 *  1) All properties must be marked private 
 *  2) availability of default constructor
 *  3) getters and setters of all properties 
 *  4) should implements Serializable 
 *  5) hashcode and equals 
 *  
 * 
 * */


public class Laptop
{
	private int ramSize;
	private String brandName;
	
	public Laptop() {
		
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	
}
