package aula1.revisao;
public abstract class MaterialBibliografico implements Emprestavel{
    
    private String localizacao;
    private String titulo;
    private String autores;
    private int edicao;
    private int ano;
    private int quantidade;

    public MaterialBibliografico(String localizacao, String titulo, String autores, int edicao, int ano, int quantidade) {
        setLocalizacao(localizacao);
        setTitulo(titulo);
        setAutores(autores);
        setEdicao(edicao);
        setAno(ano);
        setQuantidade(quantidade);
    }

    
    ////////////// getters //////////////
    public String getLocalizacao() {
        return localizacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutores() {
        return autores;
    }

    public int getEdicao() {
        return edicao;
    }

    public int getAno() {
        return ano;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    ////////////// setters encapsulados //////////////
    private void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private void setAutores(String autores) {
        this.autores = autores;
    }

    private void setEdicao(int edicao) {
        if(edicao > 0) {
            this.edicao = edicao;
        }
    }

    private void setAno(int ano) {
        if(ano > 0){
            this.ano = ano;
        }
    }

    protected void setQuantidade(int quantidade) {
        if (quantidade > 0){
            this.quantidade = quantidade;
        }
        
    }
    
    @Override
    public String getNomeObjeto(){
        return getTitulo();
    }
    
    @Override
    public boolean podeEmprestar(){
        if(getQuantidade() > 1) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean emprestar(){
        if( podeEmprestar() ){
            setQuantidade( getQuantidade() - 1);
            return true;
        } else {
            return false;
        }
    }
    
    
    
}
