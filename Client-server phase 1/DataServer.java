import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DataServer {
	private static final int PORT = 9090;
	

	public static void main(String[] args) throws IOException {
		ServerSocket listener = new ServerSocket(PORT);
		
		System.out.println("[SERVER] waiting for client connection...");
		Socket client =listener.accept();
		System.out.println("[SERVER] Connected to client! ");
		
		PrintWriter out = new PrintWriter (client.getOutputStream(), true);
		out.println( (new Date()).toString() );
		
		System.out.println("[SERVER] Sent data. Closing.");
		client.close();
		listener.close();
		
		
		
    }

}