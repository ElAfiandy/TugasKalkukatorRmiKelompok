package rmikalkulatorpart5;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public  class KalRMI extends UnicastRemoteObject implements CalciInterface{
    public KalRMI () throws RemoteException
    {
        double a,b;
    }
    
    public double  add(double a, double  b)throws RemoteException
    {
        return a+b;
    }
    
     public double  sub(double  a, double  b)throws RemoteException
    {
        return a-b;
    }
   
      public double  mul(double  a, double  b)throws RemoteException
    {
        return a*b;
    }
   
       public double  div(double  a, double  b)throws RemoteException
    {      
        return a/b;
    }

   
}

