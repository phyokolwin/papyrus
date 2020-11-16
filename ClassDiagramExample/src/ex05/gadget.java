package ex05;

public abstract class gadget {

	/**
	 * 
	 */
	private double price;
	/**
	 * 
	 */
	private String description;
	/**
	 * 
	 */
	private String name;
	/**
	 * Getter of price
	 */
	public double getPrice() {
	 	 return price; 
	}
	/**
	 * Setter of price
	 */
	public void setPrice(double price) { 
		 this.price = price; 
	}
	/**
	 * Getter of description
	 */
	public String getDescription() {
	 	 return description; 
	}
	/**
	 * Setter of description
	 */
	public void setDescription(String description) { 
		 this.description = description; 
	}
	/**
	 * Getter of name
	 */
	public String getName() {
	 	 return name; 
	}
	/**
	 * Setter of name
	 */
	public void setName(String name) { 
		 this.name = name; 
	}
	/**
	 * 
	 */
	public abstract void displayInfo(); 

}
