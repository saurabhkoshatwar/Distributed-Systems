import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
public class FileServerImpl extends UnicastRemoteObject implements FileServerIntf  {
	public FileServerImpl() throws RemoteException {
	} 

	public String listfiles() throws RemoteException
	 {  
			File folder = new File("/home/comp17");
			File[] listOfFiles = folder.listFiles();
			String filel = "";
			for (int i = 0; i < listOfFiles.length; i++) {
			  if (listOfFiles[i].isFile()) {
			    //System.out.println("File " + listOfFiles[i].getName());
				filel+= "\nFile " + listOfFiles[i].getName();
			  } else if (listOfFiles[i].isDirectory()) {
			    //System.out.println("Directory " + listOfFiles[i].getName());
				filel += "Directory " + listOfFiles[i].getName();
			  }
			}
		return filel;
	 }
}
