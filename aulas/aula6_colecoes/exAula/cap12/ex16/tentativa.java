/*
Escreva a classe ListaDePalavras que represente uma lista de palavras (strings), de
forma que seja possível representar palavras repetidas na lista. As palavras podem ser
mantidas em qualquer ordem. Veja a classe ConjuntoDePalavras (listagem 12.5 no
livro).

Escreva para a classe ListaDePalavras (exercício 12.16) um método conta que recebe
como argumento uma string e retorna o número de ocorrências desta string na lista encap-
sulada (retornando zero caso a palavra não exista na lista).
 */
package aulas.aula6_colecoes.exAula.cap12.ex16;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class tentativa {
    
 
    public static void verificaPalavra(String p, int contador){ // nao preciso de instancia 
        String regexTemporaria = p;
    }
    
    public static void main(String[] args) {
        
        // chave    | valor
        // palavra   | palavras
        Map<Integer,String> LP = new HashMap<>();
        Scanner reader = new Scanner(System.in);
        
        boolean isWord = true;
        String regex = ".*\\d+.*";
        int index = 0;
        
        do{ 
            String word;
            System.out.println("Informe uma palavra: ");
            word = reader.nextLine();
            if(word.matches(regex)){
                System.out.println("Nao pode adicionar numero numa lista de palavras");
                break;
            } else {
                index++;
                LP.put(index, word);
            }
        } while(isWord);
        
        System.out.println(LP);
        
        
        /*System.out.println("procure a palavra repetida: ");
        String search = reader.nextLine();
        System.out.println(verificaPalavra(search, index));
        */
        
        
       
    }
}
