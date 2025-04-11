package aulas.aula3_ExcecoesVerificadas_Regex_Arquivos.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo3 {
    public static void main(String[] args) {

        File arq = new File("./Arquivo2.txt");
        FileWriter writer;    
        
        try{
            
            if(arq.exists() ){
                writer = new FileWriter( arq, true );
            } else {
                writer = new FileWriter( arq);   
            }
            
            writer.write("\n\nEsse é o conteúdo do Arquivo2.txt\n\n");
            writer.close();
            
            
        } catch( IOException ex ){
            
        }
    }
    
}
