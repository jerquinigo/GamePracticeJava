package main;

import javax.swing.*;

public class GameWindow extends JFrame {

    public GameWindow(GamePanel gamePanel) {
       JFrame jFrame = new JFrame();
       jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jFrame.add(gamePanel);
       jFrame.setLocationRelativeTo(null);
       jFrame.setResizable(false);
       //this means fit the size of the window to its component
       jFrame.pack();
        jFrame.setVisible(true);
    }
}
