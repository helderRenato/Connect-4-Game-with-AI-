package Connect4;

import java.io.File;
import javax.sound.sampled.*;

public class Sound {
    private Clip clip;
    private int som = 0;
    private static Sound instance = null;
    private Sound(int som){
        this.som = som;
    }
    
    private Sound(){
        this.som = 1;
    }
    
    public static Sound getInstance(){
        if(instance == null){
            instance = new Sound();
        }
    return instance;
    }
    
    public void setFile(String nome){
        try{
            File ficheiro = new File(nome);
            AudioInputStream som = AudioSystem.getAudioInputStream(ficheiro);
            clip = AudioSystem.getClip();
            clip.open(som);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void setSom(int som){
        this.som = som;
    }
    
    public int getSom(){
        return this.som;
    }
    
    private void analisarSom(){
        if(getSom()==1){//fazer som
           clip.start();
        }else{
            clip.stop();
        }
    }
    public void play(){
        clip.setFramePosition(0);
        analisarSom();
    }
    
    public void buttonClick(){
        setFile(".//src//SoundEffects//clickButton.wav");
        play();
    }
    
    public void winSound(){
        setFile(".//src//SoundEffects//winSound.wav");
        play();  
    }
    
    public void loseSound(){
        setFile(".//src//SoundEffects//loseSound.wav");
        play();  
    }
    public void discPlacing(){
        setFile(".//src//SoundEffects//discPlacing.wav");
        play();  
    }
}
