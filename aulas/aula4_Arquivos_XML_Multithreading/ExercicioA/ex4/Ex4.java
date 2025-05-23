/*
4. Escreva um programa Java para encontrar a sequência de uma letra maiúscula seguida por letras minúsculas.
 */
package aulas.aula4_Arquivos_XML_Multithreading.ExercicioA.ex4;

public class Ex4 {
    
    public boolean validaPalavra(String palavra){
        String regex = "[A-Z][a-z]*";
        if(palavra.matches(regex)){
            return true;
        } else {
            return false;
        }
    }
    
}
