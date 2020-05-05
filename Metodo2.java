package arquivoinexistente;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Metodo2 {
    public static void main(String[] args) {
          try {
              FileInputStream fileInputStream = new java.io.FileInputStream("arquivo.txt");
        } catch (FileNotFoundException e) {
            
        }
    }
 }
