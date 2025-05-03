package aulas.aula2_Excecoes;

public class Exemplo5 {
    public static void main(String[] args) {
        
        Data hoje = new Data();
        
        hoje.setDia(4);
        
        try {
            hoje.setMes(-1); /*
            funciona porque é uma Exceção normal, e não uma RunTimeException, e nesse método ele usa um Throw*/
        } catch( Exception ex ) {
            System.out.println( ex.getMessage() );
        }
        
    }
}
