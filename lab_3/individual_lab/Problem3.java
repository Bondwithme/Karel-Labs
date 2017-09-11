package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        checkRoom();
        checkRoom();
        checkRoom();
        checkRoom();
        checkRoom();
        checkRoom();
        checkRoom();
        checkRoom();
    }
    public void checkRoom() {
        move();
        turnLeft();
        move();
        if(frontWallClear() && leftWallClear() && rightWallClear()) {
            putBeeper();
            reposition();
        }
        else {
           reposition(); 
        }
    }
    public boolean frontWallClear() {
        faceNorth();
        if(frontIsClear()) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean leftWallClear() {
        faceWest();
        if(frontIsClear()) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean rightWallClear() {
        faceEast();
        if(frontIsClear()) {
            return true;
        }
        else {
            return false;
        }
    }
    public void faceEast() {
        if(facingWest()) {
            turnRight();
            turnRight();
        }
        if(facingNorth()) {
            turnRight();
        }
        if(facingSouth()) {
            turnLeft();
        }
    }
    public void faceWest() {
        if(facingNorth()) {
            turnLeft();
        }
        if(facingEast()) {
            turnLeft();
            turnLeft();
        }
        if(facingSouth()) {
            turnRight();
        }
    }
    public void faceSouth() {
        if(facingNorth()) {
            
        }
        if(facingEast()) {
            
        }
        if(facingSouth()) {
            
        }
    }
    public void faceNorth() {
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void reposition() {
        
    }
}

