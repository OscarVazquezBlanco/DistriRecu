package miCallback;

public class miCallback extends java.rmi.server.UnicastRemoteObject implements miCallbackInterface {
    public String hola() throws java.rmi.RemoteException {
        return "l101a2.lab.inf.uva.es - NOMBRE (RMI)";
    }
    public miCallback() throws Exception{
        
    }
}
