package rmikalkulatorpart5;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
public class KalServer{
public static void main(String []args) throws RemoteException,NotBoundException
{
    
        Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
        r.rebind("KalkulatorRmi",new KalRMI());
        System.out.println("Server sedang berjalan");
   
    }
}

