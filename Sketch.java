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
          drawhouse(intx, inty);
        }
      }
    }
    for (int counter3 = 15; counter3 >= 0; counter3 -= 1){ 
      for(int inty3 = 0; inty3 < height; inty3 +=height/6){
        for (int intx3 = 0; intx3 < width; intx3 += width/6 ) {
          drawbody(intx3, inty3);
        }
      }
    }
  }
/**
   * Description
   * 
   * @param intHeadX
   * @param intHeadY
   * @return Boolean
   * @Nathan.So 
   */
  public boolean drawhead(int intHeadX, int intHeadY){
    fill(255,203,164);
    ellipse(intHeadX+width/9, intHeadY+height/7, width/34, height/34);
    if(intHeadX % 3 == 0 || intHeadY % 3 == 0){
      return true;
    }
      else {
        return false;
      }

    }
      
  public void drawbody(int intBodyX,int intBodyY){
    boolean bllshirtcolor = drawhead(intBodyX, intBodyY);
    if (bllshirtcolor == true){
      fill(45,45,45);

      rect(intBodyX+width/10, intBodyY+height/6, width/55, height/25);

      rect(intBodyX+width/10, intBodyY+height/6, width/110, height/25);

      fill(255,255,255);


      rect(intBodyX+width/10, intBodyY+height/7, width/55, height/25);


      drawhead(intBodyX, intBodyY);
    }
    else {

      fill(0,0,200);

      rect(intBodyX+width/10, intBodyY+height/6, width/55, height/25);

      rect(intBodyX+width/10, intBodyY+height/6, width/110, height/25);

      fill(0,0,0);
      rect(intBodyX+width/10, intBodyY+height/7, width/55, height/25);

      drawhead(intBodyX, intBodyY);
    }
  }


  /**
   * Description
   * 
   * @intHouseX 
   * @intHouseY 
   * @return Void
   * @Nathan.So
   */


  private void drawhouse(int intHouseX, int intHouseY ){
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