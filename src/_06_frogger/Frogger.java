package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    int x = 400;
    int y = 550;
    
    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
    	
    }

    @Override
    public void draw() {
    	background(100,100,100);
    	fill(0, 100, 0);
    	ellipse(x, y, 50, 50);
    }
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
                y-=8;
            }
            else if(keyCode == DOWN)
            {
                y+=8; 
            }
            else if(keyCode == RIGHT)
            {
                x+=8;
            }
            else if(keyCode == LEFT)
            {
                x-=8;
            }
        }
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
