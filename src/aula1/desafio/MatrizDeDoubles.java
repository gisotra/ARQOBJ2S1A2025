package aula1.desafio;
public class MatrizDeDoubles {
    private int linha;
    private int coluna;
    private double[][] malha;

    
    public MatrizDeDoubles(int proporcao, double valor){
        //não vou validar se o parametro "valor" é negativo, porque se o usuário quisesse ele poderia ter uma matriz composta por negativos
        if(proporcao == 2 || proporcao == 3){
            setLinha(proporcao);
            setColuna(proporcao);
            this.malha = new double[linha][coluna];
                //preenchendo a malha:
                for(int i = 0; i < proporcao; i++){ //linha
                    for(int j = 0; j < proporcao; j++){ //coluna
                        malha[i][j] = valor;
                    }
                }
        } else {
            System.out.println("Valor invalido");
        }
        
    }
    
    public MatrizDeDoubles(int proporcao){
        if(proporcao == 2 || proporcao == 3){
            setLinha(proporcao);
            setColuna(proporcao);
            this.malha = new double[linha][coluna];
                //preenchendo a malha com zeros:
                for(int i = 0; i < proporcao; i++){ //linha
                    for(int j = 0; j < proporcao; j++){ //coluna
                        malha[i][j] = 0.0;
                    }
                }
        } else {
            System.out.println("Valor invalido");
        }
    }
    
    
    ////////// Getters //////////
    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }
    
    
    ////////// Setters Encapsulados //////////
    private void setLinha(int linha) {
        if(linha > 0){
        this.linha = linha;
        }
    }

    private void setColuna(int coluna) {
        if(coluna > 0){
        this.coluna = coluna;            
        }
    }
    
    ////////// Métodos //////////
    public double obter(int lin, int col){
    return malha[lin][col];
    }
    
    public boolean alterar(int lin, int col, double valor){
        if((lin > getLinha() || lin < 0) || (col > getColuna() || col < 0)){
            return false;
        } 
        malha[lin][col] = valor;
        return true;
    }
    
    public boolean adicionar(double valor){
        if(valor > 0){
            for(int i = 0; i < getLinha(); i++){
                for(int j = 0; j < getColuna(); j++){
                    malha[i][j] += valor;
                }
            }
            return true;
        }
        return false;
    }
    
    public boolean subtrair(double valor){
        if(valor < 0){
            for(int i = 0; i < getLinha(); i++){
                for(int j = 0; j < getColuna(); j++){
                    malha[i][j] -= valor;
                }
            }
            return true;
        }
        return false;
    }
    
    public boolean dividir(double valor){
        if(valor != 0){
            for(int i = 0; i < getLinha(); i++){
                for(int j = 0; j < getColuna(); j++){
                    malha[i][j] /= valor;
                }
            }
            return true;
        }
        return false;
    }
    
    public boolean multiplicar(double valor) {
        if (valor != 0) {
            for (int i = 0; i < getLinha(); i++) {
                for (int j = 0; j < getColuna(); j++) {
                    malha[i][j] *= valor;
                }
            }
            return true;
        }
        return false;
    }
    
    public double maior(){
        double maior = malha[0][0];
            for (int i = 0; i < getLinha(); i++) {
                for (int j = 0; j < getColuna(); j++) {
                    if(malha[i][j] > maior){
                        maior = malha[i][j];
                    } 
                }
            }
        return maior;
    }
    
    public double menor(){
        double menor = malha[0][0];
            for (int i = 0; i < getLinha(); i++) {
                for (int j = 0; j < getColuna(); j++) {
                    if(malha[i][j] < menor){
                        menor = malha[i][j];
                    } 
                }
            }
        return menor;
    }
    
    public double determinante(){
        double det = 0;
        if(getLinha() == 2){
            det = (malha[0][0] * malha[1][1]) - (malha[0][1] * malha[1][0]);
            return det;
        } 
        //caso seja 3
        det = (malha[0][0] * malha[1][1] * malha[1][2]) + (malha[0][1] * malha[1][2] * malha[2][0]) + 
                    (malha[0][2] * malha[1][0] * malha[2][1]) - (malha[0][0] * malha[1][2] * malha[2][1]) -
                        (malha[0][1] * malha[1][0] * malha[2][2]) - (malha[0][2] * malha[1][1] * malha[2][0]);
            return det;
        }
    
    @Override
    public String toString(){
        String varTemp = "";
        for(int i = 0; i < getLinha(); i++){
            varTemp += "\n";
            for(int j = 0; j < getColuna(); j++){
                varTemp += this.malha[i][j] + " ";
            }
        }
        return varTemp;
    }
    
}
