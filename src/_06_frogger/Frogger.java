package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 400;
    int x = 400;
    int y = 550;
    int carX = 150;
    int carY = 270;
    Car carOne;
    Car carTwo;
    Car carThree;
    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
    carOne = new Car(200, 300, 20, 30);
    carTwo = new Car(600, 200, 20, 30);
    carThree = new Car(400, 100, 20, 30);
    }

    @Override
    public void draw() {
    	background(100,100,100);
    	fill(0, 100, 0);
    	ellipse(x, y, 40, 40);
    	if(x<0) {
    		x = 780;
    	}else if(x>800) {
    		x = 20;
    	}else if(y<0) {
    		y = 580;
    	}else if(y>600) {
    		y = 550;
    	}
    	
    	fill(255,135,0);
        rect(carOne.x, carOne.y,  100, 50);
        rect(carTwo.x, carTwo.y,  100, 50);
        rect(carThree.x, carThree.y, 100, 50);
        
        carOne.x+=5;
        if(carOne.x>830) {
        	carOne.x=-30;
        }
        carTwo.x-=5;
        if(carTwo.x<-30) {
        	carTwo.x=830;
        }
        carThree.x+=5;
        if(carThree.x>830) {
        	carThree.x=-30;
        }
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
