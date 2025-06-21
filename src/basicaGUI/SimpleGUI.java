package basicaGUI;

import javax.swing.JOptionPane;

public class SimpleGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
		JOptionPane.showMessageDialog(null, "Te llamas "+nombre);
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
		JOptionPane.showMessageDialog(null, "Tienes "+edad);
		
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu altura en cm"));
		JOptionPane.showMessageDialog(null, "Tienes "+edad);
	}
}
