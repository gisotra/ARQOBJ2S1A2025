/*
18. Escreva um programa Java para encontrar a palavra mais longa em um arquivo de texto.
 */
package aulas.aula4_Arquivos_XML_Multithreading.ExercicioA.ex18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex18 {
    public static void main(String[] args) {
        String caminhoArquivo = "meuarquivo.txt"; // Nome do arquivo

        try {
            // Lê todo o conteúdo do arquivo como uma única string
            String conteudo = Files.readString(Paths.get(caminhoArquivo));

            // Divide o conteúdo em palavras, removendo pontuação simples
            String[] palavras = conteudo.split("[\\s\\p{Punct}]+");

            String palavraMaisLonga = "";

            for (String palavra : palavras) {
                if (palavra.length() > palavraMaisLonga.length()) {
                    palavraMaisLonga = palavra;
                }
            }

            System.out.println("A palavra mais longa é: " + palavraMaisLonga);

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
