import javax.swing.JOptionPane;

public class Ud5_05App {

	public static void main(String[] args) {
		
		String stringNumero = JOptionPane.showInputDialog("Introduce un numero para comprobar si es divisible entre 2");
		int numero = Integer.parseInt(stringNumero);
		
		if (numero%2 == 0) {
			System.out.println(numero + " es divisible entre dos");
		} else {
			System.out.println(numero + " no es divisible entre dos");
		}

	}

}
