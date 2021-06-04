import javax.swing.*;
import javax.swing.JOptionPane;
import java.io.*;

public class Factura{

    String dialogoF;

    public Factura() {     }

    public int obtenerFactura() throws IOException {
        dialogoF = "Las pildoras estan siendo entregadas\n";
        dialogoF += "1.  Mostrar factura\n";
        dialogoF += "2.  Salir\n";
        dialogoF += "Escoja Opción:\n";
        return Integer.parseInt(JOptionPane.showInputDialog(dialogoF));
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