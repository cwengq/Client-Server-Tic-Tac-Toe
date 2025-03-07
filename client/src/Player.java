import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Player {
    private String name;
    private int curScore, totScore;

    private final Socket clientSocket;
    private DataInputStream in;
    private DataOutputStream out;

    private ReadThread readThread;
    //private WriteThread writeThread;

    private int clientID;
    private String clientName;

    //Object/InputStream

    public Player(Socket clientSocket, String name) {
        this.name = name;
        curScore = 0;
        totScore = 0;

        this.clientSocket = clientSocket;
        //this.clientID = clientID;

        startGame();

        readThread = new ReadThread();
        readThread.start();

    }
    
    private void startGame() {
        try {
            //Get i/o streams
            out = new DataOutputStream(clientSocket.getOutputStream());
            out.flush();
            in = new DataInputStream(clientSocket.getInputStream());

            //write name to Server
            out.writeUTF(name);
            out.flush();

            //in.readUTF(menu)

            //sOption

            //case 1: New Game
            // newGame();
            //case 2: LeaderBoard
            // leaderBoard()
            //case 3: Quit

            //read Menu
//            while (in.readUTF() != "Game Over") {
//
//
//            }
//            System.out.println("Game Over");

            while (true) {
                //read Menu
            }

            //write option Selected
        } catch (IOException e){
            e.getMessage();
            e.printStackTrace();
        }
        
        
    }

    //region Read/WriteThread
    private class ReadThread extends Thread{
        @Override
        public void run(){
            try{
                //Get I/O Streams

                //start writeThread

                //Process Messages

            } catch (Exception e){
                System.out.println("Error in ReadThread");
                e.getMessage();
                e.printStackTrace();
            }
        }
    }

    private class WriteThread extends Thread{
        @Override
        public void run(){

        }
    }
    //endregion

    //region Getters & Setters
    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getCurScore() {
        return curScore;
    }

    public void setCurScore(int curScore) {
        this.curScore = curScore;
    }

    public int getTotScore() {
        return totScore;
    }

    public void setTotScore(int totScore) {
        this.totScore = totScore;
    }
    //endregion

}