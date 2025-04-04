package projetoHorizontal;

import java.awt.Font;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.*; 

public class Biblioteca extends JFrame implements ActionListener{
    
    private JLabel rotulo;
    private JButton metroidvania, RPG, roguelike, voltar;    
    private JList<String> listaJogos;
    private DefaultListModel<String> modeloLista;
    
    public Biblioteca(){
        setTitle("Meus Jogos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        
        
        modeloLista = new DefaultListModel<>();

        for (String jogo : DadosJogos.getJogosInstalados()) {
            modeloLista.addElement(jogo);
        }

        listaJogos = new JList<>(modeloLista);
        JScrollPane scrollPane = new JScrollPane(listaJogos);
        scrollPane.setBounds(250, 60, 300, 300);
        add(scrollPane);
        
        rotulo = new JLabel();
        rotulo.setText("Meus Jogos:"); 
        rotulo.setBounds(329, 20, 130, 25); 
        add(rotulo); 
        rotulo.setFont(new Font("Arial", Font.BOLD, 20));
        
        voltar = new JButton();
        voltar.setText("Voltar");
        voltar.setBounds(329, 400, 130, 30);
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
