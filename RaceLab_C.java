import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class RaceLab_C { 
   public static void main(String[] args) {
      Display.setSize(20, 20);
      Display.setSpeed(8);
      Robot[] robots = new Robot[17];
         for(int i = 0; i<17; i++) {
            robots[i] = new Robot(1, i+1, Display.EAST, 0);
         }
         while (true) {
            int luckyRobot = (int) (Math.random()*5);
               robots[luckyRobot].move();
         }
   }
}