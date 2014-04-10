import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorInterface extends Remote{
    float add(float op1, float op2) throws RemoteException;
    float sub(float op1, float op2) throws RemoteException;
    float times(float op1, float op2) throws RemoteException;
    float div(float op1, float op2) throws RemoteException;
}
