/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06ex02;

/**
 *
 * @author jota
 */
public class MovablePoint implements Movable{
    protected int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    @Override
   public void moveUp(){
       y+=ySpeed;
       
   }
   @Override
   public void moveDown(){
       y-=ySpeed;
   }
   @Override
   public void moveLeft(){
       x+=xSpeed;
       
   }
   @Override
   public void moveRight(){
       y-=xSpeed;
   }

    @Override
    public String toString() {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }
   
   
    
    
}
