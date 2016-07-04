package saludos;

import java.io.Serializable;
import java.net.Socket;

public class SaludoBean implements Serializable {
    public int identificador;
    public String miNombre;
    static final long serialVersionUID = 100L;
    
   public SaludoBean() {
       miNombre = "l101a2.lab.inf.uva.es - NOMBRE";
   }
   public int getID() {return identificador;}
   public String getNombre() {return miNombre;}
   public String toString() {
       return "Nombre: " + miNombre;
    }
}