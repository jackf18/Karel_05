import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab06Extras {
     
     public static void main(String[] args) {  	
     Display.openWorld("maps/numpty");
     Display.setSize(11, 11);
     Display.setSpeed(8);
     Robot jack07 = new Robot();
     Robot jack08 = new Robot(1, 2, Display.EAST, 10);
     Robot extraRobot = new Robot(7, 2, Display.EAST, Display.INFINITY);
     Robot jack09 = new Robot(1, 3, Display.EAST, Display.INFINITY);
     Robot jack10 = new Robot(1, 4, Display.EAST, Display.INFINITY);
     Robot jack11 = new Robot(1, 5, Display.EAST, Display.INFINITY);
     Robot jack12 = new Robot(1, 6, Display.EAST, Display.INFINITY); 
     
     int count = 0;
     while(jack07.frontIsClear() && !jack07.nextToABeeper()) {
		
     jack07.move();
		
     count++;
     }
     System.out.println("Number of steps is " + count + ".");
     
	  while(!jack08.nextToARobot ()) {
		
     jack08.move();
	
     }
     while(jack08.hasBeepers ()) {
		
     jack08.putBeeper();
		
     } 
     
     for(int n = 5; n > 0; n--) {
        for(int beepers = 4; beepers > 0; beepers--) {
            jack09.putBeeper();
        }
        jack09.move();
     }       
     
     while(jack10.frontIsClear()) {
         while(jack10.nextToABeeper()) {
		
         jack10.move();
	
         }
		
		    
         jack10.putBeeper();
     }

     while(!jack11.rightIsClear()) {
	
	
         jack11.putBeeper();
         jack11.move();
     }
  
     while(jack12.rightIsClear() || !jack12.nextToABeeper()) {
	
     jack12.move();
     }
}
}