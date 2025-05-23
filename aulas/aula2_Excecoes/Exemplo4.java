package aulas.aula2_Excecoes;

public class Exemplo4 {
    public static void main(String[] args) {
                String[] vetor = new String[5];        
        try {
        
        
        vetor[0] = "IFSP";
        
        System.out.println(vetor[0]);
        System.out.println( vetor[0].toLowerCase() );
        
        System.out.println( vetor[1] );
        System.out.println( vetor[1].toUpperCase() ); //vai dar erro porque a posição 1 é ocupada por null, gera NUllPointerException
        
        //exceções em java são erros, são coisas que sucederam de forma inesperada
        //tratamos de exceções para tornar o software resiliente aos erros
        
        System.out.println( vetor[4] );
        System.out.println( vetor[5] ); //ArrayIndexOutOfBoundsException
        
        } catch( NullPointerException ex1 ) {
            System.out.println("Ocorreu uma excecao NullPointerException");
            
        } catch( ArrayIndexOutOfBoundsException ex2 ) {
            System.out.println( ex2.getMessage() );
            
        } finally {
            System.out.println("Bloco finally foi executado");
        }
        
        /*
        O finally é SEMPRE executado no final desse processo, independente se o catch for bem sucedido ou não
        */
        
    }
}

