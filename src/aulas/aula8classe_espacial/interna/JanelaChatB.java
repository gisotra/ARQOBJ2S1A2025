package aulas.aula8classe_espacial.interna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JanelaChatB extends JanelaChat{
    super();
    
 
    private class ApagarMensagem implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            System.out.println("Apagar Mensagem!");
            jTextAreaMensagem.setText();
            jTextAreaMensagem.requestFocusInWindow();
        }   
    }
}
