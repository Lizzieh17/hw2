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
			this.turtleX -= Math.min(4, destX + turtleX);
		}
		if(this.turtleY < this.destY){
			this.turtleY += Math.min(4, destY - turtleY);
		}
		else if(this.turtleY > this.destY){
			this.turtleY -= Math.min(4, destY+ turtleY);
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
	public void moveRight(){
		this.destX += 4;
		// setDestination(destX, destY);
	}
	public void moveLeft(){
		this.destX += -4;
		// setDestination(destX, destY);
	}
	public void moveUp(){
		this.destY += 4;
		// setDestination(destX, destY);
	}
	public void moveDown(){
		this.destY += -4;
		// setDestination(destX, destY);
	}
}