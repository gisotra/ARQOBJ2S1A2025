package aulas.aula4_Arquivos_XML_Multithreading.concorrencia;

import java.util.concurrent.*;

public class Imprimir implements Runnable {
    private int inicio, passo, fim;
    private int delay;

    public Imprimir(int inicio, int passo, int fim, int delay) {
        this.inicio = inicio;
        this.passo = passo;
        this.fim = fim;
        this.delay = delay;
    }
    
    @Override
    
    /*
    Método que não retorna nenhum valor e que é chamado no instante em que 
    a thread é iniciada no sistema.
    
    Se baseia em um caminho alternativo com uma linha de código própria
    */
    public void run(){
        
        try{
        
        for(int i = inicio; i < fim; i += passo){
            System.out.println("> " + i);
            Thread.sleep(delay);
        }
        
        } catch (InterruptedException ex) {
            ex.printStackTrace();
            
        }
    
    }
    
    
}
