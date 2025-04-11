package aulas.aula3_ExcecoesVerificadas_Regex_Arquivos.arquivos;

import java.io.File;

public class Exemplo1 {
    public static void main(String[] args) {
        
        File arq0 = new File("./Arquivo0.txt");
        File arq1 = new File("./Arquivo1.txt");
        
        System.out.println( arq0.exists() ); //false
        System.out.println( arq1.exists() ); //true
        
        System.out.println( arq1.canRead() ); //true
        System.out.println( arq1.canWrite() ); //true
        System.out.println( arq1.getAbsolutePath() ); //true
        System.out.println( arq1.isDirectory() ); //false
        
        File dir = new File("/home/");
        System.out.println( dir.isDirectory() ); //false
        
    }
}
