package aulas.aula9Lambda_Fluxo;

import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OperacoesFluxoInt {
    public static void main(String[] args) {
        
        int vetor[] = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        IntStream.of(vetor)
                .forEach( (e) -> System.out.print(e + " ") );
        System.out.print("\n");
        
        System.out.print("Pares: ");
        IntStream.of(vetor)
                .forEach( (e) -> {
                    if( e % 2 == 0){
                        System.out.print(e + " ");
                    } 
        });
        System.out.print("\n");
        
        
        int max = IntStream.of(vetor).max().getAsInt();
        int min = IntStream.of(vetor).min().getAsInt();
        int soma = IntStream.of(vetor).sum();
        double media = IntStream.of(vetor).average().getAsDouble();
                
        System.out.printf("max = %d min = %d soma = %d media = %f\n", max, min, soma, media);
        
        
        int somatorio = IntStream.of(vetor)
                .reduce( 0, (x, y) -> x + y ); 
        System.out.println("Somatório: " + somatorio);
        
        int produtorio = IntStream.of(vetor)
                .reduce( 1, (x, y) -> x * y ); 
        System.out.println("Produtório: " + produtorio);
        
        int somatorioPares = IntStream.of(vetor)
                .filter( (e) -> e % 2 == 0)
                .reduce( 0, (x, y) -> x + y ); 
        System.out.println("Somatório Pares: " + somatorioPares);
        
        System.out.print("Impares: ");
        IntStream.of(vetor)
                .filter( (e) -> e % 2 != 0)
                .forEach( (e) -> System.out.print(e + " ") );
        System.out.print("\n");
        
        System.out.print("Impares Ordenados: ");
        IntStream.of(vetor)
                .filter( (e) -> e % 2 != 0)
                .sorted()
                .forEach( (e) -> System.out.print(e + " ") );
        System.out.print("\n");
        
        System.out.print("Impares Dobrados Ordenados: ");
        IntStream.of(vetor)
                .filter( (e) -> e % 2 != 0)
                .map( (e) -> e * 2 )
                .sorted()
                .forEach( (e) -> System.out.print(e + " ") );
        System.out.print("\n");
        
        
        Integer array[] = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        List<Integer> imparesDobrados = 
                Arrays.stream(array) 
                .filter( (e) -> e % 2 != 0)
                .map( (e) -> e * 2 )
                .sorted()
                .collect( Collectors.toList());
        
        System.out.println("Impares Dobrados Ordenados: " + imparesDobrados);
        
        
        
        
        
        
        
    }
}
