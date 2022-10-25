/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: a plot of land
 * Due: 10/24/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Rowan Wiles
*/

public class Plot {
	private int x, y, width, depth; //coords of top-left corner aswell as depth and width
	Plot() { //constructor
		this.x=0;
		this.y=0;
		this.depth=1;
		this.width=1;
	}
	Plot(int x, int y, int width, int depth) { //constructor
		this.x = x;
		this.y = y;
		this.depth=depth;
		this.width=width;
	}
	Plot(Plot plot) { //constructor
		this.x = plot.x;
		this.y = plot.y;
		this.depth=plot.depth;
		this.width=plot.width;
	}
	public int getX() { //return x
		return this.x;
	}
	public int getY() { //return y
		return this.y;
	}
	public int getDepth() { //return depth
		return this.depth;
	}
	public int getWidth() { //return width
		return this.width;
	}
	public void setX(int x1) { //set x
		this.x = x1;
	}
	public void setY(int y1) { //set y
		this.y = y1;
	}
	public void setWidth(int width1) { //set width
		this.width = width1;
	}
	public void setDepth(int depth1) { //set depth
		this.depth = depth1;
	}
	public boolean overlaps(Plot plot) {
		return ////////////find if this overlaps plot
				//find if top left corner is within
				plot.x < this.x && this.x < plot.x + plot.width &&
				plot.y < this.y && this.y < plot.y + plot.depth ||
				//try bottom right
				plot.x < this.x + this.width && 
				this.x + this.width < plot.x + plot.width &&
				plot.y <  this.y + this.depth && 
				this.y + this.depth < plot.y + plot.depth
				|| //try bottom left
				plot.x < this.x && 
				this.x < plot.x + plot.width &&
				this.y < plot.y + plot.depth && 
				this.y - this.depth < plot.y + plot.depth
				|| ////////////find if plot overlaps this
				//find if top left corner is within
				this.x < plot.x && plot.x < this.x + this.width &&
				this.y < plot.y && plot.y < this.y - this.depth ||
				//try bottom right
				this.x <= plot.x + plot.width && 
				plot.x + plot.width < this.x + this.width &&
				this.y < plot.y + plot.depth && 
				plot.y + plot.depth < this.y + this.depth
				|| //try bottom left
				this.x < plot.x && 
				plot.x < this.x + this.width &&
				this.y < plot.y + plot.depth && 
				plot.y + plot.depth < this.y + this.depth
				;
	}
	public boolean encompasses(Plot plot) {
		return /*///////////find if this is in plot
				//find if top left corner is within
				plot.x <= this.x && this.x <= plot.x + plot.width &&
				plot.y >= this.y && this.y >= plot.y - plot.depth &&
				//try bottom right
				plot.x <= this.x + this.width && 
				this.x + this.width <= plot.x + plot.width &&
				plot.y >= this.y + this.depth && 
				this.y - this.depth >= plot.y - plot.depth
				
				|| ////////////find if plot is in this */
				//find if top left corner is within
				this.x <= plot.x && plot.x <= this.x + this.width &&
				this.y <= plot.y && plot.y <= this.y + this.depth &&
				//try top right corner 
				this.x <= plot.x + plot.width && plot.x + plot.width <= this.x + this.width &&
				this.y <= plot.y && plot.y <= this.y + this.depth &&
				//try bottom left
				this.x <= plot.x && 
				plot.width <= this.x + this.width &&
				this.y <= plot.y + plot.depth && 
				plot.y - plot.depth <= this.y + this.depth &&
				//try bottom right
				this.x <= plot.x + plot.width && 
				plot.x + plot.width <= this.x + this.width &&
				this.y <= plot.y + plot.depth && 
				plot.y - plot.depth <= this.y + this.depth;
				
	}
	public String toString() { //convert to string
		return this.x + "," + this.y + "," + this.width + "," + this.depth;
	}
	//*
	public static void main(String[] args) {
		System.out.print(new Plot(0,0,10,10).encompasses(new Plot(1,1,1,1)));
	}
	//
}
