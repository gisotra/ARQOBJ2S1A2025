/*
Escreva e demonstre um método estático em uma classe qualquer que elimine todos os itens
repetidos de uma lista. Dica: Existe uma maneira bem simples de resolver esse problema
usando construtores das classes mostradas neste capítulo.
 */
package aulas.aula6_colecoes.exAula.cap12.ex22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex22 {
    
    public static void eliminaRepetidos(List<String> L, List<String> LPnR){
      for( String Laux : L){
          if(!LPnR.contains(Laux)){
              LPnR.add(Laux);
          }
      }
    }
    
    public static boolean addPalavra(List<String> L, String word){
        if(word != null){
            L.add(word);
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<String> LP = new ArrayList();
        List<String> LPnR = new ArrayList(); //arraylist auxiliar
        boolean index = true;
        
        do{
            String word;
            System.out.println("Informe uma palavra para adicionar na lista: ");
            word = reader.nextLine();
            if(!word.matches(".*\\d+.*")){ //verifica se é uma palavra e não um numero
            addPalavra(LP, word);
            } else {
                index = false;
            }
        }while(index);
        
        eliminaRepetidos(LP, LPnR);
        
        System.out.println("List com repeticoes: " + LP);
        System.out.println("List sem repeticoes: " + LPnR);
        
        
    }
}
