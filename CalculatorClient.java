import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {

    public static void main(String[] args) {

        CalculatorInterface obj = null;
		float result = 0;
        try {

	    Registry registry = LocateRegistry.getRegistry("localhost");

	    // Lookup object reference associated to the name "CalculatorServer"
            obj = (CalculatorInterface)registry.lookup("CalculatorServer");

            switch( args[0] ){
            	case "add":
            	result = obj.add( Float.parseFloat(args[1]), Float.parseFloat(args[2]) );
            	System.out.println(result);
            	break;
            	case "sub":
            	result = obj.sub( Float.parseFloat(args[1]), Float.parseFloat(args[2]) );
            	System.out.println(result);
            	break;
            	case "times":
            	result = obj.times( Float.parseFloat(args[1]), Float.parseFloat(args[2]) );
            	System.out.println(result);
            	break;
            	case "div":
            	result = obj.div( Float.parseFloat(args[1]), Float.parseFloat(args[2]) );
            	System.out.println(result);
            	break;
            }

        } catch (Exception e) {
            System.out.println("CalculatorClient exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
