package aulas.aula8classe_espacial.interna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

public class ApagarMensagem implements ActionListener{
    private JTextArea jTextAreaMensagem;
    
    public ApagarMensagem(JTextArea jTextAreaMensagem) {
        this.jTextAreaMensagem = jTextAreaMensagem;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        System.out.println("Apagar Mensagem!");    
        jTextAreaMensagem.setText("");
        jTextAreaMensagem.requestFocusInWindow();
    }
    
}
