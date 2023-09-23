package main;

import javax.swing.*;

public class GameWindow extends JFrame {

    public GameWindow(GamePanel gamePanel) {
       JFrame jFrame = new JFrame();
       jFrame.setSize(400, 400);
       jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jFrame.add(gamePanel);
       jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
