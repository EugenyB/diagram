package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by eugeny on 25.11.2015.
 */
public class EditPanel extends JPanel{
    private JTextField textField;

    public EditPanel(String caption) {
        textField = new JTextField(8);
        add(new JLabel(caption));
        add(textField);
        add(new JLabel(" "));
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100, 50);
    }

    @Override
    public Dimension getMinimumSize() {
        return new Dimension(75,50);
    }

    @Override
    public Dimension getMaximumSize() {
        return new Dimension(120,60);
    }

    public int getValue() {
        int result = 0;
        try {
            result = Integer.parseInt(textField.getText());
        } catch (NumberFormatException ex) {
            result = 0;
        } finally {
            return result;
        }
    }
}
