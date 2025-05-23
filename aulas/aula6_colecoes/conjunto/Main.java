package aulas.aula6_colecoes.conjunto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        
        Set<String> conjunto = new HashSet<>();
        Set<String> conjunto2 = new TreeSet<>();
 
        conjunto.add("azul");
        conjunto.add("azul");
        conjunto.add("azul");
        conjunto.add("azul");
        conjunto.add("azul");
        conjunto.add("verde");
        
        System.out.println(conjunto);
        
    }
}
