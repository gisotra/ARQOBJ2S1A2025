package aulas.aula4_Arquivos_XML_Multithreading.ExercicioA.ex26;

/*
26. Escreva um programa Java para verificar se uma determinada string é um código hexadecimal válido ou não.
 */
public class Main {

    public static void main(String[] args) {
        String regex = "#[0-9a-zA-Z]{6}";
        String palavra1 = "Expressao Regular";
        String palavra2 = "#FF0099";
        String palavra3 = "#220365";
        String palavra4 = "#2203612301203";
        String palavra5 = "Giovane";

        System.out.println(palavra1 + " | " + regex + " -> " + palavra1.matches(regex));
        System.out.println(palavra2 + " | " + regex + " -> " + palavra2.matches(regex));
        System.out.println(palavra3 + " | " + regex + " -> " + palavra3.matches(regex));
        System.out.println(palavra4 + " | " + regex + " -> " + palavra4.matches(regex));
        System.out.println(palavra5 + " | " + regex + " -> " + palavra5.matches(regex));

    }

}
