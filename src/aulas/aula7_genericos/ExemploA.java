package aulas.aula7_genericos;

public class ExemploA {
    public static void main(String[] args) {
        Integer vetorInteiros[] = {5, };
        Double vetorDoubles[] = {0.5, 0.9, 14.55};
        String vetorString[] = {"abacaxi", "macaruja", "molango"};
        
        ClasseA objA = new ClasseA();
        
        objA.imprimirVetor(vetorInteiros);
        objA.imprimirVetor(vetorDoubles);
        objA.imprimirVetor(vetorString);
        
    }
}
