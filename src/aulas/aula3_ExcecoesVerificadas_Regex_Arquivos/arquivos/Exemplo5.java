package aulas.aula3_ExcecoesVerificadas_Regex_Arquivos.arquivos;

import java.io.*;
public class Exemplo5 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao", "555.555.555-55");
        Pessoa p2 = new Pessoa("Maria", "333.333.333-33");
       
        System.out.println(p1);
        System.out.println(p2);
        
        try {
            
        FileOutputStream arq = new FileOutputStream("Arquivo3.ser");
            
        ObjectOutputStream stream = new ObjectOutputStream (arq);
            
        } catch(IOException ex){
               ex.printStackTrace();
        }
        
    }
}
