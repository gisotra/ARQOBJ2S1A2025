package aulas.aula6_colecoes.pilha;

import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        
        Stack<String> pilha = new Stack<>();
        
        pilha.push("Hawktuah");
        pilha.push("Hawktuah2");
        pilha.push("Hawktuah3");
        
        System.out.println( pilha );
        
        while( !pilha.empty() ){
            System.out.println( pilha.pop() );
            
        }
        
    }
}