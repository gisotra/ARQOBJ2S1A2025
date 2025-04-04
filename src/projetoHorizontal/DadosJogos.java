package projetoHorizontal;

import java.util.ArrayList;

public class DadosJogos {
    private static ArrayList<String> jogosInstalados = new ArrayList<>();

    public static void adicionarJogo(String jogo) {
        if (!jogosInstalados.contains(jogo)) {
            jogosInstalados.add(jogo);
        }
    }

    public static ArrayList<String> getJogosInstalados() {
        return jogosInstalados;
    }
}
