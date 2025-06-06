
package aulas.aula9Lambda_Fluxo;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;


public class OperacaoFluxoString {
    public static void main(String[] args) {
        String strings[] = {"VERMELHO", "laranja", "Amarelo", "verde", "Azul", "VIOLETA"};
        
        Arrays.stream(strings)
                .map( (s) -> s.toUpperCase() )
                .sorted()
                .forEach( (s) -> System.out.print(s + " ") );
        
        System.out.print("\n");
        
        List<String> cores = Arrays.stream(strings)
                .filter( (s) -> s.compareToIgnoreCase("m") < 0 ) 
                .map( (s) -> s.toUpperCase() )
                .sorted()
                .collect( Collectors.toList() );
        
        System.out.println( cores );
        
        
    }
}
