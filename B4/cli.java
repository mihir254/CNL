import java.io.*;
import java.util.*;
import java.net.*;

public class cli{
	public static void main(String[] args) throws IOException{
		Socket cs = new Socket("127.0.0.1", 5555);
		Scanner sc = new Scanner(System.in);
		DataInputStream dis = new DataInputStream(cs.getInputStream());
		DataOutputStream dos = new DataOutputStream(cs.getOutputStream());

		while(true)
		{
			System.out.println("Enter input : ");
			String inp = sc.nextLine();
			if (inp.equals("bye")) {
				break;
			}
			dos.writeUTF(inp);
			String result = dis.readUTF();
			System.out.println("The result is:" + result);
		}
	}
}