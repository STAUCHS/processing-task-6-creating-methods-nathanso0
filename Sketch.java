import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {

    size(800, 800);

  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {

    background(210, 255, 173);

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    for (int counter = 15; counter >= 0; counter -= 1){ 
      for(int inty = 0; inty < height; inty +=height/6 ){
        for (int intx = 0; intx < width; intx += width/6 ) {
          house(intx, inty);
        }
      }
    }
  }
  /**
   * Description
   * 
   * @param 
   * @param 
   * @return
   * @author 
   */


  private void house(int intHouseX, int intHouseY ){
    fill(100,25,0);
    rect(intHouseX, intHouseY+height/20, width/15, height/15);
    fill(150,75,0);
    rect(intHouseX+width/50, intHouseY+height/15, width/35, height/20);
    fill(35,35,35);
    triangle(intHouseX+width/15, intHouseY+height/20, intHouseX+width/30, intHouseY+height/50, intHouseX, intHouseY+height/20);
    fill(255,215,0);
    ellipse(intHouseX+width/35, intHouseY+height/11, width/90, height/90);
  }
  
  
}