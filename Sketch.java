import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {

    size(400, 400);

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
      for(int inty = 0; inty < height; inty +=height/10 ){
        for (int intx = 0; intx < width; intx += width/10 ) {
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
    rect(intHouseX, intHouseY, width/15, height/15);
    rect(intHouseX+width/50, intHouseY+height/35, width/35, height/30);

  }
  
  
}