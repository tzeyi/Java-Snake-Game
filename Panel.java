import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.*;

public class Panel extends JPanel implements KeyListener{

    // index 0-up, 1-down, 2-right, 3-left
    boolean[] movement= {false, false, true, false};
    int key=0;
    Random random;
    snake mySnake;

    Panel(){
        this.setLayout(null);
        this.setBackground(Color.BLACK);
        mySnake = new snake();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // System.out.println(mySnake.xPos);
        key=e.getKeyCode();
        if ((key==KeyEvent.VK_UP) && (!movement[1])){
            movement[0]=true;
            movement[2]=false;
            movement[3]=false;
        }
        else if ((key==KeyEvent.VK_DOWN) && (!movement[0])){
            movement[1]=true;
            movement[2]=false;
            movement[3]=false;
        }
        else if ((key==KeyEvent.VK_RIGHT) && (!movement[3])){
            movement[2]=true;
            movement[0]=false;
            movement[1]=false;
        }
        else if ((key==KeyEvent.VK_LEFT) && (!movement[2])){
            movement[3]=true;
            movement[0]=false;
            movement[1]=false;
        }
    }

    // paint the snake
    public void paint(Graphics g){
        mySnake.paint(g);
    }

    public void checkCollision(){

    }

    public void move(){
        mySnake.move(movement);
    }

}

