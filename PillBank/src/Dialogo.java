import javax.swing.*;
import javax.swing.JOptionPane;
import java.io.*;

public class Dialogo {

    String dialogo;

    public Dialogo() {     }

    public int obtenerOpcionMenu() throws IOException {
        dialogo = "MENU DE PROGRAMA PILLBANK\n";
        dialogo += "1.  Insertar usuario\n";
        dialogo += "2.  Modificar usuario\n";
        dialogo += "3.  Listar los usuarios\n";
        dialogo += "4.  Eliminar usuario\n";
        dialogo += "5.  Salir\n";
        dialogo += "Escoja Opción:\n";
        return Integer.parseInt(JOptionPane.showInputDialog(dialogo));
    }

    public String obtenerIdentificacionPasajero() throws IOException {
        dialogo = "Introduzca Identificacion de usuario\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public String obtenerNombrePasajero() throws IOException {
        dialogo = "Introduzca Nombre del usuario\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public String obtenerApellidosPasajero() throws IOException {
        dialogo = "Introduzca Apellidos del usuario\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public String obtenerEmailPasajero() throws IOException {
        dialogo = "Introduzca email del usuario\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public String obtenerCelularPasajero() throws IOException {
        dialogo = "Introduzca Celular del usuario\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public int obtenerEdadPasajero() throws IOException {
        dialogo = "Introduzca Edad del usuario\n";
        return Integer.parseInt(JOptionPane.showInputDialog(dialogo));
    }
   
    public void mostrarMensaje (String mensaje) {
        JFrame frame = new JFrame("Mensaje");
        JOptionPane.showMessageDialog(frame, mensaje);
    }
   
    public void cerrarPrograma () {
        JFrame frame = new JFrame("Final del programa");
        JOptionPane.showMessageDialog(frame, "Gracias por usar este programa. Fin");
        System.exit(0);
    }
}