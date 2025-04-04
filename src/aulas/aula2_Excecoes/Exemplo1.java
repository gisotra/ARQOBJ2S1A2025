package aulas.aula2_Excecoes;

public class Exemplo1 {
    public static void main(String[] args) {
        
        String[] vetor = new String[5];
        
        vetor[0] = "IFSP";
        
        System.out.println(vetor[0]);
        System.out.println( vetor[0].toLowerCase() );
        
        System.out.println( vetor[1] );
        System.out.println( vetor[1].toUpperCase() ); //vai dar erro porque a posição 1 é ocupada por null, gera NUllPointerException
        
        //exceções em java são erros, são coisas que sucederam de forma inesperada
        //tratamos de exceções para tornar o software resiliente aos erros
        
        System.out.println( vetor[4] );
        System.out.println( vetor[5] ); //ArrayIndexOutOfBoundsException
    }
    
}
