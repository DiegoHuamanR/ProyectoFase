
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;

public class VendedorInt extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnPastillas;
	private JButton btnIntRegistro;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VendedorInt frame = new VendedorInt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VendedorInt() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DIEGO\\Downloads\\pastillas.png"));
		setTitle("Interfaz Vendedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO");
		lblNewLabel.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 30));
		lblNewLabel.setBounds(411, 22, 166, 61);
		contentPane.add(lblNewLabel);
		
		btnIntRegistro = new JButton("Registrarse");
		btnIntRegistro.addActionListener(this);
		btnIntRegistro.setBounds(444, 155, 89, 23);
		contentPane.add(btnIntRegistro);
		
		btnPastillas = new JButton("Pastillas");
		btnPastillas.addActionListener(this);
		btnPastillas.setBounds(444, 199, 89, 23);
		contentPane.add(btnPastillas);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(this);
		btnExit.setBounds(444, 251, 89, 23);
		contentPane.add(btnExit);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Downloads\\doctor.png"));
		lblNewLabel_1.setBounds(0, 0, 587, 421);
		contentPane.add(lblNewLabel_1);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnExit) {
			handle_btnExit_actionPerformed(e);
		}
		if (e.getSource() == btnIntRegistro) {
			handle_btnIntRegistro_actionPerformed(e);
		}
		if (e.getSource() == btnPastillas) {
			handle_btnNewButton_1_actionPerformed(e);
		}
	}
	protected void handle_btnNewButton_1_actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"Bienvenido, usted ya puede gestionar las pastillas","REGISTRO",JOptionPane.INFORMATION_MESSAGE);
		try {
			int opcionep = 0;
			List <Pastillas> listapastillas = new ArrayList<Pastillas> ();
	        InterfazPastillas opcionespastillas = new InterfazPastillas();
	        InterfazPastillas mensajeVent = new InterfazPastillas();

	        while (opcionep != 5 ) {

	        	opcionep = opcionespastillas.obtenerOpcionMenu();
				

	            if (opcionep == 1) {

	                Pastillas tmpPasajero = new Pastillas();
	                tmpPasajero.setCodigo(opcionespastillas.obtenercodigopastilla());
	                tmpPasajero.setNombre(opcionespastillas.obtenernombredpastilla());
	                tmpPasajero.setPrecio(opcionespastillas.obtenerpreciopastilla());
	                tmpPasajero.setCantidad(opcionespastillas.obtenercantidadpastilla());
	                listapastillas.add(tmpPasajero);
	            }

	            if (opcionep == 2) {
	                int codbuscado= opcionespastillas.obtenercodigopastilla();
	                boolean pastillae = false;

	                Iterator<Pastillas> it = listapastillas.iterator();
	                Pastillas tmpAnalizando;

	                while ( it.hasNext() ) {          

	                    tmpAnalizando = it.next();              

	                    if (tmpAnalizando.getCodigo().equals(codbuscado) ) {
	                    	pastillae = true;
	                        String mensaje = tmpAnalizando.toString();
	                        mensaje = mensaje + "\n\n\n";
	                        mensaje = mensaje + "A continuación introduzca nuevos datos para este usuario";

	                        mensajeVent.mostrarMensaje(mensaje);

	                        mensajeVent.mostrarMensaje("La identificación no puede ser modificada, indique resto de datos");
	                        tmpAnalizando.setNombre(opcionespastillas.obtenernombredpastilla());
	                        tmpAnalizando.setPrecio(opcionespastillas.obtenerpreciopastilla());
	                        tmpAnalizando.setCantidad(opcionespastillas.obtenercantidadpastilla());

	                        mensaje = tmpAnalizando.toString();
	                        mensajeVent.mostrarMensaje(mensaje);

	                    } else { }   

	                } 

	                if (pastillae == false) {
	                    mensajeVent.mostrarMensaje("No se encontró el usuario con esa identificación");
	                }
	            } 

	            if (opcionep == 3) {

	                String listado = "";

	                Iterator<Pastillas> it2 = listapastillas.iterator();
	                Pastillas tmpAnalizando;

	                while ( it2.hasNext() ) {          
	                    tmpAnalizando = it2.next();            
	                    listado = listado + tmpAnalizando.toString();
	                    listado = listado + "\n\n";
	                }

	                mensajeVent.mostrarMensaje(listado);

	            } 
	           
	            if (opcionep == 4) {
	                int codbuscado = opcionespastillas.obtenercodigopastilla();
	                boolean pastillaEncontrado = false;

	                Iterator<Pastillas> it = listapastillas.iterator();
	                Pastillas tmpAnalizando;

	                while ( it.hasNext() && pastillaEncontrado==false ) {  

	                    tmpAnalizando = it.next();               

	                    if (tmpAnalizando.getCodigo().equals(codbuscado) ) {
	                    	pastillaEncontrado = true;
	                        String mensaje = tmpAnalizando.toString();
	                        mensaje = mensaje + "\n\n\n";
	                        mensaje = mensaje + "Se procede al borrado de datos de este usario\n\n";

	                        mensajeVent.mostrarMensaje(mensaje);

	                       
	                        listapastillas.remove(tmpAnalizando);
	                        pastillaEncontrado=true;

	                    } else { }    

	                } 

	                if (pastillaEncontrado == false) {
	                    mensajeVent.mostrarMensaje("No se encontró el usuario con esa identificación");
	                }
	            } 

	        }
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
	protected void handle_btnIntRegistro_actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"Bienvenido, el codigo de nuestro hospital para poder acceder a las opciones de las pastillas es 1568","REGISTRO",JOptionPane.INFORMATION_MESSAGE);
		FrmPersonas p=new FrmPersonas();
		p.setVisible(true);
		this.setVisible(false);
	}
	protected void handle_btnExit_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
}
