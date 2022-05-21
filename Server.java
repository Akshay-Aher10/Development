import java.lang.*;
import java.net.*;  //server class sathi
import java.io.*;   // bufferreader sathi

class Server
{
	public static void main(String a[]) throws java.lang.Exception
	{
		System.out.println("Server Application is runing");	
		String s1,s2;
		
		ServerSocket ss = new ServerSocket(1100);
		Socket s=ss.accept();
		
		System.out.println("connection successful");	
		BufferedReader brk = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintStream ps = new PrintStream(s.getOutputStream());
		while((s1= br.readLine())!=null)
		{
			System.out.println("Client says:"+s1);
			System.out.println("Enter msg for client:");
			s2=brk.readLine();
			ps.println(s2);
		}
	
		
	}
	
	
}