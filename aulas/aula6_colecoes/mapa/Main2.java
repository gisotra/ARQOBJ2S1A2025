package aulas.aula6_colecoes.mapa;


import aulas.aula6_colecoes.Pessoa;
import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        
        Map<String, Pessoa> funcionarios = new HashMap();
        funcionarios.put("555.999.777-22", new Pessoa("Joao", 21));
        funcionarios.put("888.555.666-44", new Pessoa("Maroa", 32));
        funcionarios.put("333.444.544-11", new Pessoa("Carlos", 17));
    }
}
