/*
 * if loop lab3
 */

package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet {

    public void settings() {
        fullScreen();
    }

    int mode = 0;
    float cx;
    float cy;

    public void keyPressed() {

        if (keyCode >= '0' && keyCode <= 9)
            mode = keyCode - '0';
    }

    public void setup() {
        colorMode(HSB);
    }

    public void draw() {
        background(0);
        noStroke();
        switch (mode) {
            case 0:
                int numCircles = (int) max(1, mouseX / 50.0f);
                float d = width / numCircles;
                for (int j = 0; j < numCircles; j++) {
                    for (int i = 0; i < numCircles; i++) {
                        float x = (d * 0.5f) + (d * i);
                        float y = (d * 0.5f) + (d * j);
                        float c = ((i + j) / ((numCircles - 1) * 2.0f)) * 255.0f;
                        fill(c + off, 255, 255);
                        circle(x, y, d);


                    }
                }
                off += mouseY / 50.0f;
                break;
            case 1:
                
                break;

            default:
                
                break;

      
        }
    }

}