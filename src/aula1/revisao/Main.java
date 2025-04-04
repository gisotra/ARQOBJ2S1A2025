package aula1.revisao;

public class Main {
    public static void main(String[] args) {
        LivroFisico l1 = new LivroFisico("Manhattan", "Projeto Manhattan", "Robert Hopihari", 10, 1950);
        Revista r1 = new Revista("Gothan City", "Batman vs Ronaldinho", "Giovane The CReator", 1, 2013);
        
        Emprestavel[] biblioteca = new Emprestavel[2];
        biblioteca[0] = l1;
        biblioteca[1] = r1;
        
    }
}
