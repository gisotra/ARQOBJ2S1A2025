package aulas.aula6_colecoes;

public class Pessoa implements Comparable<Pessoa>{
 
    
    private String nome;
    private int idade;
    

    public Pessoa(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null){
        this.nome = nome;
        } else {
            throw new RuntimeException("Nome invalido");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >= 0){
            this.idade = idade;
        } else {
            throw new RuntimeException("Idade tem que ser maior que zero");
        }
    }
    
    @Override //classe object
    public String toString(){
        return "Nome: " + getNome() + " | Idade: " + getIdade();
    }
    
    @Override //interface comparable
    public int compareTo(Pessoa p){
        if(getIdade() == p.getIdade() ) {
            return 0;
        } else {
            if( getIdade() > p.getIdade() ){
                return 1;
            } else {
               return -1;
            }
        }
         
    }
    
}
