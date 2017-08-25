package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  C. Piercy
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        turnLeft();
        moveThree();
        turnLeft();
        moveTwo();
        pickBeeper();
        moveThree();
        transMove();
        transMove();
        pickBeeper();
        moveTwo();
    }
   
   public void turnRight() {
      turnLeft();
      turnLeft();
      turnLeft();
}
   public void moveTwo() {
       move();
       move();
    }
   public void transLeft() {
       pickBeeper();
       turnLeft();
    }
   public void transMove() {
       transLeft();
       moveThree();
    }

   public void moveThree() {
    move();
    move();
    move();
}
}


