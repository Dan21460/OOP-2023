package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	int videoScale = 8;

	int cols, rows;

	public void settings()
	{
		size(800, 800);
	}

	public void setup() {


		

				
	}


	
	void loadStars()
	{
		Table table = loadTable("HabHYG15ly.csv", "header");
		for(TableRow r:table.rows())
		{
			Star s = new Star(r);
			stars.add(s);
		}
	}

	public Star(TableRow tr)
 	{
 		this(
 			tr.getInt("Hab?") == 1, 
 			tr.getString("Display Name"), 
 			tr.getFloat("Distance"),
 			tr.getFloat("Xg"),
 			tr.getFloat("Yg"),
 			tr.getFloat("Zg"),
 			tr.getFloat("AbsMag")
 		);
 	}
 	
 	public Star(boolean hab, String displayName, float distance, float xG, float yG, float zG, float absMag) {
 		this.hab = hab;
 		this.displayName = displayName;
 		this.distance = distance;
 		this.xG = xG;
 		this.yG = yG;
 		this.zG = zG;
 		this.absMag = absMag;
 	}

}