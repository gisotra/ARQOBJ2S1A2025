package aulas.aula7_genericos;

public class ExemploPìlha {
    public static void main(String[] args) {
        Pilha<Integer> pilhaInteiros = new Pilha<>();
        
        
        pilhaInteiros.adicionar(13);
        pilhaInteiros.adicionar(51);
        pilhaInteiros.adicionar(1023);
        
        System.out.println(pilhaInteiros);
        System.out.println(pilhaInteiros.remover());
        System.out.println(pilhaInteiros);
        
        System.out.println("---------------------");
        
        Pessoa p1 = new Pessoa("Joao", 23);
        Pessoa p2 = new Pessoa("Maria", 32);
        Pessoa p3 = new Pessoa("Carlos", 18);
        
        //pilha é do tipo OBJECT, porque eu NÃO INSTANCIEI
        Pilha pilhaO = new Pilha();
        pilhaO.adicionar(p1);
        pilhaO.adicionar(p2);
        pilhaO.adicionar(p3);
        
        System.out.println( pilhaO );
        System.out.println( pilhaO.remover() instanceof Object );
        
        Pilha<Pessoa> pilhaP = new Pilha();
        pilhaP.adicionar(p1);
        pilhaP.adicionar(p2);
        pilhaP.adicionar(p3);
        
        System.out.println( pilhaP );
        System.out.println( pilhaP.remover() instanceof Object );
        
    
    }
}
