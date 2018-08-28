import java.rmi.*;

	 public interface FileServerIntf extends Remote 
	 {	 	
		String listfiles() throws RemoteException;
	 }

