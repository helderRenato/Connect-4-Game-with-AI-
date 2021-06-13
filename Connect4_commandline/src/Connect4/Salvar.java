package Connect4;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Salvar {

    public void save(String nome, ArrayList<Integer> niveis){
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(nome));
           
            os.writeObject(niveis);
            os.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public ArrayList<Integer> open(String nome){
   
        try(ObjectInputStream is = new ObjectInputStream(new FileInputStream(nome))){
           return (ArrayList) is.readObject();
           
        } 
        catch(Exception ex){
            ex.printStackTrace();
        }
        return new ArrayList();    
    }
}
