package rmikalkulatorpart5;


import java.rmi.Remote;
import java.rmi.RemoteException;

interface CalciInterface extends Remote
{
	 public double add(double a,double b) throws RemoteException;
	 public double sub(double a,double b) throws RemoteException;
         public double mul(double a,double b) throws RemoteException;
         public double div(double a,double b) throws RemoteException;
}
