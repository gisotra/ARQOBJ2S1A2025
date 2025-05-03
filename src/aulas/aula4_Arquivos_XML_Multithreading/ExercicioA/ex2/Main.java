package aulas.aula4_Arquivos_XML_Multithreading.ExercicioA.ex2;

public class Main {
    public static void main(String[] args){
        Ex2 ex2 = new Ex2();
        try{
        ex2.verificaImpar(2);
        } catch (RuntimeException e){
            e.printStackTrace(); // mostra o erro sem quebrar o programa
        }
    }
}