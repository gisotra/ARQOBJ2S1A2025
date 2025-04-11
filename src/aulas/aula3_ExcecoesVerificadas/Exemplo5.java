package aulas.aula3_ExcecoesVerificadas;

public class Exemplo5 {
    public static void main(String[] args) {
        
        Data hoje = new Data();
        
        hoje.setDia(4);
        
        try {
            
            hoje.setMes(4); 
            hoje.setAno(-1);/*
            
            funciona porque é uma Exceção normal, e não uma RunTimeException*/
        } catch( NullPointerException ex1 ) {
            System.out.println( ex1.getMessage() );
        } catch( Exception ex ) {
            System.out.println( ex.getMessage() );
        }
        
    }
}
