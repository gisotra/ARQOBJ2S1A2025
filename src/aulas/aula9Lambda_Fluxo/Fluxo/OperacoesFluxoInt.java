package aulas.aula9Lambda_Fluxo.Fluxo;

import java.util.stream.IntStream;

public class OperacoesFluxoInt {
    public static void main(String[] args) {
        
        int vetor[] = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        
        // operações terminais
        IntStream.of(vetor)
                .forEach(  (e) -> System.out.print(e + " ") );
        System.out.print( "\n" );
        
        System.out.println("Pares: ");

        IntStream.of(vetor)
                .forEach( (e) -> {
                    if( e % 2 == 0 ){
                        System.out.print(e + " " );
                    }
                });
        System.out.print("\n");
        
        int max = IntStream.of(vetor).max().getAsInt();
        int min = IntStream.of(vetor).min().getAsInt();
        int soma = IntStream.of(vetor).sum();
        double media = IntStream.of(vetor).average().getAsDouble();
        
        System.out.printf(" max = %d min = %d %d %f\n", max, min, soma, media);
        
        int somatorio = IntStream.of(vetor)
                .reduce( 0, (x, y) -> x + y );
        
        System.out.println("Somatorio: " + somatorio);
        
        
        int produtorio = IntStream.of(vetor)
                .reduce( 1, (x, y) -> x * y );
        
        System.out.println("Produtorio: " + produtorio);
        
        
        
    }
}
