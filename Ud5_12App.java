import javax.swing.JOptionPane;

public class Ud5_12App {
	
	public static void main(String[] args) {
		
		String contraseña = "123456";
		
		for (int i = 0; i < 3; i++) {
			String introducirContraseña = JOptionPane.showInputDialog("Introduce la contraseña");
			
			if (contraseña.equals(introducirContraseña)) {
				System.out.println("Enhorabuena");
				i = 10;
			}
		}
		
	}

}
