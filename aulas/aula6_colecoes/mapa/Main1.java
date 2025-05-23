package aulas.aula6_colecoes.mapa;

import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
        
        //chave (imutavel) -> valor
        Map<String, Double> notas = new HashMap<>();
        
        notas.put("Joao", 5.50); //chave e valor
        notas.put("Maria", 3.50); //chave e valor
        notas.put("Soares", 7.50); //chave e valor
       
        System.out.println(notas);
        System.out.println(notas.get("Joao"));
        
        for(String chave : notas.keySet() ){
            double valor = notas.get(chave);
            System.out.println( chave + " : " + valor);
        }
        
        System.out.println("--------- sobrescrever o joao- ------");
        notas.put("Joao", 10.0); //adicionar
        
                for(String chave : notas.keySet() ){ //keySet: retorna todas as chaves daquele mapa
            double valor = notas.get(chave);
            System.out.println( chave + " : " + valor);
        }
    }
}