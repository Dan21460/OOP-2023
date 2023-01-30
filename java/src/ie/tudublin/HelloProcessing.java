package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		
		
	}

	
	public void draw()
	{	

		stroke(255);
		line(10, 10,100,100); // x1, y1, 
		circle(300, 250, 70);
		rect(10,300,20,100);
		// stroke()
		triangle(40, 90, 300, 30, 80, 20);
    
	}

}