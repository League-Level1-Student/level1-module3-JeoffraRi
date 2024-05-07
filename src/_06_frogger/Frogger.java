package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 400;
    int x = 400;
    int y = 550;
    int carX = 150;
    int carY = 270;
    int difficulty = 70;
    //CHOOSE YOUR OWN DIFFICULTY
    //RUBRIC:
    
    // 5: Beginner
    // 8: Medium
    // 10: Hard
    // 15: Expert
    // 20: Insane
    // 25: HOW ARE YOU DOING THIS
    // 30: *faints*
    // 70: Speedrun if you dare
    
    Car carOne;
    Car carTwo;
    Car carThree;
    Car carFour;
    Car carFive;
    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
    carOne = new Car(200, 350, 20, 30);
    carTwo = new Car(600, 250, 20, 30);
    carThree = new Car(400, 150, 20, 30);
    carFour = new Car(200, 450, 20, 30);
    carFive = new Car(600, 50, 20, 30);
    }
    
    boolean intersects(Car car) {
   	 if ((y > car.getY() && y < car.getY()+70) &&
   	                (x > car.getX() && x < car.getX()+car.getSize())) {
   	   return true;
   	  }
   	
   	 else  {
   	  return false;
   	 }
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
        rect(carFour.x, carFour.y, 100, 50);
        rect(carFive.x, carFive.y, 100, 50);
        
        carOne.x+=difficulty;
        if(carOne.x>830) {
        	carOne.x=-30;
        }
        carTwo.x-=difficulty;
        if(carTwo.x<-30) {
        	carTwo.x=830;
        }
        carThree.x+=difficulty;
        if(carThree.x>830) {
        	carThree.x=-30;
        }
        carFour.x-=difficulty;
        if(carFour.x<-30) {
        	carFour.x=830;
        }
        carFive.x-=difficulty;
        if(carFive.x<-30) {
        	carFive.x=830;
        }

        if(intersects(carOne)) {
        	x = 400;
        	y = 550;
        }
        if(intersects(carTwo)) {
        	x = 400;
        	y = 550;
        }
       if(intersects(carThree)) {
    	   x = 400;
    	   y = 550;
       }
       if(intersects(carFour)) {
    	   x = 400;
    	   y = 550;
       }
       if(intersects(carFive)) {
    	   x = 400;
    	   y = 550;
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
