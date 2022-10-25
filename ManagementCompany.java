/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Management Company that hold properties inside a plot
 * Due: 10/24/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Rowan Wiles
*/
public class ManagementCompany {
	private String name, ID;
	private double fee;
	public int MAX_PROPERTY = 5, MGMT_WIDTH = 10, MGMT_DEPTH = 10;
	private Property[] properties;
	private Plot plot;
	private int numberOfProperties = 0;
	public ManagementCompany(String name, String ID, double fee) {
		this.name = name;
		this.ID = ID;
		this.properties = new Property[numberOfProperties];
		this.fee=fee;
		this.plot = new Plot(0,0,MGMT_WIDTH,MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
	}
	public ManagementCompany() {
		this.name = "";
		this.ID = "";
		this.plot = new Plot(0,0,MGMT_WIDTH,MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
	}
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
		this.name = name;
		this.ID = taxID;
		this.fee=mgmFee;
		this.plot = new Plot(x,y,width,depth);
		this.properties = new Property[MAX_PROPERTY];
	}
	public ManagementCompany(ManagementCompany mngmCo) {
		this.name = mngmCo.name;
		this.ID = mngmCo.ID;
		this.fee=mngmCo.fee;
		this.plot = mngmCo.getPlot();
		this.properties = mngmCo.getProperties();
	}
	public String getName() {
		return this.name;
	}
	public String getTaxID() {
		return this.ID;
	}
	public double getMgmFeePer() {
		return this.fee;
	}
	public Property[] getProperties() {
		return this.properties;
	}
	public Plot getPlot() {
		return this.plot;
	}
	public int getNumberOfPropertiesCount() {
		return this.numberOfProperties;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public void setProperties(Property[] properties) {
		this.properties = properties;
	}
	public void setPlot(Plot plot) {
		this.plot = plot;
	}
	/*
	public void setNumberOfProperties(int numberOfProperties) {
		this.numberOfProperties = numberOfProperties;
	}
	*/
	public int addProperty(Property property) {
		if (property == null)
			return -2;
		int start = -999;
		for (int i = 0; i < this.properties.length; i++) {
			if (this.properties[i] == null) {
				start = i;
				break;
				}
			if (property.getPlot().overlaps(this.properties[i].getPlot()))
				return -4;
			}
		if (!this.plot.encompasses(property.getPlot())) //!
			return -3;
		if (start == -999) 
			return -1;
		this.properties[start] = property;
		return start;
	}
	public int addProperty(Property[] newProperties) {
		int result = 0;
		for (int i = 0; i < newProperties.length; i++) {
			result = this.addProperty(newProperties[i]);
			if (result < 0)
				return result;
		}
		return result;
	}
	public int addProperty(String name, String city, double rent, String owner) {
		return this.addProperty(new Property(name, city, rent, owner, new Plot()));
	}
	public int addProperty(String name, String city, double rent, String owner, 
			int x, int y, int width, int depth) {
		return this.addProperty(new Property(name, city, rent, owner, x,y,width,depth));
	}
	public double getTotalRent() {
		double total = 0.0;
		for (int i = 0; i < this.properties.length; i++) {
			if (this.properties[i] != null)
			total += this.properties[i].getRentAmount();
			else
				break;
		}
		return total;
	}
	public Property getHighestRentPropperty() {
		double highestRent = this.properties[0].getRentAmount();
		Property highestRentProperty = this.properties[0];
		for (int i = 1; i < this.properties.length; i++) {
			if (this.properties[i] == null)
				break;
			if (this.properties[i].getRentAmount() >= highestRent) {
				highestRent = this.properties[i].getRentAmount();
				highestRentProperty = this.properties[i];
			}
		}
		return highestRentProperty;
	}
	public void removeLastProperty() {
		int start = 0;
		for (int i = 0; i < this.properties.length; i++) {
			if (this.properties[i] == null) {
				start = i;
				break;
				}}
		if (start != 0)
			this.properties[start - 1] =null;
	}
	public boolean isPropertiesFull() {
		int start = -999;
		for (int i = 0; i < this.properties.length; i++) {
			if (this.properties[i] == null) {
				start = i;
				break;
				}}
		if (start == -999)
			return true;
		return false;
	}
	public int getPropertiesCount() {
		int start = -999;
		for (int i = 0; i < this.properties.length; i++) {
			if (this.properties[i] == null) {
				start = i;
				break;
				}}
		if (start == -999)
			return this.properties.length;
		return start;
	}
	public boolean isManagementFeeValid() {
		return !(this.fee < 0 || 100 < this.fee);
	}
	public String toString() {
		String output = "";
		output += "List of the properties for " + this.name + ", taxID: " + this.ID + "\n\n";
		for (int i = 0; i < this.properties.length; i++) {
			if (this.properties[i] != null)
				output += "Property Name: " + this.properties[i].getName() + "\n"+"Located in " + 
						this.properties[i].getCity() + "\n"+"Belonging to: " + 
						this.properties[i].getOwner() + "\nRent Amount: " + 
						this.properties[i].getRentAmount() + "\n";
			else
				break;
		}
		output += "\nTotal Management Fee: " + this.getTotalRent();
		return output;
	}
}
