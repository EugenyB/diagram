package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by eugeny on 25.11.2015.
 */
public class MainFrame extends JFrame {
    DiagramPanel diagramPanel;
    public MainFrame() throws HeadlessException {
        getContentPane().add(diagramPanel = new DiagramPanel());
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel,BoxLayout.Y_AXIS));
        rightPanel.add(new EditPanel("a1"));
        rightPanel.add(new EditPanel("a2"));
        rightPanel.add(new EditPanel("a3"));
        JPanel p = new JPanel();
        JButton btn = new JButton("Ok");
        p.add(btn);
        rightPanel.add(p);
        getContentPane().add(rightPanel,BorderLayout.EAST);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
