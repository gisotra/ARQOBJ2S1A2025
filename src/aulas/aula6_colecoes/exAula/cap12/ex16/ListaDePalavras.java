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
import java.util.Scanner; //usar somente no main
import java.util.HashMap; 
import java.util.Map;
public class ListaDePalavras {
    //                 chave | valor    
    private static Map<String,Integer> LP = new HashMap<>(); //por ser estático, não preciso de uma instancia da classe

        public static void addPalavra(String word){
            //adicionar já validando as repetições para o método futuro
                Integer inteiro = LP.get(word); //recebo o valor INTEGER condizente com aquela chave
                if(inteiro == null){ //caso esse valor seja nulo, é a primeira vez que essa palavra está sendo adicionada
                    LP.put(word, 1);
                } else { //palavra REPETIDA
                    LP.put(word, inteiro + 1); //adiciono um indice condizente com as REPETIÇÕES
                }
        }
    
        public static int numRepeticoes(String word){
            if(LP.get(word) != null){ //ela apareceu na lista
                return LP.get(word);
            } else {
                return 0; //a palavra nem apareceu no meu mapa
            }   
        }
        
        @Override
        public String toString(){
            return LP.keySet().toString();
        }
        
        
/*----------------------------------------------------------------*/
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            boolean isWord = true;
            String regex = ".*\\d+.*";

            do {
                String word;
                System.out.println("Informe uma palavra: ");
                word = reader.nextLine();
                if (word.matches(regex)) {
                    System.out.println("Nao pode adicionar numero numa lista de palavras");
                    break;
                } else {
                    addPalavra(word);
                }
            } while (isWord);
        
            System.out.println(LP);
        }
}