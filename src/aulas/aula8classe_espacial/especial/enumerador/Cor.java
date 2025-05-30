package aulas.aula8classe_espacial.especial.enumerador;

public enum Cor {
    
    VERMELHO("VERMELHO", "#FF0000"),
    VERDE("VERDE", "#00FF00"),
    AZUL("AZUL", "#0000FF"),
    PRETO("PRETO", "#000000"),
    BRANCO("BRANCO", "#FFFFFF");
    
    private String nome;
    private String codigo;
    
    // método de inicialização do enum precisa ser privado
    private Cor(String nome, String codigo) {
        setNome(nome);
        setCodigo(codigo);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        if( nome != null ) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome não pode ser nulo.");
        }
    }

    public String getCodigo() {
        return codigo;
    }

    private void setCodigo(String codigo) {
        if( codigo.matches("#([a-fA-F0-9]){6}") ) {
            this.codigo = codigo;
        } else {
            throw new IllegalArgumentException("O código deve ser um hexadecimal de cor.");
        }
    }

    @Override
    public String toString() {
        return getNome() + " (" + getCodigo() + ")";
    }

}
