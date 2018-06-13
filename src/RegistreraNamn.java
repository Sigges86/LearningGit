import javax.swing.JOptionPane;

public class RegistreraNamn {
	
	public static void main(String[] args) {
		
		String first_name;
		first_name = JOptionPane.showInputDialog("Förnamn");

		String family_name;
		family_name = JOptionPane.showInputDialog("Efternamn");
		
		String full_name;
		full_name = "Fullständig namn " + first_name + " " + family_name;
		
		JOptionPane.showMessageDialog(null, full_name);
		System.exit(0);
		
	};
	
	
}