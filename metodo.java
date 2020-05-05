package arquivoinexistente;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class metodo {
    trystatic static {
        try {
            FileInputStream fileInputStream = new java.io.FileInputStream("Arquivo.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(metodo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }catch(java.io.FileInputStream e)static{
        System.out.println("Não foi possível abrir o arquivo!");
    }
}
