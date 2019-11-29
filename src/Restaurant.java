import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Restaurant extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel     contentPane;
	private JTextField textFieldFiletePes;
	private JTextField textFieldHamburguesa;
	private JTextField textFieldFiletePollo;
	private JTextField textFieldCamarones;
	private JTextField textFieldPapas;
	private JTextField textFieldGuacamole;
	private JTextField textFieldRefrescos;
	private JTextField textFieldCerveza;
	private JTextField textFieldJamaica;
	private JTextField textFieldAgua;
	private JTextField textFieldHorchata;
	private JTextField textFieldAguaMin;
	private JTextField textFieldCostoPlati;
	private JTextField textFieldCostoBebi;
	private JTextField textFieldCostoTotal;
	private JTextField textFieldImpuesto;
	private JTextField textFieldSubTotal;
	private JTextField textFieldTotal;
	private JTextArea textFieldTotalBill;

	/**
	 * Launch the application.
	 * 
	 * @throws UnsupportedLookAndFeelException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, UnsupportedLookAndFeelException {

		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant frame = new Restaurant();
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
	public Restaurant() {
		setTitle("MI RESTAURANTE");
		setFont(new Font("Courier New", Font.BOLD, 15));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1390, 800);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 160, 122));
		contentPane.setBackground(new Color(250, 128, 114));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setForeground(Color.DARK_GRAY);
		panel.setBorder(new LineBorder(new Color(47, 79, 79), 6, true));
		panel.setBounds(51, 39, 1153, 74);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel restaurantLabel = new JLabel("MI RESTAURANTE");
		restaurantLabel.setHorizontalAlignment(SwingConstants.CENTER);
		restaurantLabel.setFont(new Font("Impact", Font.BOLD, 56));
		restaurantLabel.setBounds(89, 6, 1043, 62);
		panel.add(restaurantLabel);

		JPanel mealsPanel = new JPanel();
		mealsPanel.setBorder(new LineBorder(new Color(0, 128, 128), 8, true));
		mealsPanel.setBounds(51, 139, 349, 329);
		contentPane.add(mealsPanel);
		mealsPanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("PLATILLOS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel.setBounds(112, 17, 111, 36);
		mealsPanel.add(lblNewLabel);

		JLabel lblFileteDePescado = new JLabel("Filete de Pescado");
		lblFileteDePescado.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblFileteDePescado.setBounds(26, 65, 197, 30);
		mealsPanel.add(lblFileteDePescado);

		JLabel lblHamburguesa = new JLabel("Hamburguesa");
		lblHamburguesa.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblHamburguesa.setBounds(26, 107, 197, 30);
		mealsPanel.add(lblHamburguesa);

		JLabel lblFilleteDePollo = new JLabel("Fillete de Pollo al gusto");
		lblFilleteDePollo.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblFilleteDePollo.setBounds(26, 149, 197, 30);
		mealsPanel.add(lblFilleteDePollo);

		JLabel lblCamaronesAlGusto = new JLabel("Camarones al gusto");
		lblCamaronesAlGusto.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblCamaronesAlGusto.setBounds(26, 191, 197, 30);
		mealsPanel.add(lblCamaronesAlGusto);

		JLabel lblPapasALa = new JLabel("Papas a la Francesa");
		lblPapasALa.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblPapasALa.setBounds(26, 233, 197, 30);
		mealsPanel.add(lblPapasALa);

		JLabel lblOrdenGuacamole = new JLabel("Orden Guacamole");
		lblOrdenGuacamole.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblOrdenGuacamole.setBounds(26, 275, 197, 30);
		mealsPanel.add(lblOrdenGuacamole);

		/*
		 * 
		 * Test Fields in charge of storing the data passed by the user. This textFields
		 * will set the amounts.
		 */

		textFieldFiletePes = new JTextField();
		textFieldFiletePes.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFiletePes.setBounds(256, 68, 73, 27);
		textFieldFiletePes.setText("0");
		mealsPanel.add(textFieldFiletePes);
		textFieldFiletePes.setColumns(10);

		textFieldHamburguesa = new JTextField();
		textFieldHamburguesa.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldHamburguesa.setColumns(10);
		textFieldHamburguesa.setText("0");
		textFieldHamburguesa.setBounds(256, 110, 73, 27);
		mealsPanel.add(textFieldHamburguesa);

		textFieldFiletePollo = new JTextField();
		textFieldFiletePollo.setColumns(10);
		textFieldFiletePollo.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFiletePollo.setText("0");
		textFieldFiletePollo.setBounds(256, 152, 73, 27);
		mealsPanel.add(textFieldFiletePollo);

		textFieldCamarones = new JTextField();
		textFieldCamarones.setColumns(10);
		textFieldCamarones.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCamarones.setText("0");
		textFieldCamarones.setBounds(256, 194, 73, 27);
		mealsPanel.add(textFieldCamarones);

		textFieldPapas = new JTextField();
		textFieldPapas.setColumns(10);
		textFieldPapas.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPapas.setText("0");
		textFieldPapas.setBounds(256, 236, 73, 27);
		mealsPanel.add(textFieldPapas);

		textFieldGuacamole = new JTextField();
		textFieldGuacamole.setColumns(10);
		textFieldGuacamole.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldGuacamole.setText("0");
		textFieldGuacamole.setBounds(256, 278, 73, 27);
		mealsPanel.add(textFieldGuacamole);

		JPanel drinksPanel = new JPanel();
		drinksPanel.setBorder(new LineBorder(new Color(0, 128, 128), 7, true));
		drinksPanel.setBounds(437, 139, 349, 329);
		contentPane.add(drinksPanel);
		drinksPanel.setLayout(null);

		JLabel lblBebidas = new JLabel("BEBIDAS");
		lblBebidas.setHorizontalAlignment(SwingConstants.CENTER);
		lblBebidas.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblBebidas.setBounds(122, 17, 101, 36);
		drinksPanel.add(lblBebidas);

		JLabel lblRefrescos = new JLabel("Refrescos");
		lblRefrescos.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblRefrescos.setBounds(26, 65, 197, 30);
		drinksPanel.add(lblRefrescos);

		JLabel lblCerveza = new JLabel("Cervezas");
		lblCerveza.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblCerveza.setBounds(26, 107, 197, 30);
		drinksPanel.add(lblCerveza);

		JLabel lblJamaica = new JLabel("Jamaica");
		lblJamaica.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblJamaica.setBounds(26, 149, 197, 30);
		drinksPanel.add(lblJamaica);

		JLabel lblBotellaDeAgua = new JLabel("Botella de agua");
		lblBotellaDeAgua.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblBotellaDeAgua.setBounds(26, 191, 197, 30);
		drinksPanel.add(lblBotellaDeAgua);

		JLabel lblHorchata = new JLabel("Horchata");
		lblHorchata.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblHorchata.setBounds(26, 233, 197, 30);
		drinksPanel.add(lblHorchata);

		JLabel lblAguaMineral = new JLabel("Agua Mineral");
		lblAguaMineral.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblAguaMineral.setBounds(26, 275, 197, 30);
		drinksPanel.add(lblAguaMineral);

		textFieldRefrescos = new JTextField();
		textFieldRefrescos.setColumns(10);
		textFieldRefrescos.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldRefrescos.setText("0");
		textFieldRefrescos.setBounds(249, 68, 73, 27);
		drinksPanel.add(textFieldRefrescos);

		textFieldCerveza = new JTextField();
		textFieldCerveza.setColumns(10);
		textFieldCerveza.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCerveza.setText("0");
		textFieldCerveza.setBounds(249, 110, 73, 27);
		drinksPanel.add(textFieldCerveza);

		textFieldJamaica = new JTextField();
		textFieldJamaica.setColumns(10);
		textFieldJamaica.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldJamaica.setText("0");
		textFieldJamaica.setBounds(249, 152, 73, 27);
		drinksPanel.add(textFieldJamaica);

		textFieldAgua = new JTextField();
		textFieldAgua.setColumns(10);
		textFieldAgua.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAgua.setText("0");
		textFieldAgua.setBounds(249, 194, 73, 27);
		drinksPanel.add(textFieldAgua);

		textFieldHorchata = new JTextField();
		textFieldHorchata.setColumns(10);
		textFieldHorchata.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldHorchata.setText("0");
		textFieldHorchata.setBounds(249, 236, 73, 27);
		drinksPanel.add(textFieldHorchata);

		textFieldAguaMin = new JTextField();
		textFieldAguaMin.setColumns(10);
		textFieldAguaMin.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAguaMin.setText("0");
		textFieldAguaMin.setBounds(249, 278, 73, 27);
		drinksPanel.add(textFieldAguaMin);

		JPanel receiptPanel = new JPanel();
		receiptPanel.setBorder(new LineBorder(new Color(0, 128, 128), 8, true));
		receiptPanel.setBounds(824, 139, 380, 604);
		contentPane.add(receiptPanel);
		receiptPanel.setLayout(null);

		textFieldTotalBill = new JTextArea();
		textFieldTotalBill.setBackground(Color.LIGHT_GRAY);
		textFieldTotalBill.setColumns(10);
		textFieldTotalBill.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		textFieldTotalBill.setBounds(19, 20, 342, 559);
		receiptPanel.add(textFieldTotalBill);

		JPanel costsPanel = new JPanel();
		costsPanel.setBorder(new LineBorder(new Color(0, 128, 128), 8, true));
		costsPanel.setBounds(51, 493, 349, 171);
		contentPane.add(costsPanel);
		costsPanel.setLayout(null);

		JLabel lblCostoplatillos = new JLabel("Costo Platillos");
		lblCostoplatillos.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblCostoplatillos.setBounds(20, 30, 197, 30);
		costsPanel.add(lblCostoplatillos);

		JLabel lblCostoBebidas = new JLabel("Costo Bebidas");
		lblCostoBebidas.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblCostoBebidas.setBounds(20, 80, 197, 30);
		costsPanel.add(lblCostoBebidas);

		JLabel lblCostototal = new JLabel("Costo Total");
		lblCostototal.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblCostototal.setBounds(20, 122, 197, 30);
		costsPanel.add(lblCostototal);

		textFieldCostoPlati = new JTextField();
		textFieldCostoPlati.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCostoPlati.setColumns(10);
		textFieldCostoPlati.setBounds(203, 27, 122, 38);
		costsPanel.add(textFieldCostoPlati);

		textFieldCostoBebi = new JTextField();
		textFieldCostoBebi.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCostoBebi.setColumns(10);
		textFieldCostoBebi.setBounds(203, 72, 122, 38);
		costsPanel.add(textFieldCostoBebi);

		textFieldCostoTotal = new JTextField();
		textFieldCostoTotal.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCostoTotal.setColumns(10);
		textFieldCostoTotal.setBounds(203, 119, 122, 38);
		costsPanel.add(textFieldCostoTotal);

		JPanel totalPanel = new JPanel();
		totalPanel.setBorder(new LineBorder(new Color(0, 128, 128), 8, true));
		totalPanel.setBounds(437, 493, 349, 171);
		contentPane.add(totalPanel);
		totalPanel.setLayout(null);

		JLabel lblImpuestos = new JLabel("Impuestos");
		lblImpuestos.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblImpuestos.setBounds(23, 27, 197, 30);
		totalPanel.add(lblImpuestos);

		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblSubtotal.setBounds(23, 74, 197, 30);
		totalPanel.add(lblSubtotal);

		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblTotal.setBounds(23, 121, 197, 30);
		totalPanel.add(lblTotal);

		textFieldImpuesto = new JTextField();
		textFieldImpuesto.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldImpuesto.setColumns(10);
		textFieldImpuesto.setBounds(202, 24, 122, 38);
		totalPanel.add(textFieldImpuesto);

		textFieldSubTotal = new JTextField();
		textFieldSubTotal.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSubTotal.setColumns(10);
		textFieldSubTotal.setBounds(202, 71, 122, 38);
		totalPanel.add(textFieldSubTotal);

		textFieldTotal = new JTextField();
		textFieldTotal.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldTotal.setColumns(10);
		textFieldTotal.setBounds(202, 116, 122, 38);
		totalPanel.add(textFieldTotal);

		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setBorder(new LineBorder(new Color(0, 128, 128), 6, true));
		buttonsPanel.setBounds(51, 676, 735, 66);
		contentPane.add(buttonsPanel);
		buttonsPanel.setLayout(null);

		JButton buttonTotal = new JButton("Total");
		buttonTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				SubClass_Child itemCost = new SubClass_Child(); // instancia de la subclase para traer los precios y
																// datos de los textFields.

				double totalPlatillos, totalBebidas, total, impuestos, subTotal, totalFinal;

				itemCost.filetePescado = itemCost.priceFiletePescado * Double.parseDouble(textFieldFiletePes.getText());
				itemCost.filletePollo = itemCost.priceFilletePollo * Double.parseDouble(textFieldFiletePollo.getText());
				itemCost.hamburguesa = itemCost.priceHamburguesa * Double.parseDouble(textFieldHamburguesa.getText());
				itemCost.camarones = itemCost.priceCamarones * Double.parseDouble(textFieldCamarones.getText());
				itemCost.papas = itemCost.pricePapas * Double.parseDouble(textFieldPapas.getText());
				itemCost.guacamole = itemCost.priceGuacamole * Double.parseDouble(textFieldGuacamole.getText());

				itemCost.refrescos = itemCost.priceRefrescos * Double.parseDouble(textFieldRefrescos.getText());
				itemCost.cerveza = itemCost.priceCerveza * Double.parseDouble(textFieldCerveza.getText());
				itemCost.jamaica = itemCost.priceJamaica * Double.parseDouble(textFieldJamaica.getText());
				itemCost.botellaAgua = itemCost.priceBotellaAgua * Double.parseDouble(textFieldAgua.getText());
				itemCost.aguaMin = itemCost.priceAguaMin * Double.parseDouble(textFieldAguaMin.getText());
				itemCost.horchata = itemCost.priceHorchata * Double.parseDouble(textFieldHorchata.getText());

				totalPlatillos = itemCost.filetePescado + itemCost.filletePollo + itemCost.hamburguesa
						+ itemCost.camarones + itemCost.papas + itemCost.guacamole;
				totalBebidas = itemCost.refrescos + itemCost.cerveza + itemCost.jamaica + itemCost.botellaAgua
						+ itemCost.aguaMin + itemCost.horchata;

				total = totalPlatillos + totalBebidas;
				System.out.println(total);

				impuestos = itemCost.finalTax(total);

				subTotal = itemCost.getAmount();

				totalFinal = subTotal + impuestos;

				textFieldCostoPlati.setText(String.format("$%.2f", totalPlatillos));
				textFieldCostoBebi.setText(String.format("$%.2f", totalBebidas));
				textFieldCostoTotal.setText(String.format("$%.2f", total));

				textFieldImpuesto.setText(String.format("$%.2f", impuestos));
				textFieldSubTotal.setText(String.format("$%.2f", subTotal));
				textFieldTotal.setText(String.format("$%.2f", totalFinal));

			}
		});
		buttonTotal.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		buttonTotal.setBounds(28, 17, 117, 37);
		buttonsPanel.add(buttonTotal);

		JButton buttonRecepit = new JButton("Recibo");
		buttonRecepit.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		buttonRecepit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int ref = 12345 + (int) (Math.random() * 4238);

				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
				time.format(timer.getTime());
				SimpleDateFormat date = new SimpleDateFormat("dd-MM-YYYY");
				date.format(timer.getTime());

				textFieldTotalBill.setText("     Restaurant Management System\n" + " Numero de referencia: \t" + ref
						+ "\n" + "==========================\n" +

						" Platillos:\t\t" + textFieldCostoPlati.getText() + "\n\n" + " Bebidas:\t\t "
						+ textFieldCostoBebi.getText() + "\n\n" + " Costo Total:\t\t" + textFieldCostoTotal.getText()
						+ "\n\n" + "==========================\n" + " Impuestos:\t\t" + textFieldImpuesto.getText()
						+ "\n\n" + " Subtotal:\t\t" + textFieldSubTotal.getText() + "\n\n" + " Total:\t\t"
						+ textFieldTotal.getText() + "\n\n" + "==========================\n" + " Fecha: "
						+ date.format(timer.getTime()) + "\n" + " Hora: " + time.format(timer.getTime()) + "\n\n"
						+ "     ¡Muchas gracias por su preferencia!");

			}
		});
		buttonRecepit.setBounds(157, 17, 109, 37);
		buttonsPanel.add(buttonRecepit);

		JButton buttonReset = new JButton("Reset");
		buttonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField clearText = null;
				// For/Each to obtain all the components inside the 4 panels where we add
				// information
				for (Component a : mealsPanel.getComponents()) {
					if (a.getClass().toString().contains("javax.swing.JTextField")) {
						clearText = (JTextField) a;
						clearText.setText("0");
					}
				}

				for (Component a : drinksPanel.getComponents()) {
					if (a.getClass().toString().contains("javax.swing.JTextField")) {
						clearText = (JTextField) a;
						clearText.setText("0");
					}
				}

				for (Component a : costsPanel.getComponents()) {
					if (a.getClass().toString().contains("javax.swing.JTextField")) {
						clearText = (JTextField) a;
						clearText.setText("");
					}
				}

				for (Component a : totalPanel.getComponents()) {
					if (a.getClass().toString().contains("javax.swing.JTextField")) {
						clearText = (JTextField) a;
						clearText.setText("");
					}
				}

				for (Component a : receiptPanel.getComponents()) {
					if (a.getClass().toString().contains("javax.swing.JTextField")) {
						clearText = (JTextField) a;
						clearText.setText(" ");
					}
				}

			}
		});
		buttonReset.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		buttonReset.setBounds(401, 17, 148, 37);
		buttonsPanel.add(buttonReset);

		JButton buttonExit = new JButton("Exit");
		buttonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				SubClass_Child close = new SubClass_Child(); // Instance of class SubClass Child that will have the
																// method exit System.

				close.exitSystem();
			}

		});
		buttonExit.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		buttonExit.setBounds(561, 14, 148, 43);
		buttonsPanel.add(buttonExit);

		JButton btnFactura = new JButton("Factura");
		btnFactura.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnFactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Facturacion window = new Facturacion();
				window.setVisible(true);

			}
		});
		btnFactura.setBounds(278, 17, 117, 34);
		buttonsPanel.add(btnFactura);
	}
}
