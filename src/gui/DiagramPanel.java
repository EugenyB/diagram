package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by eugeny on 25.11.2015.
 */
public class DiagramPanel extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(0,0,getWidth()-1,getHeight()-1);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500,500);
    }
}
