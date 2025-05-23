package aulas.aula5_redes.jogoDaVelha;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorJogoDaVelha {
    public static void main(String[] args) throws Exception {
        
        ServerSocket servidor;
        servidor = new ServerSocket( Config.getPorta(), 2, InetAddress.getByName(Config.getIp() ) );
        System.out.println("Servidor JogoDaVelha Inicializado ( " + servidor + " ).\n");
        
        
        Socket jogadorX;        
        System.out.println( "Esperando por Conexão (Jogador X)." );
        jogadorX =  servidor.accept();
        System.out.println( "Conexão Recebida: " + jogadorX.toString() + ":" + jogadorX.getPort() + "\n" );
        
        ObjectOutputStream entradaJogadorX;
        entradaJogadorX = new ObjectOutputStream( jogadorX.getOutputStream() );
        entradaJogadorX.flush();        
        entradaJogadorX.writeObject("X;true");
        
        ObjectInputStream saidaJogadorX;
        saidaJogadorX = new ObjectInputStream( jogadorX.getInputStream() );
        
                        
    }
}
