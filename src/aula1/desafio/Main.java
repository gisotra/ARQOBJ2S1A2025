package aula1.desafio;

public class Main {
    public static void main(String[] args) {
MatrizDeDoubles[] M = new MatrizDeDoubles[3];
        M[0] = new MatrizDeDoubles(2);
        System.out.println("Matriz 2 x 2 com valor zero: ");
        System.out.println(M[0]);
        System.out.println("Adiciona 20: ");
        M[0].adicionar(20);
        System.out.println(M[0]);
        System.out.println("Subtrair 5: ");
        M[0].subtrair(5);
        System.out.println(M[0]);
        System.out.println("Dividi por 3: ");
        M[0].dividir(3);
        System.out.println(M[0]);        
        System.out.println("Multiplica por 10: ");
        M[0].multiplicar(10);
        System.out.println(M[0]);   
        System.out.println(M[0].alterar(1, 0, 97));
        System.out.println(M[0].alterar(1, 1, 12.5));
        System.out.println(M[0].obter(1, 0));
        System.out.println(M[0]);
        System.out.println("Maior: " + M[0].maior());
        System.out.println("Menor: " + M[0].menor());
        System.out.println("Det: " + M[0].determinante());
        System.out.println("------------------");
    }
}
