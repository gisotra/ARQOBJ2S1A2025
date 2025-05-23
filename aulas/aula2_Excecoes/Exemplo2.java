package aulas.aula2_Excecoes;

public class Exemplo2 {
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
            //porque esse valor do vetor não foi preenchido
            
            /*
            Aqui a gente começa a brincar com o try catch(), que vai executar o que estiver dentro dos {} 
            do "try", e CASO OCORRA de ter uma exceção, um erro, o "catch" vai exatamente capturar ela, e dar um 
            output definido.
            */
            
            
        } catch( ArrayIndexOutOfBoundsException ex2 ) {
            System.out.println( ex2.getMessage() );
            
        }
        
        /*Caso o catch tenha sucesso em capturar a Exceção, ele vai imediatamente pular os outros "catches" que estão
        abaixo dele, e vai prosseguir pra linha de código fora de seu alcance*/
        
        System.out.println( vetor[0] );
        
        }
    
    
}
