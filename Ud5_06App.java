import javax.swing.JOptionPane;

public class Ud5_06App {

	public static void main(String[] args) {
		
		String stringPrecio = JOptionPane.showInputDialog("Introduce el precio sin IVA del producto");
		double precio = Double.parseDouble(stringPrecio);
		final double IVA = 0.21;
		
		System.out.println("El precio con IVA del producto es de " + (precio+(precio*IVA)) + "€");

	}

}
