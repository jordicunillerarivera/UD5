import javax.swing.JOptionPane;

public class Ud5_12App {
	
	public static void main(String[] args) {
		
		String contrase�a = "123456";
		
		for (int i = 0; i < 3; i++) {
			String introducirContrase�a = JOptionPane.showInputDialog("Introduce la contrase�a");
			
			if (contrase�a.equals(introducirContrase�a)) {
				System.out.println("Enhorabuena");
				i = 10;
			}
		}
		
	}

}
