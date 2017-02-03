package boletin18;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Buzon {

    ArrayList<Correo> mail = new ArrayList<Correo>();

    public void cargarArray() {
        Correo correo1 = new Correo("Primero", true);
        Correo correo2 = new Correo("Segundo", false);

        mail.add(correo1);
        mail.add(correo2);
    }

    /**
     * creacion el metodo numeroDeCorreos que calcula cuantos correos hay en el
     * buzon de correos. Se declara la variable numero de tipo entero y se le
     * aplica la propiedad size que indica el tamaño. Retorna el numero de mails
     * que tiene el buzon
     *
     * @return
     */
    public int numeroDeCorreos() {
        int numero = mail.size();
        return numero;
    }

    /**
     * creo un metodo engadir que es void y recibe un parametro de tipo correo c
     * que permite saber si quedan correos por leer
     *
     * @param c
     */
    public void engadir(Correo c) {
        mail.add(c);
    }

    public boolean porLer() {
        for (int i = 0; i < mail.size(); i++) {
            if (mail.get(i).getCorreoleido() == false) {
                return false;
            }
        }
        return true;
    }

    public String amosaPrimerNoLeido() {
        String mensaje = "mensajes leidos";

        for (int i = 0; i < mail.size(); i++) {
            if (mail.get(i).getCorreoleido() == false) {
                return mail.get(i).getContenidomensaje();
            }

        }
        return mensaje;

    }
    public String amosa(int k){
        return mail.get(k).getContenidomensaje();
        
    }
    public void elimina (int k){
        mail.remove(k);
       
    }
    

}
