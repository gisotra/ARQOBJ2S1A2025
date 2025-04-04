package projetoHorizontal;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener {
    
    private ArrayList<String> jogosInstalados = new ArrayList<>();
    private JMenuBar jMenuBarPrincipal;
    private JMenu Login, Loja, Biblioteca, Configuracoes, Sobre;
    private JMenuItem jMenuItemLogin, jMenuItemSobre, jMenuItemLoja, jMenuItemBiblioteca, jMenuItemConfiguracoes;
    

    public Menu() {
        setTitle("Biblioteca de Jogos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 800);
        setResizable(false);
        setLocationRelativeTo(null);

        // Barra de menu
        jMenuBarPrincipal = new JMenuBar();
        setJMenuBar(jMenuBarPrincipal); 

        
        //(posiçãoX, posiçãoY, altura, gordura(
        // Menus principais
        Login = new JMenu("Login");
        Loja = new JMenu("Loja");
        Biblioteca = new JMenu("Biblioteca");
        Configuracoes = new JMenu("Configuracoes");
        Sobre = new JMenu("Sobre");

        jMenuBarPrincipal.add(Login);
        jMenuBarPrincipal.add(Loja);
        jMenuBarPrincipal.add(Biblioteca);
        jMenuBarPrincipal.add(Configuracoes);
        jMenuBarPrincipal.add(Sobre);
        
        
        // Adiciona item "Login"
        jMenuItemLogin = new JMenuItem("Sign in");
        jMenuItemLogin.addActionListener(this); 
        Login.add(jMenuItemLogin);
        

        // Adiciona item "Sobre"
        jMenuItemSobre = new JMenuItem("Sobre o Programa");
        jMenuItemSobre.addActionListener(this); 
        Sobre.add(jMenuItemSobre);
        
        //Adiciona item "Loja"
        jMenuItemLoja = new JMenuItem("Loja");
        jMenuItemLoja.addActionListener(this);
        Loja.add(jMenuItemLoja);
        
        //Adiciona item "Biblioteca"
        jMenuItemBiblioteca = new JMenuItem("Biblioteca");
        jMenuItemBiblioteca.addActionListener(this);
        Biblioteca.add(jMenuItemBiblioteca);
        
        jMenuItemConfiguracoes = new JMenuItem("Configurações");
        jMenuItemConfiguracoes.addActionListener(this);
        Configuracoes.add(jMenuItemConfiguracoes);

        
        
        setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jMenuItemLogin) {
            new Login();
            this.dispose(); 
        } else if (e.getSource() == jMenuItemLoja) {
            new Loja(); 
            this.dispose();
        } else if (e.getSource() == jMenuItemSobre) {
            new Sobre();
            this.dispose();
        }  else if (e.getSource() == jMenuItemBiblioteca) {
            new Biblioteca(); 
            this.dispose();
        } else if (e.getSource() == jMenuItemConfiguracoes) {
            new Configuracoes();
            this.dispose();
        }
      
    }
    
    public static void main(String[] args) {
        new Menu(); // Inicializa o programa
    }
}