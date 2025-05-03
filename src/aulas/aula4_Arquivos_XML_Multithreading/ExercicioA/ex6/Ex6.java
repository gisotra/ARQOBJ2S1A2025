/*
 Escreva um programa Java que leia uma lista de inteiros do usuário e lance uma exceção se houver números duplicados. */
package aulas.aula4_Arquivos_XML_Multithreading.ExercicioA.ex6;

import java.util.ArrayList;

public class Ex6 {
    public ArrayList<Integer> lista;
    
    public Ex6(){
        lista = new ArrayList<Integer>();
    }
    
    public boolean adicionar(int num){
        lista.add(num);
        return true;
    }
    
    public void verificaRepeticoes(){
        for(int i = 0; i < lista.size(); i++){
            int check = lista.get(i);
            for(int j = i + 1; j < lista.size(); j++){
                if(check == lista.get(j)){ //há uma repetição
                    throw new RuntimeException("Tem numeros duplicados: " + check);
                }
            }
        }
    }
    
}


