package _06_frogger;
import processing.core.PApplet;

public class Car extends PApplet {
int x;
int y;
int speed;
int size;

public Car (int x, int y, int speed, int size){
	this.x = x;
	this.y = y;
	this.speed = speed;
	this.size = size;
	
	x-=7;
}
void display()
{
  fill(0,255,0);
  rect(x , y,  100, 50);
}
}
 
