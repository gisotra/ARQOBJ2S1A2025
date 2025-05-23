/*
Write a Java program to create a generic method that takes 
two arrays of the same type and checks if they have the same elements in the same order.
 */
package aulas.aula7_genericos.exC;

import java.util.Arrays;

public class Ex1 {
    
    public static <T> boolean compareArrays(T vetor1[], T vetor2[]){
        if(Arrays.equals(vetor1, vetor2)){
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Integer[] vetor1 = {1, 2, 3, 4, 5, 6};
        Integer[] vetor2 = {6, 5, 4, 3, 2, 1};
        double[] vetor3 = {0.5, 1, 3.9, 15.2, 20.1, 10};
        String[] vetor4 = {"melancia", "abobora", "ameixa", "abacaxi", "banana", "morango"};
        Integer[] vetor5 = {1, 2, 3, 4, 5, 6};
        
        System.out.println(compareArrays(vetor1, vetor2));
        System.out.println(compareArrays(vetor1, vetor5));
    }
}
