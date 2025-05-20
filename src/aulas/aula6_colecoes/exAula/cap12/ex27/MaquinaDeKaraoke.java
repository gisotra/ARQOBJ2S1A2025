/*
Escreva para a classe MaquinaDeKaraoke (exercício 12.23) dois métodos, adia e
adianta, que recebam um nome de música como argumento e que, respectivamente, adiem
ou adiantem a execução daquela música em uma posição, modificando a sua posição
dentro da fila. Esses métodos não devem fazer nada se a música passada como argumento
não existir na fila, e devem tomar cuidado para não adiantarem a primeira música nem
adiarem a última.
*/
package aulas.aula6_colecoes.exAula.cap12.ex27;

import java.util.ArrayList;
import java.util.List;

public class MaquinaDeKaraoke {
    
    private static List<String> listaDeMusica = new ArrayList<>();
    
    private static boolean adianta(String nome, int n){
        if(nome != null && listaDeMusica.contains(nome) && 
                ((n <= listaDeMusica.size()) || (n > 0) &&
                    (n < listaDeMusica.indexOf(nome)))){
            listaDeMusica.set(n, nome);
            return true;
        } else {
            return false;
        }
    }
    
    private static boolean adia(String nome, int n){
        if(nome != null && listaDeMusica.contains(nome) && 
                ((n <= listaDeMusica.size()) || (n > 0) &&
                    (n > listaDeMusica.indexOf(nome)))){ 
            listaDeMusica.set(n, nome);
            return true;
        } else {
            return false;
        }
    }
    
    
    private static boolean addMusica(String nome){
        if(nome != null && !listaDeMusica.contains(nome)){ //não pode repetição
            listaDeMusica.add(nome);
            return true;
        } else {
            return false;
        }
    }
   
    
    
    public static void main(String[] args) {
        String m1 = "Master Of Puppets";
        String m2 = "All nightmare long";
        String m3 = "Eye of the Beholder";
        String m4 = "Lux AEterna";
        String m5 = "Ride The Ligthning";
        String m6 = "Leper Messiah";
        addMusica(m1);
        addMusica(m2);
        addMusica(m3);
        addMusica(m4);
        addMusica(m5);
        addMusica(m6);
        System.out.println("Lista inalterada: " + listaDeMusica);
        System.out.println("Quero que master of puppets seja a ultima musica.");
        adia(m1, 5);
        System.out.println("Lista alterada: " + listaDeMusica);
        System.out.println("Quero que a primeira seja Lux AEterna.");
        adianta(m4, 0);
        System.out.println("Lista alterada: " + listaDeMusica);
        
    }
            
    
}
