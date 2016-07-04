package registro;

interface RegistroInterface extends java.rmi.Remote {
    String registrame(miCallback.miCallbackInterface mc) throws java.rmi.RemoteException ;
}
