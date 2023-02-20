package ie.tudublin;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;
import java.util.ArrayList;

public class StarMap extends PApplet
{

    ArrayList<Star> stars = new ArrayList<Star>();

    public void settings()
    {
        size(500, 500);
    }

    public void setup()
    {
        colorMode(HSB);
        background(0);
        smooth();

        loadStars();
    }

    public void drawGrid()
    {
        stroke(255);
        float border = 50.0f;

        int count = 10;
        float gap = (width - (border * 2.0f)) / (float) count;
        for(int i = -5 ; i <= 5 ; i ++)
        {
            float x = border + (gap * (i + 5));
            line(x, border, x, height - border);
            line(border, x, width - border, x);
        }
    }

    void loadStars()
    {
        Table table = loadTable("data\\HabHYG15ly.csv", "header");
        for(TableRow r : table.rows())
        {
            Star s = new Star(r);
            stars.add(s);
        }
    }

    public class Star
    {
        boolean hab;
        String displayName;
        float distance;
        float xG;
        float yG;
        float zG;
        float absMag;

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

        public Star(boolean hab, String displayName, float distance, float xG, float yG, float zG, float absMag)
        {
            this.hab = hab;
            this.displayName = displayName;
            this.distance = distance;
            this.xG = xG;
            this.yG = yG;
            this.zG = zG;
            this.absMag = absMag;
        }

	}

	public void draw()
	{   
		strokeWeight(2);        
		drawGrid(); // Add this line to draw the grid

		
	}

}