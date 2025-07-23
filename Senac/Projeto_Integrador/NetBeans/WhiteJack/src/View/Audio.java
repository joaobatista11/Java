package View;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Audio {

    private static Clip clip;
    public static void main(String[] args) {
    tocar_musica("src/Sons/heisenberg.wav");        
    }
    public static void tocar_musica(String caminho) {
 try {
            if (clip == null || !clip.isRunning()) {
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(caminho));
                clip = AudioSystem.getClip();
                clip.open(audioStream);
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                clip.start();
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void parar_audio() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }

    public static void tocar_audio(String caminho) {
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(caminho));
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start(); // loop desativado, uso único
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
