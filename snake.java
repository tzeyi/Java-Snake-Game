import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class snake extends Rectangle{

    // initialize length, and snake x/y positions
    int length=5;
    int pixel=10;
    int[] xPos= new int[550];
    int[] yPos= new int[450];
    boolean ChangeY;
    boolean ChangeX;

    snake(){
        // populate the array with position of the snake
        for (int i=length; i>=0; i--){
            xPos[i]=70-(i*pixel);
            yPos[i]=50;
        }
    }
    
    // paint the snake
    public void paint(Graphics g){
        
        for (int i=length; i>=0; i--){
            g.setColor(Color.GREEN);
            if (i==0){
                g.setColor(Color.RED);
            }
            g.fillRect(xPos[i], yPos[i], pixel, pixel);
        }
    }

    public void move(boolean[] movement){
        if (movement[0]){
            updatePos();
            yPos[0]-=pixel;
        }
        if (movement[1]){
            updatePos();
            yPos[0]+=pixel;
        }
        if (movement[2]){
            updatePos();
            xPos[0]+=pixel;
        }
        if (movement[3]){
            updatePos();
            xPos[0]-=pixel;
        }
    }   

    public void updatePos(){
        for (int i=length; i>0; i--){
            // update position, where body follows the head (new pos = pos ahead of it)
            xPos[i]=xPos[i-1];
            yPos[i]=yPos[i-1];
        }
    }

    // public void checkCollision(){
    //     if (xPos[0]==){

    //     }
    // }


}

