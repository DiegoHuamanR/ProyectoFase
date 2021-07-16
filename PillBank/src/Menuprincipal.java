import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Menuprincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menuprincipal frame = new Menuprincipal();
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
	public Menuprincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DIEGO\\Downloads\\Src lIbni\\pastillas.png"));
		setTitle("PILLBANK");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TITULO = new JLabel("BIENVENIDO A PILLBANK");
		TITULO.setHorizontalAlignment(SwingConstants.CENTER);
		TITULO.setFont(new Font("Times New Roman", Font.BOLD, 30));
		TITULO.setForeground(Color.BLACK);
		TITULO.setBounds(91, 0, 410, 67);
		contentPane.add(TITULO);
		
		JButton VENDEDOR = new JButton("VENDEDOR");
		VENDEDOR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VendedorInt h = new VendedorInt();
				h.setVisible(true);
				setVisible(false);
				
			}
		});
		VENDEDOR.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		VENDEDOR.setBounds(91, 219, 153, 48);
		contentPane.add(VENDEDOR);
		
		JButton USUARIO = new JButton("USUARIO");
		USUARIO.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		USUARIO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazUsuario G = new InterfazUsuario();
				G.setVisible(true);
				setVisible(false);
				
			}
		});
		USUARIO.setBounds(341, 219, 173, 48);
		contentPane.add(USUARIO);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Documents\\Fondos Usuarios\\blur-hospital_1203-7972.jpg"));
		Fondo.setBounds(0, 0, 583, 331);
		contentPane.add(Fondo);
	}
}
