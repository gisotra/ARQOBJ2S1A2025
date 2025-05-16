package aulas.aula6_colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Jonas", 43);
        Pessoa p2 = new Pessoa("Marcelo", 20);
        Pessoa p3 = new Pessoa("Simao", 29);
        
        List lista = new ArrayList();
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        
        System.out.println( lista );
        
        Collections.sort(lista);
        
        System.out.println(lista);
        
        Collections.fill(lista, "Verde");
        
        System.out.println( lista );
        
        System.out.println("---");
        
       //unmodifiable list -> uma lista que não pode ser alterada
       //synchronizedList -> pode ser passada e alterada para multiplas lihas de execução de forma segura
         
    }
}
