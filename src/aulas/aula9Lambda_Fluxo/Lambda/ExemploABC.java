package aulas.aula9Lambda_Fluxo.Lambda;

import aulas.aula9Lambda_Fluxo.Lambda.InterfaceFuncionalB;
import aulas.aula9Lambda_Fluxo.Lambda.InterfaceFuncionalA;
import aulas.aula9Lambda_Fluxo.Lambda.ClasseC;

public class ExemploABC {
    public static void main(String[] args) {
        
        //instancia da interface que só possui um método
        InterfaceFuncionalA objA = (int a, int b) -> { 
            return a * b;  //corpo do método
        };
        
        System.out.println( objA.metodoA(3, 5) );
        
        objA = (a, b) -> {
            return a + b;  //corpo do método
        };
        
        objA = (a, b) -> a + b;  //ele entende que a + b é o retorno
        
        System.out.println( objA.metodoA(15, 5) );
        /*
        Casos de uso: Usar para uma ação muito específica no código, caso for 
        algo repetitivo, utilizar a linha de código normal.
        */
        
        InterfaceFuncionalB objB = (a) -> {
            System.out.println("a = " + a);
        };
        
        InterfaceFuncionalC objC = () -> System.out.println("Exemplo método");
        
        /*
        sintaxe:
        instancia da interface =  (parametros do metodo) -> desenvolimento + return (se nao for void)
        */
        
        objC.metodoC();
        
        ClasseC obj = new ClasseC();
        
        obj.metodo( ()-> System.out.println("Hello Lambdas!") ); //define o corpo lambda do objeto Interface passado como parametro

        {/*

Functional Interface Example:

@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

Lambda Expression Syntax:

(parameters) -> {body}

    Parameters: Input parameters for the lambda function.
    Arrow Token (->): Separates the parameter list and the body.
    Body: The code to be executed.


basicamente, com lambda, você instancia uma interface funcional atribuindo pra ela
um corpo pro seu único método
é basicamente um corta caminhho que deixa o código mais dinâmico e legível

*/}
        
    }
}

