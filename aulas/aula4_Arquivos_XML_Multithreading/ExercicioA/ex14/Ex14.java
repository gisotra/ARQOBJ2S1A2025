/*
 Escreva um programa Java para armazenar o conteúdo de um arquivo de texto linha por linha em um array (vetor).
 */
package aulas.aula4_Arquivos_XML_Multithreading.ExercicioA.ex14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ex14 {
    public static void main(String[] args) {
        String caminhoArquivo = "meuarquivo.txt";
        ArrayList<String> linhas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linhas.add(linha); // Adiciona cada linha ao ArrayList
            }

            // Converte para vetor
            String[] linhasArray = linhas.toArray(new String[0]);

            // Mostra o vetor
            for (String l : linhasArray) {
                System.out.println(l);
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}