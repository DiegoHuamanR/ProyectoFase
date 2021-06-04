

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PastillasInt extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnsalir;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PastillasInt frame = new PastillasInt();
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
	public PastillasInt() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DIEGO\\Downloads\\pastillas.png"));
		setTitle("Pastillas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Gestion Pastillas");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Bodoni MT", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(322, 21, 192, 29);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(390, 82, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(390, 129, 89, 23);
		contentPane.add(btnModificar);
		
		btnsalir = new JButton("Exit");
		btnsalir.addActionListener(this);
		btnsalir.setBounds(425, 243, 89, 23);
		contentPane.add(btnsalir);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(390, 171, 89, 23);
		contentPane.add(btnEliminar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Downloads\\vitamina.png"));
		lblNewLabel.setBounds(0, 0, 540, 321);
		contentPane.add(lblNewLabel);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			handle_btnNewButton_actionPerformed(e);
		}
		if (e.getSource() == btnsalir) {
			handle_btnsalir_actionPerformed(e);
		}
	}
	protected void handle_btnsalir_actionPerformed(ActionEvent e) {
		VendedorInt vi=new VendedorInt();
		vi.setVisible(true);
		setVisible(false);
	}
	protected void handle_btnNewButton_actionPerformed(ActionEvent e) {
		IngresoPastillas vi=new IngresoPastillas();
		vi.setVisible(true);
		setVisible(false);
	}
}
