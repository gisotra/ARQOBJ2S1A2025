package aulas.aula5_redes;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;

public class Cliente {
	public static void main(String[] args) throws Exception{
   	 
    	String ip = "10.105.68.14"; //ip do meu computador
    	int porta = 12345; //porta que será utilizada
    	InetAddress endereco = InetAddress.getByName(ip);  //representar um ip local
   	 
    	//do lado do cliente, não precisa criar um server socket
   	 
    	Socket conexao = new Socket(endereco, porta);
   	 
    	System.out.println("Conexao realizada com sucesso: " + conexao);
    	//se eu rodar vai dar erro, porque nao tem um servidor fornecendo uma porta, primeiro tem que executar o servidor
   	 
    	//assim como o cliente tem entrada e saída, o servidor também tem. Os dois vão se conectar
    	ObjectOutputStream output = new ObjectOutputStream(conexao.getOutputStream());
    	ObjectInputStream input = new ObjectInputStream(conexao.getInputStream());
    	output.flush(); //envia a informação
    	/*
    	O input lá do servidor vem do output do cliente
    	*/
    	String mensagem;
   	 
    	mensagem = (String) input.readObject(); //estou esperando uma mensagem do servidor
    	output.flush(); //envia a informação
    	System.out.println("Mensagem recebida: " + mensagem);
   	 
    	mensagem = "HAWK TUAH giovan ";
    	output.writeObject(mensagem);
    	System.out.println("Mensagem enviada: " + mensagem);
   	 
    	input.close();
    	output.close();
    	conexao.close();
   	 
   	 
    
	}
}
