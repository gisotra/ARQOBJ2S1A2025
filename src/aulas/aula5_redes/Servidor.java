package aulas.aula5_redes;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws Exception{
    	/*
    	Para servir conexões, é necessário especificar o ip (a porta) em que eu
    	estou para que os clientes possam ter acessos ao servidor.
   	 
    	O ip utilizado será o ip da nossa máquina
   	 
    	Segundo a Wikipedia:
    	"Um Endereço de Protocolo da Internet (Endereço IP), do inglês Internet
    	Protocol address (IP address), é um rótulo numérico atribuído a cada
    	dispositivo (computador, impressora, smartphone etc.) conectado a uma
    	rede de computadores que utiliza o Protocolo de Internet para comunicação.
    	[1] Um endereço IP serve a duas funções principais: identificação de
    	interface de hospedeiro ou de rede e endereçamento de localização."
   	 
   	 
    	*/
    	String ip = "10.105.68.15"; //ip do meu computador (uma porta de conexão)
    	int porta = 12345; //porta que será utilizada 
    	InetAddress endereco = InetAddress.getByName(ip); //ip do meu computador
   	 
    	ServerSocket servidor = new ServerSocket(porta, 2, endereco); //criar o servidor
                                            	// porta | backlog | endereco  
    	System.out.println("Servidor inicializado: "+ servidor);
   	 
    	Socket conexao;
    	System.out.println("Esperando por Conexao");
        
    	conexao = servidor.accept(); //criar uma conexao
    	
        System.out.println("Conexao realizada com sucesso: " + conexao);
   	 
    	//criação de objetos de entrada e saída de fluxo
    	//tem que ser primeiro o de saída e DEPOIS o de entrada
    	ObjectOutputStream output = new ObjectOutputStream( conexao.getOutputStream());
    	ObjectInputStream input = new ObjectInputStream( conexao.getInputStream());
    	output.flush(); //envia a informação
   	 
    	String mensagem;
   	 
    	mensagem = "Ola cliente :3";
    	output.writeObject(mensagem);
    	output.flush(); //envia a informação
    	System.out.println("Mensagem enviada: " + mensagem);
   	 
    	mensagem = (String) input.readObject(); //estou lendo a mensagem que meu fluxo de entrada vai receber
    
    	System.out.println("Mensagem Recebida: " + mensagem);

    	input.close();
    	output.close();
    	conexao.close();
    
	}
       	 
       	 
    
}

