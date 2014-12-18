import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class RaceLab_A { 

   public static void main(String[] args) {
      Display.setSize(20, 20);
      Display.setSpeed(8);
      Robot anna = new Robot();
      Robot bobbie = new Robot(1 , 2,Display.EAST, 0);
      Robot carla = new Robot(1, 3, Display.EAST, 0);
      Robot devon = new Robot(1, 4, Display.EAST, 0);
      Robot earnest = new Robot(1, 5, Display.EAST, 0);
        
      while (true) {
         int luckyRobot = (int) (Math.random()*5);
         if (luckyRobot == 0)
            anna.move();
         else if (luckyRobot ==1)
            bobbie.move();
         else if (luckyRobot == 2)
            carla.move();
         else if (luckyRobot == 3)
            devon.move();
         else earnest.move();
      }
   }
}