package task2;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Subtract extends Remote {
    int subtract(int a, int b) throws RemoteException;
}
    

