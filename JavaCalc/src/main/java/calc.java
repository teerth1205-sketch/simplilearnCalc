

import java.util.Scanner;


 class calc {


	
	public static final void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me a number A please:");
		float numberA = scanner.nextFloat();
		scanner.nextLine();
		System.out.println("Give me a number B please:");
		float numberB = scanner.nextFloat();
		System.out.println("Give me a operation please:");
		scanner.nextLine();
		String operation = scanner.nextLine();
		
		float result = 0;
		if (operation.equals("add")) {
			add a = new add();
			a.setA(numberA);
			a.setB(numberB);
			result = a.getResult();
		} else if (operation.equals("subtract")) {
			subtract s = new subtract();
			s.setA(numberA);
			s.setB(numberB);
			result = s.getResult();
		} else if (operation.equals("multiply")) {
			multiply m = new multiply();
			m.setA(numberA);
			m.setB(numberB);
			result = m.getResult();
		} else if (operation.equals("divide")) {
			divide d = new divide();
			d.setA(numberA);
			d.setB(numberB);
			result = d.getResult();
		} else {
			System.out.println("Did not understand oparation");
		}

		System.out.println("The result is");
		System.out.println(result);
		
	}
	
}
