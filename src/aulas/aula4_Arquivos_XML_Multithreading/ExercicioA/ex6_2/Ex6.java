/*
6. Escreva um programa Java para comparar dois arquivos lexicograficamente.
De acordo com a Wikipédia:
Em matemática, a ordem lexicográfica (também conhecida como ordem léxica, ordem de dicionário,
ordem alfabética ou produto lexicográfico) é uma generalização da maneira como a ordem alfabética
das palavras é baseada na ordem alfabética de suas letras componentes. Essa generalização consiste
principalmente em definir uma ordem total sobre as sequências (frequentemente chamadas de
palavras em ciência da computação) de elementos de um conjunto finito totalmente ordenado,
frequentemente chamado de alfabeto.
 */
package aulas.aula4_Arquivos_XML_Multithreading.ExercicioA.ex6_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Ex6 {

    public static void main(String[] args) {
        // Define os caminhos dos dois arquivos a serem comparados
        String caminhoArquivo1 = "arquivo1.txt";
        String caminhoArquivo2 = "arquivo2.txt";

        try {
            // Lê todas as linhas dos dois arquivos em listas de strings
            List<String> linhas1 = Files.readAllLines(Paths.get(caminhoArquivo1));
            List<String> linhas2 = Files.readAllLines(Paths.get(caminhoArquivo2));

            // Determina o menor número de linhas entre os dois arquivos
            int menorTamanho = Math.min(linhas1.size(), linhas2.size());

            // Variável de controle para saber se encontramos alguma diferença
            boolean diferente = false;

            // Compara os arquivos linha por linha até encontrar uma diferença
            for (int i = 0; i < menorTamanho; i++) {
                String linha1 = linhas1.get(i); // Linha do primeiro arquivo
                String linha2 = linhas2.get(i); // Linha do segundo arquivo

                // Compara as duas linhas lexicograficamente
                int resultado = linha1.compareTo(linha2);

                if (resultado < 0) {
                    // A linha do arquivo 1 é lexicograficamente menor
                    System.out.println("Na linha " + (i + 1) + ", o arquivo 1 é lexicograficamente menor.");
                    diferente = true;
                    break; // Encerra a comparação, já que encontrou uma diferença
                } else if (resultado > 0) {
                    // A linha do arquivo 2 é lexicograficamente menor
                    System.out.println("Na linha " + (i + 1) + ", o arquivo 2 é lexicograficamente menor.");
                    diferente = true;
                    break; // Encerra a comparação, já que encontrou uma diferença
                }
                // Se as linhas forem iguais, continua o loop
            }

            // Se não houve diferenças nas linhas comparadas
            if (!diferente) {
                // Verifica se algum dos arquivos tem mais linhas (e portanto não são iguais)
                if (linhas1.size() < linhas2.size()) {
                    // O arquivo 1 é um prefixo do arquivo 2, logo é menor
                    System.out.println("O arquivo 1 é lexicograficamente menor.");
                } else if (linhas1.size() > linhas2.size()) {
                    // O arquivo 2 é um prefixo do arquivo 1, logo é menor
                    System.out.println("O arquivo 2 é lexicograficamente menor.");
                } else {
                    // Ambos os arquivos têm o mesmo conteúdo e número de linhas
                    System.out.println("Os arquivos são lexicograficamente iguais.");
                }
            }

        } catch (IOException e) {
            // Captura e exibe erro caso ocorra algum problema ao ler os arquivos
            System.out.println("Erro ao ler: " + e.getMessage());
        }
    }
}
