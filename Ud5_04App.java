import javax.swing.JOptionPane;

public class Ud5_04App {

	public static void main(String[] args) {
		
		String stringRadio = JOptionPane.showInputDialog("Introduce el Radio del circulo");
		double radio = Double.parseDouble(stringRadio);
		
		double resultado = Math.PI * Math.pow(radio, 2);
		
		System.out.println("El area del circulo es de "+ resultado);

	}

}
