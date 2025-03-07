import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

/**
 * The Server Class is responsible for:
 *  handling games
 *  handling sets of players
 *  managing scores & highscores
 *
 *  All by sending and recieving messages from the client
 */
public class Server {
    private Set<Player> players = new HashSet<>();

    private int clientID = 1;
    public Server(){
        try {
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("Server started on " + InetAddress.getLocalHost().getHostAddress());

            while(true){
                Socket clientSocket = ss.accept();
                System.out.println("Connection received");

                Player player = new Player(clientSocket);
                players.add(player);



            }

        } catch (IOException e){
            System.out.println("Failed to connect to server");
            e.getMessage();
            System.out.println("===========");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Server();
    }
}