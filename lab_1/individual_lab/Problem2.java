package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        firstHalfRace();
        secondHalfRace();
        returnToPositions();
    }
   
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void firstHalfRace() {
        turnRight();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
    }
    public void secondHalfRace() {
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
    }
    public void returnToPositions() {
        turnLeft();
    }
}