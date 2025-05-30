package aulas.aula8classe_espacial.especial.enumerador;

public class FormaGeometricaA {
    
    /*
    Você está criando um novo tipo chamado Cor, e os valores VERMELHO, AZUL, etc. são constantes desse tipo.

    Ou seja:

    Cor.VERMELHO é um objeto do tipo Cor.

    Cor.AZUL também é um objeto do tipo Cor.

    Eles não são String, mas você pode obter o nome deles como String com .name():
    */
    
    public enum Cor { VERMELHO, AZUL, BRANCO, VERDE, PRETO };
    
    private Cor corPreenchimento;
    private Cor corBorda;

    public FormaGeometricaA(Cor corPreenchimento, Cor corBorda) {
        setCorPreenchimento(corPreenchimento);
        setCorBorda(corBorda);
    }
    
    public Cor getCorPreenchimento() {
        return corPreenchimento;
    }

    public void setCorPreenchimento(Cor corPreenchimento) {
        this.corPreenchimento = corPreenchimento;
    }

    public Cor getCorBorda() {
        return corBorda;
    }

    public void setCorBorda(Cor corBorda) {
        this.corBorda = corBorda;
    }

}

