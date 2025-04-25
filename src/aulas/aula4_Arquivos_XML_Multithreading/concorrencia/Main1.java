package aulas.aula4_Arquivos_XML_Multithreading.concorrencia;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main1 {
    public static void main(String[] args) {
        Imprimir pares = new Imprimir(0, 2, 50, 750);
        Imprimir impares = new Imprimir(1, 2, 10, 1500);
        
        /*
        pares.run();
        impares.run();
        
        Thread Thread1 = new Thread(pares);
        Thread Thread2 = new Thread(impares);
        
        Thread1.start();
        Thread2.start(); */
        
        ExecutorService executorThreads = Executors.newCachedThreadPool();
        
        executorThreads.execute(pares);
        executorThreads.execute(impares);
        
        executorThreads.shutdown();
        
        
        System.out.println("Fim do main.");
    }
}
