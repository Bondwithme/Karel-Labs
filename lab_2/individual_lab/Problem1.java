package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins(){
        set1Row();
        set2Row();
        set3Row();
        set4Row();
    }
    public void set4Row() {
        move();
        turnRight();
        move();
        turnRight();
        beeperPlace();
        beeperPlace();
        beeperPlace();
        beeperPlace();
    }
    public void set3Row() {
        leftTransition();
        beeperPlace();
        beeperPlace();
    }
    public void set2Row() {
        rightTransition();
        beeperPlace();
    }
    public void set1Row() {
        move();
        putBeeper();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void beeperPlace() {
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void leftTransition() {
        move();
        turnLeft();
        move();
        turnLeft();
    }
    public void rightTransition() {
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
    }
}


