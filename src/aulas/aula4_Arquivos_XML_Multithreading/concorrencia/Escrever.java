package aulas.aula4_Arquivos_XML_Multithreading.concorrencia;

public class Escrever implements Runnable { //herda o método run

    private int inicio, passo, fim;
    private int delay;
    private Fila fila;

    public Escrever(int inicio, int passo, int fim, int delay, Fila fila) {
        this.inicio = inicio;
        this.passo = passo;
        this.fim = fim;
        this.delay = delay;
        this.fila = fila;
    }
    
    @Override
    public void run() {
        
        for(int i = inicio; i <= fim; i += passo) {
            fila.adicionar(i, delay);
        }
        
    }
    
}
