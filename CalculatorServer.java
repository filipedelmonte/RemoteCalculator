import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer{

	public static void main(String args[]){

		try{
			System.setProperty("java.rmi.server.hotname", "localhost");
			CalculatorInterfaceImplement obj = new CalculatorInterfaceImplement();

            // Bind this object instance to the name "CalculatorServer"
            Registry registry = LocateRegistry.getRegistry("localhost");
            registry.rebind("CalculatorServer", obj);

            System.out.println("CalculatorServer bound in registry");
		}catch(RemoteException re){
			System.out.println("Calculator Server error:" + re.getMessage());
		}
	}
}
