import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Frame extends JFrame implements Runnable{

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Panel myPanel;
    final int GAMEWIDTH=550;
    final int GAMEHEIGHT=450;
    final int DELAYTIME=150;

    // 0=game ended, 1=game still running
    int gameEnd=1;

    Thread gameThread= new Thread(this);

    Frame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBackground(Color.BLACK);
        this.setVisible(true);
        this.setBounds((int)(screenSize.getWidth()/3), (int)(screenSize.getHeight()/4), GAMEWIDTH, GAMEHEIGHT);
        this.setFocusable(true);

        myPanel= new Panel();
        this.add(myPanel);
        this.addKeyListener(myPanel);

        while (gameEnd==1){
            run();
        }
    }

    @Override
    public void run() {
        try {
            gameThread.sleep(DELAYTIME);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        myPanel.repaint();
        myPanel.move();

        // throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    
    
}