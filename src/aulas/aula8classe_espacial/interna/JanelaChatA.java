package aulas.aula8classe_espacial.interna;

public class JanelaChatA extends JanelaChat {
    public JanelaChatA() {
        super();
        jButtonApagar.addActionListener(new ApagarMensagem(jTextAreaMensagem) );
        jButtonApagar.addActionListener(new EnviarMensagem(jTextAreaMensagem, jTextAreaHistorico) );
    }
}
