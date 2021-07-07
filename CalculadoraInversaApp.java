import javax.swing.JOptionPane;

public class CalculadoraInversaApp {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Primer digito"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Segundo digito"));;
		String operador = JOptionPane.showInputDialog("Operador");
		
		switch (operador) {
			case "+":
				System.out.println(a+b);
				break;
			case "-":
				System.out.println(a-b);			
				break;
			case "*":
				System.out.println(a*b);
				break;
			case "/":
				System.out.println((double) a/b);
				break;
			case "^":
				System.out.println((double)Math.pow(a, b));
				break;
			case "%":
				System.out.println((double) a%b);
				break;
				
	
			default:
				break;
		}

	}

}
