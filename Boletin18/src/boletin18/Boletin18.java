package boletin18;

import javax.swing.JOptionPane;

public class Boletin18 {

    public static void main(String[] args) {
        Buzon buz = new Buzon();

        int respuesta;
        buz.cargarArray();

        do {
            respuesta = Integer.parseInt(JOptionPane.showInputDialog("Menu opciones :"));
            switch (respuesta) {
                case 1:
                    System.out.println("numero de mails totales" + buz.numeroDeCorreos());
                    break;
                case 2:
                    buz.engadir(new mail.add("nuevo mail");
                    break;
                case 3:
                    if (buz.porLer() == false) {
                        System.out.println("Tienes mails sin leer");
                    } else {
                        System.out.println("Todos los mails estan leidos");
                    }
                    break;
                case 4:
                    System.out.println(buz.amosaPrimerNoLeido());
                    break;
                case 5:
                    buz.amosa(1);
                    break;
                case 6:
                    buz.elimina(2);
                    break;
                case 7:
                    System.out.println("Salir");
            }
        } while (respuesta != 7);
        System.exit(0);

    }
}
