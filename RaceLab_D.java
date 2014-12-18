import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class RaceLab_D { 

   private static final int NUMBOTS = 20;
   
   public static void main(String[] args) {
      Display.setSize(20, 20);
      Display.setSpeed(10);
      Robot[] robots = new Robot[NUMBOTS];
         for(int i = 0; i<NUMBOTS; i++) {
            robots[i] = new Robot(1, i+1, Display.EAST, 0);
         }
         while (true) {
            int luckyRobot = (int) (Math.random()*NUMBOTS);
               robots[luckyRobot].move();
               if (robots[luckyRobot].getX() > 20) {
                  System.out.println("Robot "+luckyRobot+" won!");
                  break;
               }
         }
   }
}