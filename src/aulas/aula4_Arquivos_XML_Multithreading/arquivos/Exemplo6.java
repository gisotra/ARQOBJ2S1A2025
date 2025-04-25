package aulas.aula4_Arquivos_XML_Multithreading.arquivos;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exemplo6 {
    public static void main(String[] args) {
        Pessoa p1, p2;
            
        try {
            FileInputStream arq  = new FileInputStream("Arquivo3.ser");
            ObjectInputStream stream = new ObjectInputStream(arq);
                    
            p1 = (Pessoa) stream.readObject();
            p2 = (Pessoa) stream.readObject();
            
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
