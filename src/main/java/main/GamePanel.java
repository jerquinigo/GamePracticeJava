package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private float xDelta = 100;
    private float yDelta = 100;
    private float xDir = 1f;
    private float yDir = 1f;
    private int frames = 0;
    private long lastCheck = 0;
    private Color color = new Color(150,20,90);
    private Random random;

    public GamePanel() {
        random = new Random();
        mouseInputs = new MouseInputs(this);
        //this adds the Gamepanel class as a parameter
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void changeXDelta(int value) {
        this.xDelta = this.xDelta + value;

    }

    public void changeYDelta(int value) {
        this.yDelta = this.yDelta + value;

    }

    public void setRectPost(int x, int y) {
        this.xDelta = x;
        this.yDelta = y;

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        updateRectangle();
        g.setColor(color);
        g.fillRect((int) xDelta,(int) yDelta,200,50);



    }

    private void updateRectangle() {
        xDelta = xDelta + xDir;
        if(xDelta > 400 || xDelta < 0) {
            xDir = xDir * -1;
            color = getRndColor();
        }

        yDelta = yDelta + yDir;
        if(yDelta > 400 || yDelta < 0) {
            yDir = yDir * -1;
            color = getRndColor();
        }
    }

    private Color getRndColor() {
        int r = random.nextInt(255);
        int b = random.nextInt(255);
        int g = random.nextInt(255);

        return new Color(r,g,b);
    }

}
