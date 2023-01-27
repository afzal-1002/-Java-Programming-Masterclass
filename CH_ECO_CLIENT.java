import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class CH_ECO_CLIENT {

    //localhost = 127.0.0.1
    public static void main(String args[]){
        try(Socket socket = new Socket("localhost", 5000)){
            BufferedReader echos = new BufferedReader( new InputStreamReader( socket.getInputStream()));
            PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);
            String  echoString;
            String response = "";
            do{
                System.out.println("Enter string to be echoed: ");
                echoString = scanner.nextLine();
                stringToEcho.println(response);
                if(!echoString.equals("exit")){
                    response = echos.readLine();
                    System.out.println(response);
                }
            }while (!echoString.equals("exit"));
        }catch (IOException e){
            System.out.println("Client side socket have some error  " + e.getMessage());
        }
    }


}
