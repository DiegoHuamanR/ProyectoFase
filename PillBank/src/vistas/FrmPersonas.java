package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class FrmPersonas extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textxtNombre;
	private JLabel lblApellido;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textApellido;
	private JTextField textCodigo;
	private JTextField textdni;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPersonas frame = new FrmPersonas();
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
	public FrmPersonas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DIEGO\\Downloads\\pastillas.png"));
		setBackground(Color.DARK_GRAY);
		setTitle("Registro de Vendedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 276);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(44, 31, 77, 14);
		contentPane.add(lblNewLabel);
		
		textxtNombre = new JTextField();
		textxtNombre.setBounds(149, 28, 222, 20);
		contentPane.add(textxtNombre);
		textxtNombre.setColumns(10);
		
		lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(44, 75, 77, 14);
		contentPane.add(lblApellido);
		
		lblNewLabel_2 = new JLabel("Codigo:");
		lblNewLabel_2.setBounds(44, 130, 77, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("DNI:");
		lblNewLabel_3.setBounds(44, 188, 77, 14);
		contentPane.add(lblNewLabel_3);
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setBounds(149, 72, 222, 20);
		contentPane.add(textApellido);
		
		textCodigo = new JTextField();
		textCodigo.setColumns(10);
		textCodigo.setBounds(149, 127, 222, 20);
		contentPane.add(textCodigo);
		
		textdni = new JTextField();
		textdni.setColumns(10);
		textdni.setBounds(149, 185, 222, 20);
		contentPane.add(textdni);
		
		JButton btnGrabar = new JButton("Registrarse");
		btnGrabar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom=textxtNombre.getText();
				String ape=textApellido.getText();
				int cod=Integer.parseInt(textCodigo.getText());
				int dni=Integer.parseInt(textdni.getText());
				if(cod==1568) {
					ArrayList <Object>vendedores= new ArrayList<Object>(50);
					Vendedor v;
					v=new Vendedor(nom,ape,cod,dni);
					vendedores.add(v);
					for(int i = 0;i < vendedores.size();i++){
					    System.out.println(vendedores.get(i));      
					}
					JOptionPane.showMessageDialog(null,"Se ha registrado correctamento","REGISTRO",JOptionPane.INFORMATION_MESSAGE);
					VendedorInt vi=new VendedorInt();
					vi.setVisible(true);
					setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null,"UNO DE LOS DATOS ES INCORRECTO","ERROR",JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		btnGrabar.setBounds(439, 92, 89, 23);
		contentPane.add(btnGrabar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(439, 164, 89, 23);
		contentPane.add(btnCerrar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			handle_btnCerrar_actionPerformed(e);
		}
	}
	protected void handle_btnCerrar_actionPerformed(ActionEvent e) {
		VendedorInt vi=new VendedorInt();
		vi.setVisible(true);
		setVisible(false);
	}
}