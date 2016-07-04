package saludos;

import java.util.*;
import java.io.*;
import java.net.*;

public class Cliente {
    final private int PUERTO = 2000;

    public static void main(String[] args) throws IOException {
        Socket sock = new Socket("l101r1.lab.inf.uva.es", 3000); /* creación del socket */
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
            /** Creación de los canales de serialización de objetos */
            ois = new ObjectInputStream(sock.getInputStream());
            oos = new ObjectOutputStream(sock.getOutputStream());

            /* Escenario 1 */
            oos.writeObject(new SaludoBean());
            SaludoBean sb = new SaludoBean();
            sb = (SaludoBean) ois.readObject();
            System.out.println("ID: "+sb.getID());
            //System.out.println((SaludoBean) ois.readObject());

            /*** aquí se supone que tiene que llegar otro cliente e insertar
            *    un mensaje en la cola */

            /* FIN del escenario 1 */
        } catch (IOException e) {
            System.err.println("Cliente: Error de apertura o E/S sobre objetos: "+e);
        } catch (Exception e) {
            System.err.println("Cliente: Excepción. Cerrando Sockets: "+e);
        } finally {
            ois.close();
            oos.close();
            sock.close();
        }
    }
}
