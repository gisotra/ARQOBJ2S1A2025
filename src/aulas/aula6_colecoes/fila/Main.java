package aulas.aula6_colecoes.fila;


import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();
        
        fila.add("azul");
        fila.add("branco");
        fila.add("verde");
        
        System.out.println(fila);
        
        while( !fila.isEmpty() ){
            // FIFO
            System.out.println( fila.poll() );
        }
        
    }
}
