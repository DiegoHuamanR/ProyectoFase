import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;

public class InterfazUsuario extends JFrame {
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazUsuario frame = new InterfazUsuario();
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
	public InterfazUsuario() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Documents\\Fondos Usuarios\\user-male-3.png"));
		lblFondo.setBounds(23, 0, 419, 428);
		contentPane.add(lblFondo);
		
		JLabel lblNewLabel = new JLabel("USUARIO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(447, 46, 139, 42);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int opcionEligeUsuario = 0;
				List <Usuario> listausuarios = new ArrayList<Usuario> ();
		        Dialogo opcionesUsuario = new Dialogo();
		        Dialogo mensajeVent = new Dialogo();

		        while (opcionEligeUsuario != 6 ) {

						opcionEligeUsuario = opcionesUsuario.obtenerOpcionMenu();

		            if (opcionEligeUsuario == 1) {

		                Usuario tmpPasajero = new Usuario();
		                tmpPasajero.SetIdentificacion(opcionesUsuario.obtenerIdentificacionusuario());
		                tmpPasajero.SetNombre(opcionesUsuario.obtenerNombreusuario());
		                tmpPasajero.SetApellidos(opcionesUsuario.obtenerApellidosusuario());
		                tmpPasajero.SetEmail(opcionesUsuario.obtenerEmailusuario());
		                tmpPasajero.SetCelular(opcionesUsuario.obtenerCelularusuario());
		                tmpPasajero.SetEdad(opcionesUsuario.obtenerEdadusuario());
		                listausuarios.add(tmpPasajero);
		            }

		            if (opcionEligeUsuario == 2) {
		                String identusuaBuscado = opcionesUsuario.obtenerIdentificacionusuario();
		                boolean pasajeroEncontrado = false;

		                Iterator<Usuario> it = listausuarios.iterator();
		                Usuario tmpAnalizando;

		                while ( it.hasNext() ) {          
		                    tmpAnalizando = it.next();              
		                    if (tmpAnalizando.getIdentificacion().equals(identusuaBuscado) ) {
		                        pasajeroEncontrado = true;
		                        String mensaje = tmpAnalizando.getStringusuario();
		                        mensaje = mensaje + "\n\n\n";
		                        mensaje = mensaje + "A continuación introduzca nuevos datos para este usuario";
		                        mensajeVent.mostrarMensaje(mensaje);
		                       // mensajeVent.mostrarMensaje("La identificación no puede ser modificada, indique resto de datos");
		                        tmpAnalizando.SetNombre(opcionesUsuario.obtenerNombreusuario());
		                        tmpAnalizando.SetApellidos(opcionesUsuario.obtenerApellidosusuario());
		                        tmpAnalizando.SetEmail(opcionesUsuario.obtenerEmailusuario());
		                        tmpAnalizando.SetCelular(opcionesUsuario.obtenerCelularusuario());
		                        tmpAnalizando.SetEdad(opcionesUsuario.obtenerEdadusuario());

		                        mensaje = tmpAnalizando.getStringusuario();
		                        mensajeVent.mostrarMensaje(mensaje);

		                    } else { }   

		                } 

		                if (pasajeroEncontrado == false) {
		                    mensajeVent.mostrarMensaje("No se encontró el usuario con esa identificación");
		                }
		            } 

		            if (opcionEligeUsuario == 3) {

		                String listado = "";

		                Iterator<Usuario> it2 = listausuarios.iterator();
		                Usuario tmpAnalizando;

		                while ( it2.hasNext() ) {          
		                    tmpAnalizando = it2.next();            
		                    listado = listado + tmpAnalizando.getStringusuario();
		                    listado = listado + "\n\n\n";
		                }

		                mensajeVent.mostrarMensaje(listado);

		            } 
		           
		            if (opcionEligeUsuario == 4) {
		                String identusuaBuscado = opcionesUsuario.obtenerIdentificacionusuario();
		                boolean usuarioEncontrado = false;

		                Iterator<Usuario> it = listausuarios.iterator();
		                Usuario tmpAnalizando;

		                while ( it.hasNext() && usuarioEncontrado==false ) {  

		                    tmpAnalizando = it.next();               

		                    if (tmpAnalizando.getIdentificacion().equals(identusuaBuscado) ) {
		                    	usuarioEncontrado = true;
		                        String mensaje = tmpAnalizando.getStringusuario();
		                        mensaje = mensaje + "\n\n\n";
		                        mensaje = mensaje + "Se procede al borrado de datos de este usario\n\n";

		                        mensajeVent.mostrarMensaje(mensaje);

		                       
		                        listausuarios.remove(tmpAnalizando);
		                        usuarioEncontrado=true;

		                    } else { }    

		                } 

		                if (usuarioEncontrado == false) {
		                    mensajeVent.mostrarMensaje("No se encontró el usuario con esa identificación");
		                }
		            } 
		         
		            if (opcionEligeUsuario==5) {
		            	Verificador<String> r = new Verificador<String>();
		        		
		        		
		            	String identusuaBuscado = opcionesUsuario.obtenerIdentificacionusuario();
		                boolean pasajeroEncontrado = false;

		                Iterator<Usuario> it = listausuarios.iterator();
		                Usuario tmpAnalizando;

		                while ( it.hasNext() ) {          
		                    tmpAnalizando = it.next();              
		                    if (tmpAnalizando.getIdentificacion().equals(identusuaBuscado) ) {
		                        pasajeroEncontrado = true;
		                        String mensaje = "";
		                        
		                        try {
				        			//Las recetas serán predefinidas
				        			r.insert("1234");
				        			r.insert("[Aspirina] cada 12 horas. 50 soles");
				        			r.insert("1235");
				        			r.insert("[Paracetamol] cada 6 horas.");
				        			r.insert("1236");
				        			r.insert("[Omeprazol] depués de cada almuerzo.");
				        			mensaje = tmpAnalizando.getNA();
			                        
				        			mensajeVent.mostrarMensaje(r.search(opcionesUsuario.obtenerCodigoReceta()));
				        			mensajeVent.mostrarMensaje(mensaje);
				        			
				        			}
				        			catch (Exception x) {
				        				System.out.println(x.getLocalizedMessage());
				        			}
		                    } else { }   

		                } 
		                if (pasajeroEncontrado == false) {
		                    mensajeVent.mostrarMensaje("No se encontró el usuario con esa identificación");
		                }
		                
		            	//--------------------------------------------  

		        }}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

		        
			}
				
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1.setBounds(477, 202, 127, 42);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Documents\\Fondos Usuarios\\35eb7d5bce221d9392feb1e426ba48af.jpg"));
		lblNewLabel_1.setBounds(0, 0, 635, 428);
		contentPane.add(lblNewLabel_1);
	}
}
