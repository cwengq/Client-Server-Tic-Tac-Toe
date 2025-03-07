import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Player {
    private String name;
    private int curScore, totScore;

    private final Socket clientSocket;

    private int clientID;
    private String clientName;

    private DataInputStream in;
    private DataOutputStream out;

    //Object/InputStream

    public Player(Socket clientSocket) {
        curScore = 0;
        totScore = 0;

        this.clientSocket = clientSocket;

        startGame();


    }

    private void startGame(){
        try {
            //get I/O Streams
            in = new DataInputStream(clientSocket.getInputStream());
            out = new DataOutputStream(clientSocket.getOutputStream());
            out.flush();

            //get name
            name = in.readUTF();

            //writeMenu

            while(true){

            }


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