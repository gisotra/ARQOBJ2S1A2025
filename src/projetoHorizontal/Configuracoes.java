package projetoHorizontal;

import java.awt.Font;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.*; 

public class Configuracoes extends JFrame implements ActionListener{
    private JLabel rotulo, tema, linguagem, sons;
    private JButton voltar;
    
    public Configuracoes(){
        setTitle("Configurações");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        
        //rotulos 
        rotulo = new JLabel(); 
        rotulo.setText("CONFIGURAÇÕES:");
        rotulo.setBounds(310, 20, 200, 25); 
        rotulo.setFont(new Font("Arial", Font.BOLD, 20));
        add(rotulo); 

        
        tema = new JLabel();
        tema.setText("TEMA");
        tema.setBounds(120, 120, 100, 30); 
        add(tema);
        tema.setFont(new Font("Arial", Font.BOLD, 20));

        linguagem = new JLabel();
        linguagem.setText("LINGUA");
        linguagem.setBounds(357, 120, 100, 30);
        add(linguagem);
        linguagem.setFont(new Font("Arial", Font.BOLD, 20));
        
        sons = new JLabel();
        sons.setText("SONS");
        sons.setBounds(610, 120, 100, 30);
        add(sons);
        sons.setFont(new Font("Arial", Font.BOLD, 20));

        //COMBO BOXES
        
        String[] Temas = {"Tema Claro", "Tema Escuro", "Tema Neon", "Contraste", "Invertido", "OldSchool", "Pixelado"};
        String[] Linguas = {"Português", "Inglês", "Árabe", "Japonês", "Russo", "Norueguês", "Espanhol", "Francês", "Turco"};
        String[] Sons = {"Ligado", "Desligado"};
        
        JComboBox ComboTema = new JComboBox(Temas);
        ComboTema.setBounds(75, 160, 150, 30);
        add(ComboTema);
        
        JComboBox ComboLinguas = new JComboBox(Linguas);
        ComboLinguas.setBounds(312, 160, 150, 30);
        add(ComboLinguas);
        
        JComboBox ComboSons = new JComboBox(Sons);
        ComboSons.setBounds(565, 160, 150, 30);
        add(ComboSons);
        
        
        
        
  
        
        
        
        voltar = new JButton();
        voltar.setText("Voltar");
        voltar.setBounds(329, 375, 130, 30);
        voltar.addActionListener(this);
        voltar.setFont(new Font("Arial", Font.BOLD, 12));
        add(voltar);
        
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) { // Método chamado quando ocorre um evento de ação.
        if (ae.getSource() == voltar) {
            new Menu(); // Volta ao menu
            this.dispose();
        } 

    }
    
    public static void main(String[] args){
        new Configuracoes();
    }
}
