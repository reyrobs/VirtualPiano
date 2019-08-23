package View;

import KeyAction.BlackKeys.*;
import KeyAction.WhiteKeys.*;

import javax.swing.*;
import java.awt.*;

public class KeyPanel extends JLayeredPane {

    private JButton[] buttons = new JButton[8];
    private JButton[] blackButtons2 = new JButton[3];;
    private JButton[] blackbuttons = new JButton[2];;
    private Gui gui;
    int WHITE_KEY = 100;
    int BLACK_KEY = 39;

    /**
     * Setting up the panel and using the relevant methods to add the keys and their actions
     */

    public KeyPanel() {
        this.setLayout(null);
        this.setLocation(53, 100);
        this.setSize(765, 480);
        this.setOpaque(true);
        this.setBackground(Color.black);
        addKeys();
        addActions();
    }

    /**
     * Method to add keys to the panel
     */

    public void addKeys() {
        for(int i=0; i<8; i++) {
            JButton button = new JButton();
            buttons[i] = button;
            buttons[i].setBounds(95*i, 0, WHITE_KEY, 400);
            this.add(buttons[i], new Integer(1));
        }

        for(int i=0; i<2; i++) {
            JButton button = new JButton();
            blackbuttons[i] = button;
            blackbuttons[i].setBounds(78+95*i, 0, BLACK_KEY, 250);
            blackbuttons[i].setOpaque(true);
            blackbuttons[i].setBorderPainted(false);
            blackbuttons[i].setBackground(Color.BLACK);
            this.add(blackbuttons[i], new Integer(2));
        }

        for(int i=0; i<3; i++) {
            JButton button = new JButton();
            blackButtons2[i] = button;
            blackButtons2[i].setBounds(363 + 95*i, 0, BLACK_KEY, 250);
            blackButtons2[i].setOpaque(true);
            blackButtons2[i].setBorderPainted(false);
            blackButtons2[i].setBackground(Color.BLACK);
            this.add(blackButtons2[i], new Integer(2));
        }
    }

    /**
     * Method to add Actions to keys
     */

    public void addActions() {
        buttons[0].addActionListener(new CKey(gui));
        buttons[1].addActionListener(new DKey(gui));
        buttons[2].addActionListener(new EKey(gui));
        buttons[3].addActionListener(new FKey(gui));
        buttons[4].addActionListener(new GKey(gui));
        buttons[5].addActionListener(new AKey(gui));
        buttons[6].addActionListener(new BKey(gui));
        buttons[7].addActionListener(new C1Key(gui));
        blackbuttons[0].addActionListener(new CHashKey(gui));
        blackbuttons[1].addActionListener(new DHashKey(gui));
        blackButtons2[0].addActionListener(new FHashKey(gui));
        blackButtons2[1].addActionListener(new GHashKey(gui));
        blackButtons2[2].addActionListener(new BHashKey(gui));
    }
}
