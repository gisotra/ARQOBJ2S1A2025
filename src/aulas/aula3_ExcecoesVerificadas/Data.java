package aulas.aula3_ExcecoesVerificadas;

public class Data {
        
    private int dia, mes, ano; /*Atributos encapsulados*/

    /*======== GETTERS E SETTERS ========*/
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if( dia >= 1 && dia <= 31 ) {
            this.dia = dia;
        } else {
            /*Caso seja dado o input de um dia inválido, ele vai lançar uma Exceção no terminal que não precisa
            ser capturada por um try-catch, o nome dessa exceção é RuntimeException*/
            throw new ExcecaoNaoVerificada("O dia deve estar entre 1 e 31.");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws Exception {
        /*
        
        */
        if( mes >= 1 && mes <= 12 ) {
            this.mes = mes;
        } else {
            throw new ExcecaoVerificada("O mês deve estar entre 1 e 12.");
            /*
              Aqui é um caso diferente do método setDia, aqui, caso o mês inputtado seja invalido, 
            ele vai lançar uma exceção que PRECISA de try-catch para ser capturada e tratada
            */
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano > 0) {
            this.ano = ano;
        } else {
            throw new ExcecaoNaoVerificada("O ano precisar ser maior ou igual a zero.");
        }
    }
    
    

}
