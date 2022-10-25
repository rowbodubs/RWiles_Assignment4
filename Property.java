/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Property on a plot with a name, location, owner, and rental amount.
 * Due: 10/24/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Rowan Wiles
*/

public class Property {
	private String name, city, owner;
	private double rentalAmount;
	private Plot plot;
	public Property(String name, String city, double rentalAmount, String owner, Plot plot) {
		this.name = name;
		this.city = city;
		this.rentalAmount = rentalAmount;
		this.owner = owner;
		this.plot = plot;
	}
	public Property(Property property) {
		this.name = property.name;
		this.city = property.city;
		this.rentalAmount = property.rentalAmount;
		this.owner = property.owner;
		this.plot = property.plot;
	}
	public Property() { ////////////////////////
		this.name = "";
		this.city = "";
		this.owner = "";
		this.plot=new Plot(0,0,1,1);
	}
	public Property(String name, String city, double rentalAmount, String owner) { ////////////////////////
		this.name = name;
		this.city = city;
		this.owner = owner;
		this.rentalAmount = rentalAmount;
		this.plot=new Plot(0,0,1,1);
	}
	public Property(String propertyName, String city, double rentAmount, 
			String owner, int x, int y, int width, int depth) {
		this.name = propertyName;
		this.city = city;
		this.rentalAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x,y,width,depth);
	}
	public Property(String propertyName, String city, 
			String owner) {
		this.name = propertyName;
		this.city = city;
		this.rentalAmount = 0;
		this.owner = owner;
		this.plot = new Plot(0,0,1,1);
	}
	public String getName() {
		return this.name;
	}
	public String getCity() {
		return this.city;
	}
	public String getOwner() {
		return this.owner;
	}
	public double getRentAmount() {
		return this.rentalAmount;
	}
	public Plot getPlot() {
		return this.plot;
	}
	public String getPropertyName() {
		return this.name;
	}
	public void setPropertyName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setRentAmount(double rentalAmount) {
		this.rentalAmount = rentalAmount;
	}
	public void setPlot(Plot plot) {
		this.plot = plot;
	}
	public String toString() {
		return this.name + "," + this.city + "," + this.owner + "," + this.rentalAmount;
	}
}
