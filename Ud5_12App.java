import javax.swing.JOptionPane;

public class Ud5_12App {
	
	public static void main(String[] args) {
		
		String contraseņa = "123456";
		
		for (int i = 0; i < 3; i++) {
			String introducirContraseņa = JOptionPane.showInputDialog("Introduce la contraseņa");
			
			if (contraseņa.equals(introducirContraseņa)) {
				System.out.println("Enhorabuena");
				i = 10;
			}
		}
		
	}

}
