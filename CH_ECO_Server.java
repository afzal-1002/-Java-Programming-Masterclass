import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class CH_ECO_Server {
    public static void main(String[] args) throws IOException {

        try(ServerSocket serverSocket = new ServerSocket(5000)){

            while (true){

                Socket socket = serverSocket.accept();
                System.out.println("Client Connected! ");
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

                String echoString = input.readLine();
                try{
                    Thread.sleep(1500);
                }catch (InterruptedException e){
                    System.out.println("Thread error  " + e.getMessage());
                }
                if(echoString.equals("exit")){
                    break;
                }

                System.out.println("Echo from Server " + echoString);
            }


        }catch(IOException e){
            System.out.println("Server Exception  "+ e.getMessage());
        }

    }


}
