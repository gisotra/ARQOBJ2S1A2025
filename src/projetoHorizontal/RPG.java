
package projetoHorizontal;

import java.awt.Font;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.*; 

public class RPG extends JFrame implements ActionListener {
    
    private JLabel Hades, Undertale, Earthbound;
    private JButton instalar1, instalar2, instalar3, voltar;
    
    public RPG(){
        setTitle("RPGs");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        //rótulos
        Hades = new JLabel();
        Hades.setText("Hades");
        Hades.setBounds(60, 30, 120, 40);
        Hades.setFont(new Font("Arial", Font.BOLD, 16));
        add(Hades);

        Undertale = new JLabel();
        Undertale.setText("Undertale");
        Undertale.setBounds(60, 90, 120, 40);
        Undertale.setFont(new Font("Arial", Font.BOLD, 16));
        add(Undertale);

        Earthbound = new JLabel();
        Earthbound.setText("Metroid");
        Earthbound.setBounds(60, 150, 120, 40);
        Earthbound.setFont(new Font("Arial", Font.BOLD, 16));
        add(Earthbound);

        
        
        
        //botões
        instalar1 = new JButton();
        instalar1.setText("Instalar");
        instalar1.setBounds(305, 30, 110, 35);
        instalar1.addActionListener(this);
        instalar1.setFont(new Font("Arial", Font.BOLD, 16));
        add(instalar1);

        instalar2 = new JButton();
        instalar2.setText("Instalar");
        instalar2.setBounds(305, 90, 110, 35);
        instalar2.addActionListener(this);
        instalar2.setFont(new Font("Arial", Font.BOLD, 16));
        add(instalar2);

        instalar3 = new JButton();
        instalar3.setText("Instalar");
        instalar3.setBounds(305, 150, 110, 35);
        instalar3.addActionListener(this);
        instalar3.setFont(new Font("Arial", Font.BOLD, 16));
        add(instalar3);

        voltar = new JButton();
        voltar.setText("Voltar");
        voltar.setBounds(189, 220, 130, 30);
        voltar.addActionListener(this);
        voltar.setFont(new Font("Arial", Font.BOLD, 12));
        add(voltar);
        
        
        setVisible(true);
    }
    
        @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == voltar) {
            new Loja(); // 
            this.dispose();
        } else if (ae.getSource() == instalar1) {
                instalar1.setText("Instalado");
                instalar1.setEnabled(false); // Desativa o botão
                DadosJogos.adicionarJogo("Hades");
                JOptionPane.showMessageDialog(this, "Hades foi instalado na sua biblioteca!");
            } else if (ae.getSource() == instalar2) {
                instalar2.setText("Instalado");
                instalar2.setEnabled(false);
                DadosJogos.adicionarJogo("Undertale");
                JOptionPane.showMessageDialog(this, "Undertale foi instalado na sua biblioteca!");
            } else if (ae.getSource() == instalar3) {
                instalar3.setText("Instalado");
                instalar3.setEnabled(false);
                DadosJogos.adicionarJogo("Earthbound");
                JOptionPane.showMessageDialog(this, "Earthbound foi instalado na sua biblioteca!");
            }
        
        
        
        
        
    }
}
    

