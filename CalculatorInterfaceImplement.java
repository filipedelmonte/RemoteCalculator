import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorInterfaceImplement extends UnicastRemoteObject implements CalculatorInterface {

	public CalculatorInterfaceImplement() throws RemoteException {
		super();
	}

	public float add(float op1, float op2) throws RemoteException{
		return op1 + op2;
	}

	public float sub(float op1, float op2) throws RemoteException{
		return op1 - op2;
	}

	public float times(float op1, float op2) throws RemoteException{
		return op1 * op2;
	}

	public float div(float op1, float op2) throws RemoteException{
		return op1 / op2;
	}
}
