import java.net.*; 
import java.rmi.*; 
public class AddServer { 
	public static void main(String args[]) {
		try {
		AddServerImpl addServerImpl = new FileServerImpl();
		//System.setProperty("java.rmi.server.hostname","10.11.3.17"); 
		Naming.rebind("AddServer", addServerImpl); 
		} 
		
		catch(Exception e) 
		{ 
		System.out.println("Exception: " + e); 
		}
	}
}


