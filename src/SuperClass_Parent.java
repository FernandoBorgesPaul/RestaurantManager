import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class SuperClass_Parent {
	
	//Variables que se pasaran con los valores de los productos.

	public double filetePescado;
	public double hamburguesa;
	public double filletePollo;
	public double camarones;
	public double papas;
	public double guacamole;
	
	public double refrescos;
	public double cerveza;
	public double jamaica;
	public double botellaAgua;
	public double horchata;
	public double aguaMin;

	public double costoPlatillos;
	public double costoBebidas;
	public double costoTotal;

	
	//Method to do the calculation of the consume frmo the customer
	public double getAmount() {
		
		costoPlatillos = filetePescado + hamburguesa + filletePollo + camarones + papas + guacamole;
		costoBebidas = refrescos + cerveza + jamaica + botellaAgua + horchata + aguaMin;
		
		costoTotal = costoPlatillos + costoBebidas;
		
		System.out.println(costoTotal);
		return costoTotal;
		
		
	}
		

	//Method to close the System
	public void exitSystem() {
		
		JFrame frame = new JFrame();
		
		if (JOptionPane.showConfirmDialog(frame, "¿Desea cerrar la sesión?", "Restaurant Management System",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
			System.exit(0);
		}
	}
	
	// Prices of different items: 
	
	public double priceFiletePescado = 3.56;
	public double priceHamburguesa = 2.95;
	public double priceFilletePollo = 4.00;
	public double priceCamarones = 3.23;
	public double pricePapas = 2.50;
	public double priceGuacamole = 2.10;
	
	public double priceRefrescos = 1.50;
	public double priceCerveza = 3.00;
	public double priceJamaica = 1.00;
	public double priceBotellaAgua = 0.99;
	public double priceHorchata = 1.90;
	public double priceAguaMin = 0.80;
	
	// Taxes rate
	
	public double tax = 0.90;
	
	public Double finalTax (double amount) {
		
		double finTax = amount - (amount * tax);
		
		System.out.println(finTax);
		
		return finTax;
		
	}
	
	
	
	
}
