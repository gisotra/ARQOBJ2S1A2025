package aulas.aula4_Arquivos_XML_Multithreading.ExercicioA.ex6;

public class Main {
     public static void main(String[] args) {
        Ex6 e = new Ex6();
        e.adicionar(14);
        e.adicionar(2);
        e.adicionar(7);
        e.adicionar(124);
        e.adicionar(14);
        e.adicionar(-2);
        
        try{
            e.verificaRepeticoes();
        } catch (RuntimeException ex){
            System.out.println("Erro: " + ex.getMessage());
        }
    }
}
