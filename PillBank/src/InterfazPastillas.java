
import javax.swing.*;
import javax.swing.JOptionPane;
import java.io.*;

public class InterfazPastillas {
	String pastilla;

    public InterfazPastillas() {     }

    public int obtenerOpcionMenu() throws IOException {
    	pastilla = "MENU DE PASTILLASK\n";
    	pastilla += "1.  Insertar Pastilla\n";
        pastilla += "2.  Modificar Pastilla\n";
        pastilla += "3.  Listar las Pastilla\n";
        pastilla += "4.  Eliminar Pastilla\n";
        pastilla += "5.  Salir\n";
        pastilla += "Escoja Opción:\n";
        return Integer.parseInt(JOptionPane.showInputDialog(pastilla));
    }

    public int obtenercodigopastilla() throws IOException {
    	pastilla = "Introduzca el Codigo de la Pastilla\n";
    	return Integer.parseInt(JOptionPane.showInputDialog(pastilla));
    }

    public String obtenernombredpastilla() throws IOException {
    	pastilla = "Introduzca el Nombre de la Pastilla\n";
        return JOptionPane.showInputDialog(pastilla);
    }

    public double obtenerpreciopastilla() throws IOException {
    	pastilla = "Introduzca Precio de la Pastilla\n";
    	return Double.parseDouble(JOptionPane.showInputDialog(pastilla));
    }
    
    public int obtenercantidadpastilla() throws IOException {
    	pastilla = "Introduzca Cantidad de la Pastilla\n";
        return Integer.parseInt(JOptionPane.showInputDialog(pastilla));
    }
   
    public void mostrarMensaje (String mensaje) {
        JFrame frame = new JFrame("Mensaje");
        JOptionPane.showMessageDialog(frame, mensaje);
    }
   
    public void cerrar () {
        JFrame frame = new JFrame("Final del programa");
        JOptionPane.showMessageDialog(frame, "Gracias por usar este programa. Fin");
        System.exit(0);
    }
}
