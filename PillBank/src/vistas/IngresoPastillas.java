package vistas;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class IngresoPastillas extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton_1_1;
	private JRadioButton oPrimero;
	private JButton btnLimpiar;
	private JRadioButton oUltimo;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresoPastillas frame = new IngresoPastillas();
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
	public IngresoPastillas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DIEGO\\Downloads\\pastillas.png"));
		setTitle("Ingreso Pastillas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 442, 263);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(34, 54, 77, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(34, 93, 77, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(34, 135, 77, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(34, 174, 77, 14);
		contentPane.add(lblCantidad);
		
		textField = new JTextField();
		textField.setBounds(132, 51, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(132, 90, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(132, 132, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(132, 171, 86, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel = new JLabel("Ingreso:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 11, 116, 32);
		contentPane.add(lblNewLabel);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(this);
		btnLimpiar.setBounds(303, 126, 89, 23);
		contentPane.add(btnLimpiar);
		
		btnNewButton_1_1 = new JButton("EXIT");
		btnNewButton_1_1.addActionListener(this);
		btnNewButton_1_1.setBounds(303, 165, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		oPrimero = new JRadioButton("Ingresar Primero");
		oPrimero.addActionListener(this);
		oPrimero.setBounds(272, 50, 140, 23);
		contentPane.add(oPrimero);
		
		oUltimo = new JRadioButton("Ingresar");
		oUltimo.addActionListener(this);
		oUltimo.setBounds(272, 89, 67, 23);
		contentPane.add(oUltimo);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(345, 90, 47, 20);
		contentPane.add(textField_5);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == oUltimo) {
			handle_oUltimo_actionPerformed(e);
		}
		if (e.getSource() == btnLimpiar) {
			handle_btnLimpiar_actionPerformed(e);
		}
		if (e.getSource() == oPrimero) {
			handle_oPrimero_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1_1) {
			handle_btnNewButton_1_1_actionPerformed(e);
		}
	}
	protected void handle_btnNewButton_1_1_actionPerformed(ActionEvent e) {
		PastillasInt vi=new PastillasInt();
		vi.setVisible(true);
		setVisible(false);
	}
	protected void handle_oPrimero_actionPerformed(ActionEvent e) {
		
		int codigo=Integer.parseInt(textField.getText());
		String nombre=textField_1.getText();
		String precio=textField_2.getText();
		Integer cantidad=Integer.parseInt(textField_3.getText());;
		if(codigo>0||cantidad>0) {
			List <Pastillas>p1= new List<Pastillas>();
			Pastillas v;
			v=new Pastillas(codigo,nombre,precio,cantidad);
			p1.add(v);
			System.out.println(p1);
			JOptionPane.showMessageDialog(null,"Se ha registrado correctamento","REGISTRO",JOptionPane.INFORMATION_MESSAGE);
			PastillasInt vi=new PastillasInt();
			vi.setVisible(true);
			setVisible(false);
			}
		else {
			JOptionPane.showMessageDialog(null,"UNO DE LOS DATOS ES INCORRECTO","ERROR",JOptionPane.ERROR_MESSAGE);
			}
		
	}
	protected void handle_btnLimpiar_actionPerformed(ActionEvent e) {
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
	}
	protected void handle_oUltimo_actionPerformed(ActionEvent e) {
		int codigo=Integer.parseInt(textField.getText());
		String nombre=textField_1.getText();
		String precio=textField_2.getText();
		Integer cantidad=Integer.parseInt(textField_3.getText());
		Integer pos=Integer.parseInt(textField_5.getText());
		if(codigo>0||cantidad>0) {
			List <Pastillas>p1= new List<Pastillas>();
			Pastillas v;
			v=new Pastillas(codigo,nombre,precio,cantidad);
			p1.add2(pos,v);
			System.out.println(p1);
			JOptionPane.showMessageDialog(null,"Se ha registrado correctamento","REGISTRO",JOptionPane.INFORMATION_MESSAGE);
			PastillasInt vi=new PastillasInt();
			vi.setVisible(true);
			setVisible(false);
			}
		else {
			JOptionPane.showMessageDialog(null,"UNO DE LOS DATOS ES INCORRECTO","ERROR",JOptionPane.ERROR_MESSAGE);
			}
	}
}
