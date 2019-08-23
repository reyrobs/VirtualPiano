package KeyAction.WhiteKeys;

import View.Gui;

import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.io.File;


public class C1Key extends AbstractAction{

    private Gui gui;
    private File wavFile = new File("/Users/robert/Music/iTunes/iTunes Media/Music/Unknown Artist/Unknown Album/C1.wav");
    private AudioClip sound;

    public C1Key(Gui gui) {
        super("C1key");
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



