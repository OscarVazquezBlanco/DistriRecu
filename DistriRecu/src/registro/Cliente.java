package registro;

import java.rmi.Naming;
import java.rmi.NotBoundException;
import miCallback.miCallback;

public class Cliente {

    public static void main(String[] args) {
        try {
            RegistroInterface reg = (RegistroInterface) Naming.lookup("rmi://l101r1.lab.inf.uva.es:4000/RegistroDelProfe");
            String r = reg.registrame(new miCallback());
            System.out.println(r);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}
