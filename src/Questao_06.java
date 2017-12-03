import javax.swing.JOptionPane;;
public class Questao_06 
{

	public static void main(String[] args) 
	{
		String letra=JOptionPane.showInputDialog("Digite uma letra e lhe direi se é uma consoante ou vogal");
		if (letra.length()>1) {
			JOptionPane.showMessageDialog(null,"Não é uma letra válida");
		}else{
		switch (letra) {
		case "a":JOptionPane.showMessageDialog(null,"Vogal");break;
		case "e":JOptionPane.showMessageDialog(null,"Vogal");break;
		case "i":JOptionPane.showMessageDialog(null,"Vogal");break;
		case "o":JOptionPane.showMessageDialog(null,"Vogal");break;
		case "u":JOptionPane.showMessageDialog(null,"Vogal");break;
		case "A":JOptionPane.showMessageDialog(null,"Vogal");break;
		case "E":JOptionPane.showMessageDialog(null,"Vogal");break;
		case "I":JOptionPane.showMessageDialog(null,"Vogal");break;
		case "O":JOptionPane.showMessageDialog(null,"Vogal");break;
		case "U":JOptionPane.showMessageDialog(null,"Vogal");break;
		default:JOptionPane.showMessageDialog(null,"Consoante");break;
		}
	  }
	}

}
