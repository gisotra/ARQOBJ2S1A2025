package projetoHorizontal_Obj1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import javax.swing.*; 

public class Loja extends JFrame implements ActionListener {
    
    private JLabel rotulo1, rotulo2;
    private JButton metroidvania, RPG, roguelike, voltar;
        
    public Loja(){
        setTitle("Loja");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        
        rotulo1 = new JLabel(); 
        rotulo1.setText("LOJA:"); 
        rotulo1.setBounds(370, 20, 200, 25); 
        add(rotulo1); 
        rotulo1.setFont(new Font("Arial", Font.BOLD, 20));
        
        rotulo2 = new JLabel(); 
        rotulo2.setText("Escolha o gênero de jogo:");
        rotulo2.setBounds(300, 80, 200, 25); 
        add(rotulo2);
        rotulo2.setFont(new Font("Arial", Font.BOLD, 16));
        
        //botões da minha página 
        
        RPG = new JButton(); 
        RPG.setText("RPG"); 
        RPG.setBounds(320, 175, 150, 70); 
        RPG.addActionListener(this); 
        RPG.setFont(new Font("Arial", Font.BOLD, 16));
        add(RPG); 
        
        metroidvania = new JButton();
        metroidvania.setText("Metroidvania");
        metroidvania.setBounds(110, 175, 150, 70);
        metroidvania.addActionListener(this);
        metroidvania.setFont(new Font("Arial", Font.BOLD, 16));
        add(metroidvania);
        
        roguelike = new JButton();
        roguelike.setText("Ação");
        roguelike.setBounds(530, 175, 150, 70);
        roguelike.addActionListener(this);
        roguelike.setFont(new Font("Arial", Font.BOLD, 16));
        add(roguelike);
        
        voltar = new JButton();
        voltar.setText("Voltar");
        voltar.setBounds(329, 355, 130, 30);
        voltar.addActionListener(this);
        voltar.setFont(new Font("Arial", Font.BOLD, 12));
        add(voltar);

        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) { 
        if (ae.getSource() == voltar) {
            new Menu(); // Volta ao menu
            this.dispose();
        } else if (ae.getSource() == metroidvania) {
            new Metroidvania();
            this.dispose();
        } else if (ae.getSource() == RPG) {
            new RPG();
            this.dispose();
        } else if (ae.getSource() == roguelike) {
            new Roguelike();
            this.dispose();
        } 
      
    }
    
  
}
