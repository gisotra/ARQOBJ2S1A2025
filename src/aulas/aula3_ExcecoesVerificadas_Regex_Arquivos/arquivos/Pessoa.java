package aulas.aula3_ExcecoesVerificadas_Regex_Arquivos.arquivos;

public class Pessoa {
    
    private String nome;
    private String cpf;

    
    public Pessoa(String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        } else {
            throw new RuntimeException("O nome nao pode ser nulo");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if( cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}") ){
            this.cpf = cpf;
        } else {
            throw new RuntimeException("O CPF deve estar no formato XX.XXX.XXX-XX");
        }
    
    }
    
    public String toString(){
            return getNome() + " (" + getCpf() + ")";
    }
    

}
