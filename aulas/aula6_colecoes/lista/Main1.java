package aulas.aula6_colecoes.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// todas implementam da interface Collection
// classe collections possui diversos métodos para manipular formas de organizar dados e objetos

public class Main1 {
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>(); //arraylist herda de List
        
        lista.add("amarelo");
        lista.add("verde");
        lista.add("branco");
        lista.add("azul");
        
        System.out.println( lista );
                
        //padrão de design orientado a objeto
        Iterator<String> iterator = lista.iterator();
        /*
        com esse objeto a gente pode percorrer a nossa coleção a qual ele foi atribuido
        */
        
        while(iterator.hasNext()){
            System.out.println( iterator.next() );
            //iterator.remove();
            System.out.println( lista );
        }
        
        System.out.println("---");
        
        //baixo custo de processamento
        System.out.println( lista.get(2) );
        
        //Arraylist desvantagem: Alto custo para processamento para inserção e remoção em pontos específicos
        lista.add(1, "rosa");
        System.out.println( lista );
        
        System.out.println("---");
       
    
        String[] cores = { "marrom", "roxo", "laranja", "preto" };
        
        List<String> lista2 = new LinkedList<>( Arrays.asList(cores));
        
        System.out.println(lista2);
        
        lista2.add(1, "vermelho");
        
        System.out.println( lista );
        
        System.out.println("---");
        
        System.out.println( Collections.binarySearch(lista, "preto"));
        System.out.println( Collections.binarySearch(lista, "azul"));
        
        System.out.println(lista);
        /*Collections.reverse(lista);
        System.out.println("Inversa: " + lista);
        */
        Collections.shuffle(lista);
        System.out.println("Randomizado: " + lista);
        
        System.out.println(lista2);
        Collections.fill(lista2, "HAWKTUAH");
        System.out.println(lista2);
            
    }
}
