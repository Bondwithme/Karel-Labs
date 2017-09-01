package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        set1Row();
        set2Row();
        set3Row();
        set4Row();
        reverse();
        set3Row2();
        set2Row2();
        set1Row2();
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
    public void set3Row2() {
        beeperPlace();
        beeperPlace();
        rightTransition1();
    }
    public void set2Row2() {
        beeperPlace();
        leftTransition1();
    }
    public void set1Row2() {
        putBeeper();
        move();
    }
    public void reverse() {
        pickBeeper();
        turnLeft();
        move();
        turnLeft();
        move();
        move();
        move();
    }
    public void rightTransition1() {
        turnRight();
        move();
        turnRight();
        move();
    }
    public void leftTransition1() {
        turnLeft();
        move();
        turnLeft();
        move();
    }
}

