package aulas.aula7_genericos;

public class ExemploB {
    public static void main(String[] args) {
        Integer vetorInteiros[] = {5, 10, 15};
        Double vetorDoubles[] = {0.5, 0.9, 14.55};
        String vetorString[] = {"abacaxi", "macaruja", "molango"};
        
        Pessoa vetorPessoas[] = {new Pessoa("João", 23), new Pessoa("Maria", 32), new Pessoa("Carlos", 16)};
                
        ClasseB objB = new ClasseB();
        
        objB.imprimirVetor(vetorInteiros);
        objB.imprimirVetor(vetorDoubles);
        objB.imprimirVetor(vetorString);
        objB.imprimirVetor(vetorPessoas);
        
        System.out.println("----------------");

        Pessoa maisVelho = objB.maximo(vetorPessoas[0], vetorPessoas[1], vetorPessoas[2]);
        System.out.println(maisVelho);
        
        int valorInteiroMax = objB.maximo(vetorInteiros[0], vetorInteiros[1], vetorInteiros[2]);
        System.out.println(valorInteiroMax);
        
        double valorDoubleMax = objB.maximo(vetorDoubles[0], vetorDoubles[1], vetorDoubles[2]);
        System.out.println(valorDoubleMax);
        
        String valorStringMax = objB.maximo(vetorString[0], vetorString[1], vetorString[2]);
        System.out.println(valorStringMax);
         
        aula aula aula
        
        
        
    }
}
