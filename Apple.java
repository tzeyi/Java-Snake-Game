import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Apple{

    Random random = new Random();
    int xPos=0;
    int yPos=0; 
    
    Apple(){

    }

    public void paint(Graphics g){
        xPos=random.nextInt(450);
        yPos=random.nextInt(500);

        g.setColor(Color.pink);
        g.fillOval(xPos, yPos, 10, 10);
    }



}