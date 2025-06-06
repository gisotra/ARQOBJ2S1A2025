package aulas.aula9Lambda_Fluxo.praticaLambda.ex1;

public class ex1 {
    public static void main(String[] args) {
        
        Exercise e = (a, b) -> a + b;
        System.out.println(e.somar(14, 16));
        
        Exercise2 e2 = (a, b) -> System.out.println(a+b); 
        e2.somar(10, 5);
    }
}
