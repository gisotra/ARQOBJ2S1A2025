package aulas.aula3_ExcecoesVerificadas_Regex_Arquivos;

public class ExcecaoNaoVerificada extends RuntimeException {
    
    public ExcecaoNaoVerificada(String mensagem){
        super(mensagem);
    }
    
}
