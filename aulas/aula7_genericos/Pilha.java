package aulas.aula7_genericos;

import java.util.LinkedList;

public class Pilha <T>{
    
    private LinkedList<T> lista;
    
    public Pilha(){
        lista = new LinkedList<>();
    }
    
    public void adicionar(T valor){
        lista.addFirst(valor);
    }
    
    public T remover(){
        if( !lista.isEmpty() ){
            T aux = lista.removeFirst();
            return aux;
        } else {
            throw new RuntimeException("A pilha esta vazia");
        }
    }


        @Override
        public String toString(){
            return lista.toString();
        }

}
