/*
29. Escreva um programa Java para verificar se uma determinada string é uma expressão matemática ou não.
 */
package aulas.aula4_Arquivos_XML_Multithreading.ExercicioA.ex29;

public class Main {

    public static void main(String[] args) {
        String regex = "^[\\d\\s\\+\\-\\*/]+$";
        /*
        explicação da Regex:
        ^ e $ garantem que a string vai seguir esse padrão
        \d pede um dígito (0 - 9)
        \s é um espaço esperado
        \+-/* são os operadores matemáticos
         o + depois do ultimo colchete faz com que esse caractere se aplique
        indefinidamente.
         */

        String palavra1 = "Expressao Regular";
        String palavra2 = "12 + 31 * 1200";
        String palavra3 = "#220365";
        String palavra4 = "123 - 2 / 30";
        String palavra5 = "Giovane";

        System.out.println(palavra1 + " | " + regex + " -> " + palavra1.matches(regex));
        System.out.println(palavra2 + " | " + regex + " -> " + palavra2.matches(regex));
        System.out.println(palavra3 + " | " + regex + " -> " + palavra3.matches(regex));
        System.out.println(palavra4 + " | " + regex + " -> " + palavra4.matches(regex));
        System.out.println(palavra5 + " | " + regex + " -> " + palavra5.matches(regex));
    }
}
