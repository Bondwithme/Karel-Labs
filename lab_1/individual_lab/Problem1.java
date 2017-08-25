package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        startMove();
        beeperRetrieve();
        rightMove();
        beeperPlacement();
        rightMove();
    }
 public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
 }
 public void startMove() {
     turnLeft();
     move();
     move();
     turnRight();
     move();
     move();
     turnRight();
    }
 public void beeperRetrieve() {
     pickBeeper();
     move();
     pickBeeper();
     move();
     pickBeeper();
     move();
     pickBeeper();
     move();
     pickBeeper();
    }
 public void leftMove() {
     turnLeft();
     move();
     move();
    }
 public void rightMove() {
     turnRight();
     move();
     move();
     turnRight();
     move();
     move();
     turnRight();
    }
 public void beeperPlacement() {
     putBeeper();
     move();
     putBeeper();
     move();
     putBeeper();
     move();
     putBeeper();
     move();
     putBeeper();
    }
 
}