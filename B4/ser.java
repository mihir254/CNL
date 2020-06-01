import java.net.*;
import java.util.*;
import java.io.*;

public class ser{
	public static void main(String[] args) throws IOException{
		ServerSocket srs = new ServerSocket(5555);
		Socket sc = srs.accept();
		DataInputStream dis = new DataInputStream(sc.getInputStream());
		DataOutputStream dos = new DataOutputStream(sc.getOutputStream());

		while(true)
		{
			String inp;
			inp = dis.readUTF();
			if (inp.equals("bye")) {
				break;
			}
			System.out.println("Equation recieved");
			int result;
			StringTokenizer stz = new StringTokenizer(inp);

			int oprnd1 = Integer.parseInt(stz.nextToken());
			String operation = stz.nextToken();
			int oprnd2 = Integer.parseInt(stz.nextToken());

			if (operation.equals("+")) 
			{ 
				result = oprnd1 + oprnd2; 
			} 

			else if (operation.equals("-")) 
			{ 
				result = oprnd1 - oprnd2; 
			} 
			else if (operation.equals("*")) 
			{ 
				result = oprnd1 * oprnd2; 
			} 
			else
			{ 
				result = oprnd1 / oprnd2; 
			} 

			String res = Integer.toString(result);
			dos.writeUTF(res);
		}
	}
}