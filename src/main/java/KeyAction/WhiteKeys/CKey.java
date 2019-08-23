package KeyAction.WhiteKeys;

import View.Gui;

import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.io.File;


public class CKey extends AbstractAction{

    private Gui gui;
    private File wavFile = new File("/Users/robert/Music/iTunes/iTunes Media/Music/Unknown Artist/Unknown Album/C.wav");
    private AudioClip sound;

    public CKey(Gui gui) {
        super("Ckey");
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



