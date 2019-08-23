package KeyAction.WhiteKeys;

import View.Gui;

import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.io.File;

public class GKey extends AbstractAction {

    private Gui gui;
    private File wavFile = new File("/Users/robert/Music/iTunes/iTunes Media/Music/Unknown Artist/Unknown Album/G.wav");
    private AudioClip sound;

    public GKey(Gui gui) {
        super("GKey");
        this.gui = gui;
    }

    public void actionPerformed(ActionEvent event) {
        try{
            sound = Applet.newAudioClip(wavFile.toURL());
        }
        catch(Exception e){
            e.printStackTrace();
        }
        sound.play();
    }
}
