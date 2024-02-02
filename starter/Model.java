public class Model
{
	private int turtleX;
	private int turtleY;
	private int destX;
	private int destY;

	public Model()
	{
	}

	public void update()
	{
		// Move the turtle
		if(this.turtleX < this.destX){
			this.turtleX += Math.min(4, destX - turtleX);
		}
		else if(this.turtleX > this.destX){
			this.turtleX -= Math.min(4, destX - turtleX);
		}
		if(this.turtleY < this.destY){
			this.turtleY += Math.min(4, destX - turtleX);
		}
		else if(this.turtleY > this.destY){
			this.turtleY -= Math.min(4, destX - turtleX);
		}
	}

	public void setDestination(int x, int y)
	{
		this.destX = x;
		this.destY = y;
	}
	
	public int getTurtleX()
	{
		return turtleX;
	}
	
	public int getTurtleY()
	{
		return turtleY;
	}
}