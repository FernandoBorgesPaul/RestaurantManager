import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Facturacion extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldRFC;
	private JTextField textFieldNombre;
	private JTextField textFieldDirec;
	private JTextField textFieldEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Facturacion frame = new Facturacion();
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
	public Facturacion() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRFC = new JLabel("RFC: ");
		lblRFC.setHorizontalAlignment(SwingConstants.CENTER);
		lblRFC.setBounds(37, 19, 151, 29);
		contentPane.add(lblRFC);
		
		textFieldRFC = new JTextField();
		textFieldRFC.setBounds(194, 18, 233, 29);
		contentPane.add(textFieldRFC);
		textFieldRFC.setColumns(10);
		
		JLabel lblNombreCompleto = new JLabel("Nombre Completo:");
		lblNombreCompleto.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreCompleto.setBounds(37, 59, 151, 29);
		contentPane.add(lblNombreCompleto);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(194, 59, 233, 29);
		contentPane.add(textFieldNombre);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDireccion.setBounds(37, 100, 151, 29);
		contentPane.add(lblDireccion);
		
		textFieldDirec = new JTextField();
		textFieldDirec.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldDirec.setColumns(10);
		textFieldDirec.setBounds(194, 100, 233, 73);
		contentPane.add(textFieldDirec);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(37, 185, 151, 29);
		contentPane.add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(194, 185, 233, 29);
		contentPane.add(textFieldEmail);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Elige tipo...", "Gastos Generales", "Gastos Medicos", "Por Definir"}));
		comboBox.setBounds(194, 226, 233, 27);
		contentPane.add(comboBox);
		
		JLabel lblRazon = new JLabel("Uso de CDFI:");
		lblRazon.setHorizontalAlignment(SwingConstants.CENTER);
		lblRazon.setBounds(37, 226, 151, 29);
		contentPane.add(lblRazon);
		
		JButton btnGenerarFactura = new JButton("Generar Factura");
		btnGenerarFactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Factura \n" + 
				"Nombre: " + textFieldNombre.getText()+ "\n" +
				"RFC: " + textFieldRFC.getText()+ "\n" +
				"Direccion: " + textFieldDirec.getText() + "\n" + 
				"Uso de CFDI: " + comboBox.getSelectedItem());
		
			}
		});
		btnGenerarFactura.setBounds(159, 305, 131, 34);
		contentPane.add(btnGenerarFactura);
	}
}
