/*
 * Lizzie Howell
 * 2/12/2024
 * Assignment 2 - Turtle Wars!
 */
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
//import java.io.IOException;
import java.io.File;
import javax.swing.JButton;

public class View extends JPanel
{
	private JButton b1;
	private BufferedImage turtle_image;
	private Model model;

	public View(Controller c, Model m)
	{
		b1 = new JButton("Don't push me!");
		model = m;
		b1.addActionListener(c);
		this.add(b1);
		c.setView(this);
		try {
			this.turtle_image = ImageIO.read(new File("turtle.png"));
		}
		catch(Exception e){
			e.printStackTrace(System.err);
			System.exit(1);
		}
	}

	void removeButton(){
		this.remove(b1);
		this.repaint();
	}

	public void paintComponent(Graphics g){
		g.setColor(new Color(128, 255, 255));
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.drawImage(this.turtle_image, model.getTurtleX(), model.getTurtleY(), null);
	}
}
