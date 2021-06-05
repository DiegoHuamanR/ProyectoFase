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
        dialogo += "5.  Visualizar Factora\n";
        dialogo += "6.  Salir\\n";
        dialogo += "Escoja Opción:\n";
        return Integer.parseInt(JOptionPane.showInputDialog(dialogo));
    }
    public String obtenerIdentificacionusuario() throws IOException {
        dialogo = "Introduzca Identificacion de usuario\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public String obtenerNombreusuario() throws IOException {
        dialogo = "Introduzca Nombre del usuario\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public String obtenerApellidosusuario() throws IOException {
        dialogo = "Introduzca Apellidos del usuario\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public String obtenerEmailusuario() throws IOException {
        dialogo = "Introduzca email del usuario\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public String obtenerCelularusuario() throws IOException {
        dialogo = "Introduzca Celular del usuario\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public int obtenerEdadusuario() throws IOException {
        dialogo = "Introduzca Edad del usuario\n";
        return Integer.parseInt(JOptionPane.showInputDialog(dialogo));
    }
   
    public void mostrarMensaje (String mensaje) {
        JFrame frame = new JFrame("Mensaje");
        JOptionPane.showMessageDialog(frame, mensaje);
    }
    
    public String obtenerCodigoReceta() throws IOException {
        dialogo = "Introducir codigo de receta\n";
        return JOptionPane.showInputDialog(dialogo);
    }
   
    public void cerrarPrograma () {
        JFrame frame = new JFrame("Final del programa");
        JOptionPane.showMessageDialog(frame, "Gracias por usar este programa. Fin");
        System.exit(0);
    }
}