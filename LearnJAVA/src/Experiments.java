import java.util.Scanner;


public class Experiments {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("What is your class? (Orc, Elf, Human, Dwarf)");
	String type = sc.nextLine();
	
	if (type==sc.nextLine()) {
		System.out.println("You are a "+type);
	}
	else {
		System.out.println("Null");
	}
	}

}
