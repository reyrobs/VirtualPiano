package View;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

    public Gui() {
        /**
         * Setting up the frame and adding the panel and label
         */

        this.setSize(875, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Virtual Piano");
        this.getContentPane().setLayout(null);
        this.setResizable(false);

        KeyPanel panel = new KeyPanel();
        this.add(panel, BorderLayout.CENTER);

        JLabel label = new JLabel("Virtual Piano",SwingConstants.CENTER);
        label.setBounds(0,0 , 875, 100);
        label.setFont(new Font("Arial", Font.PLAIN, 100));
        label.setBackground(Color.white);
        label.setOpaque(true);
        this.add(label);
        this.setVisible(true);
    }
}
