package org.example;

import lombok.Getter;
import lombok.Setter;

public class movablePoint implements MoveAble {
    @Getter
    @Setter
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public movablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void moveUp(){
        y-=ySpeed;
    }
    public void moveDown(){
        y+=ySpeed;
    }
    public void moveLeft(){
        x-=xSpeed;
    }
    public void moveRight(){
        x+=xSpeed;
    }

    @Override
    public String toString() {
        return "("+x+"+"+y+")"+" speed=("+x+","+y+")";
    }
}
