
package projetoHorizontal;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 

public class Roguelike extends JFrame implements ActionListener {
    
    private JLabel DeadCells, ETGun, TBOI;
    private JButton instalar1, instalar2, instalar3, voltar;
    
    public Roguelike(){
        setTitle("ROGUELIKES");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);


        //rótulos
        DeadCells = new JLabel();
        DeadCells.setText("Dead Cells");
        DeadCells.setBounds(60, 30, 120, 40);
        DeadCells.setFont(new Font("Arial", Font.BOLD, 16));
        add(DeadCells);

        ETGun = new JLabel();
        ETGun.setText("E.T.Gungeon");
        ETGun.setBounds(60, 90, 120, 40);
        ETGun.setFont(new Font("Arial", Font.BOLD, 16));
        add(ETGun);

        TBOI = new JLabel();
        TBOI.setText("T.B.O.I.");
        TBOI.setBounds(60, 150, 120, 40);
        TBOI.setFont(new Font("Arial", Font.BOLD, 16));
        add(TBOI);

        
        
        
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
            new Loja(); 
            this.dispose();
        } else if (ae.getSource() == instalar1) {
            instalar1.setText("Instalado");
            instalar1.setEnabled(false); // Desativa o botão
            DadosJogos.adicionarJogo("Dead Cells");
            JOptionPane.showMessageDialog(this, "Dead Cells foi instalado na sua biblioteca!");
        } else if (ae.getSource() == instalar2) {
            instalar2.setText("Instalado");
            instalar2.setEnabled(false);
            DadosJogos.adicionarJogo("E.T.Gungeon");
            JOptionPane.showMessageDialog(this, "Enter The Gungeon foi instalado na sua biblioteca!");
        } else if (ae.getSource() == instalar3) {
            instalar3.setText("Instalado");
            instalar3.setEnabled(false);
            DadosJogos.adicionarJogo("T.B.O.I.");
            JOptionPane.showMessageDialog(this, "The Binding Of Isaac foi instalado na sua biblioteca!");
        }

    }
}
