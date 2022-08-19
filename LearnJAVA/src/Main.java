import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		double x;
		double y;
		double add;
		double sub;
		double mult;
		double div;
		String ADD;
		String SUB;
		String MULT;
		String DIV;
		String z;
		
		ADD = "ADD";
		SUB = "SUB";
		MULT = "MULT";
		DIV = "DIV";
		
		x = Double.parseDouble(JOptionPane.showInputDialog("Enter your 1nd Number"));
		y = Double.parseDouble(JOptionPane.showInputDialog("Enter your 2st Number"));
		z = JOptionPane.showInputDialog("Operation (ADD,SUB,MULT,DIV)");
		
		add = Math.abs(x+y);
		sub = Math.abs(x-y);
		mult = Math.abs(x*y);
		div = Math.abs(x/y);
		
		if (z==ADD) {
			add = Math.abs(x+y);
			JOptionPane.showMessageDialog(null, "Answer: "+add);
		}
		else if (z==SUB) {
			sub = Math.abs(x-y);
			JOptionPane.showMessageDialog(null, "Answer: "+sub);
		}
		else if (z==MULT) {
			mult = Math.abs(x*y);
			JOptionPane.showMessageDialog(null, "Answer: "+mult);
		}
		else if (z==DIV) {
			div = Math.abs(x/y);
			JOptionPane.showMessageDialog(null, "Answer: "+div);
		}
		else {
			JOptionPane.showMessageDialog(null, "Answer: "+add);
		}
	}

}
