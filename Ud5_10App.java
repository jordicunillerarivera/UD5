import javax.swing.JOptionPane;

public class Ud5_10App {

	public static void main(String[] args) {
		
		int numVentas = 5;
		int ventas = 0;
		
		for (int i = 0; i < numVentas; i++) {
			
			String stringVentas = JOptionPane.showInputDialog("Venta " + (i+1));
			ventas = ventas + Integer.parseInt(stringVentas);
		}
		
		System.out.println("El numero total de ventas es " + ventas);

	}

}
