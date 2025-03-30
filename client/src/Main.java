import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Game...");
        Socket clientSocket;
        try{
            String IPAddress = "";
            clientSocket = new Socket(IPAddress, 1234);

            //send name
            System.out.print("Enter name: ");
            Scanner in = new Scanner(System.in);
            String name = in.nextLine();

            Player newPlayer = new Player(clientSocket, name);
        } catch (IOException e){
            e.getMessage();
        }
    }

    private static void DisplayBoard() {
//        String text = String.format("__|__|__");
//        System.out.println(text);
//               text = String.format("__|__|__");
//        System.out.println(text);
//               text = String.format("  |  |  ");
//        System.out.println(text);

//        System.out.println("___|___|___");
//        System.out.println("___|___|___");
//        System.out.println("   |   |  ");
//
//        System.out.println();
//
//        System.out.println("___|___|___");
//        System.out.println("___|___|_O_");
//        System.out.println("   |   |   ");
//
//        System.out.println();
//
//        System.out.println("___|___|___");
//        System.out.println("___|_X_|_O_");
//        System.out.println("   |   |   ");
//
//        System.out.println();
//
//        System.out.println("_O_|___|___");
//        System.out.println("___|_X_|_O_");
//        System.out.println("   |   |   ");




//        String text = String.format("This is %s underlined.", "\033[4monly this part\033[0m");
//        System.out.println(text);


    }
}
