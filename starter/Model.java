/*
 * Lizzie Howell
 * 2/12/2024
 * Assignment 2 - Turtle Wars!
 */
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
			this.turtleX += Math.min(4, Math.abs(destX - turtleX));
		}
		else if(this.turtleX > this.destX){
			this.turtleX -= Math.min(4, Math.abs(destX - turtleX));
		}
		if(this.turtleY < this.destY){
			this.turtleY += Math.min(4, Math.abs(destY - turtleY));
		}
		else if(this.turtleY > this.destY){
			this.turtleY -= Math.min(4, Math.abs(destY - turtleY));
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
	}
	public void moveLeft(){
		this.destX -= 4;
	}
	public void moveUp(){
		this.destY -= 4;
	}
	public void moveDown(){
		this.destY += 4;
	}
}