package arquivoinexistente;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ArquivoInexistente {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new java.io.FileInputStream("arquivo.txt");
    }
}
