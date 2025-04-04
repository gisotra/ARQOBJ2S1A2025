package projetoHorizontal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sobre extends JFrame implements ActionListener{
    
    private JButton voltar;
    
    public Sobre(){
        setTitle("Sobre");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        
        JTextArea descriptionArea = new JTextArea();
        descriptionArea.setText("Esse projeto é um simulador de uma biblioteca de jogos similar à plataforma Steam, conhecida internacionalmente por sua acessibilidade e funcionamento simples. O projeto conta com janelas correspondentes às funcionalidades da plataforma original, como a Biblioteca de jogos e uma loja. O projeto tem a funcionalidade de adicionar os jogos 'instalados' pelo usuario na biblioteca de forma dinamica. ");
        descriptionArea.setBounds(20, 20, 440, 150); 
        descriptionArea.setEditable(false); 
        descriptionArea.setLineWrap(true); 
        descriptionArea.setWrapStyleWord(true); 
        descriptionArea.setFont(new Font("Arial", Font.PLAIN, 14)); 
        add(descriptionArea);
        
        voltar = new JButton();
        voltar.setText("Voltar");
        voltar.setBounds(329, 200, 130, 30);
        voltar.addActionListener(this);
        voltar.setFont(new Font("Arial", Font.BOLD, 12));
        add(voltar);
        setVisible(true);
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) { 
        if (ae.getSource() == voltar) {
            new Menu(); 
            this.dispose();
        } 


    }
}
