/*
 Escreva um programa Java que leia uma lista de inteiros do usuário e lance uma exceção se houver números duplicados. */
package aulas.aula4_Arquivos_XML_Multithreading.ExercicioA.ex6;

import java.util.ArrayList;

public class Ex6 {
    public ArrayList<Integer> lista;
    
    public Ex6(){ //construtor
        lista = new ArrayList<Integer>();
    }
    
    public boolean adicionar(int num){
        lista.add(num);
        return true;
    }
    
    public void verificaRepetidos(){
        int check;
        for(int i = 0; i < lista.size(); i++){
            check = lista.get(i);
            for(int j = 0; j < lista.size(); j++){
                if(lista.get(j) == check){
                    throw new RuntimeException("Existe numero repetido");
                }
            }
        }
    }

    
}


