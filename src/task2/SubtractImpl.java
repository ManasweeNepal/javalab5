package task2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SubtractImpl extends UnicastRemoteObject implements Subtract {

    protected SubtractImpl() throws RemoteException {
        super();
    }

    public int subtract(int a, int b) throws RemoteException {
        return a - b;
    }
}

