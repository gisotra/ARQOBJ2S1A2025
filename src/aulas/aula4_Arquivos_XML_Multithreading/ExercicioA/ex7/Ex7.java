/*
Escreva um programa Java para criar um método que receba uma string como entrada e lance uma exceção se a string não contiver vogais.
 */
package aulas.aula4_Arquivos_XML_Multithreading.ExercicioA.ex7;

public class Ex7 {
    private String string;
    
    public void receberString(String palavra){
        if(palavra != null){
            if(!palavra.contains("a") && !palavra.contains("e") && !palavra.contains("i")
                    && !palavra.contains("o") && !palavra.contains("u")){
                        throw new RuntimeException("A palavra " + palavra + " nao contem vogais");
            } else {
                System.out.println("A palavra possui vogais");
            }
        }
    }
}
