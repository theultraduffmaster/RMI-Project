package ie.gmit.sw;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import ie.gmit.RMI.StringService;
import ie.gmit.RMI.StringServiceImpl;
//Registry class with rebinding for server
public class Servant{
	
		public static void main(String[] args) throws Exception{
			
			StringService stringservice = new StringServiceImpl();
			
			LocateRegistry.createRegistry(1099);

			Naming.rebind("StringService", stringservice);
			System.out.println("String Service is ready to go");
		}
	
}