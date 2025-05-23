/*
2. Escreva um programa Java para criar um método que receba um inteiro como parâmetro e lance uma exceção se o número for ímpar.
 */
package aulas.aula4_Arquivos_XML_Multithreading.ExercicioA.ex2;

public class Ex2 {
    
    public void verificaPar(int n){
        if(n % 2 == 0){ //é par
            System.out.println("O numero eh par.");
        } else {
            throw new RuntimeException("O numero nao eh par");
        }
    }
}
