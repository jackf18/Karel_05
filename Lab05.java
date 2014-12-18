/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Jack Flaherty>  // replace <...> with your name
* @version <11/5/14> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab05 {
   public static void runTheRace(Racer arg) {
   arg.move();
   arg.jumpRight();
   arg.shuttle(2, 7);
   arg.turnAround();
   arg.shuttle(2, 0);
   arg.turnAround();
   arg.shuttle(4, 5);
   arg.turnAround();
   arg.shuttle(4, 0);
   arg.turnAround();
   arg.shuttle(6, 3);
   arg.turnAround();
   arg.shuttle(6, 0);
   arg.jumpLeft();
   arg.move();
   arg.put(15);
   arg.turnAround();
   arg.move();
 }

   public static void main(String[] args) {
   Display.openWorld("maps/shuttle.map");
   Display.setSize(10, 10);
   Display.setSpeed(8);
   Racer jack = new Racer(7);
   Racer michael = new Racer(4);
   Racer tommy = new Racer(1);
   runTheRace(jack);
   runTheRace(michael);
   runTheRace(tommy);
      
   }
 
}  
