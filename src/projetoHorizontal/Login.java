package projetoHorizontal;

import java.awt.Font;
import java.awt.event.ActionEvent; // Importa a classe ActionEvent para lidar com eventos de ação.
import java.awt.event.ActionListener; // Importa a interface ActionListener para tratar eventos de ação.
import javax.swing.*; // Importa as classes do pacote Swing para criar a interface gráfica.

public class Login extends JFrame implements ActionListener{
    
    private JLabel rotulo, nome, email, telefone, descricao, genero;
    private JTextField FNome, FEmail, FTel, FDescricao; 
    private JButton voltar, enviar;
    
    
    
    public Login(){
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        
        //titulo
        rotulo = new JLabel();
        rotulo.setText("LOGIN:"); 
        rotulo.setBounds(370, 20, 200, 25); 
        add(rotulo); 
        rotulo.setFont(new Font("Arial", Font.BOLD, 20));
        
        
        //nome
        nome = new JLabel(); 
        nome.setText("Nome:"); 
        nome.setBounds(50, 90, 50, 40); 
        add(nome); 

        FNome = new JTextField(); 
        FNome.setBounds(100, 90, 300, 40); 
        add(FNome); 
        
        //email
        email = new JLabel();
        email.setText("Email:");
        email.setBounds(50, 135, 50, 40);
        add(email);

        FEmail = new JTextField();
        FEmail.setBounds(100, 135, 300, 40);
        add(FEmail);
        
        //telefone
        telefone = new JLabel();
        telefone.setText("Tel:");
        telefone.setBounds(50, 180, 50, 40);
        add(telefone);

        FTel = new JTextField();
        FTel.setBounds(100, 180, 300, 40);
        add(FTel);
        
        //descrição
        descricao = new JLabel();
        descricao.setText("Desc:");
        descricao.setBounds(50, 225, 50, 180);
        add(descricao);

        FDescricao = new JTextField();
        FDescricao.setBounds(100, 225, 300, 180);
        add(FDescricao);
        
        //Genero
        
        genero = new JLabel();
        genero.setText("Genero:");
        genero.setBounds(550, 90, 100, 40); 
        genero.setFont(new Font("Arial", Font.BOLD, 20));
        add(genero);

        JRadioButton Masculino = new JRadioButton("Masculino");
        Masculino.setBounds(550, 150, 190, 60); 
        Masculino.setFont(new Font("Arial", Font.BOLD, 16));
        add(Masculino);

        JRadioButton Feminino = new JRadioButton("Feminino");
        Feminino.setBounds(550, 200, 190, 60); 
        Feminino.setFont(new Font("Arial", Font.BOLD, 16));
        add(Feminino);

        JRadioButton prefiroNaoDizer = new JRadioButton("Prefiro não dizer");
        prefiroNaoDizer.setBounds(550, 250, 190, 60); 
        prefiroNaoDizer.setFont(new Font("Arial", Font.BOLD, 16));
        add(prefiroNaoDizer);


        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(Masculino);
        genderGroup.add(Feminino);
        genderGroup.add(prefiroNaoDizer);
        
        
        voltar = new JButton();
        voltar.setText("Voltar");
        voltar.setBounds(420, 385, 160, 50);
        voltar.addActionListener(this);
        add(voltar);
        
        enviar = new JButton();
        enviar.setText("Enviar");
        enviar.setBounds(590, 385, 160, 50);
        enviar.addActionListener(this);
        add(enviar);
    
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == voltar) {
            new Menu();
            this.dispose();
        } else if (ae.getSource() == enviar){
            System.out.println("Nome: " + FNome.getText());
            System.out.println("Email: " + FEmail.getText());
            System.out.println("Telefone: " + FTel.getText());
            System.out.println("Descricao: " + FDescricao.getText());
            FNome.setText("");
            FEmail.setText("");
            FTel.setText("");
            FDescricao.setText("");
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
    
}
