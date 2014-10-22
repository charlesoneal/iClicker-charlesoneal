package cs356.assignment1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SimulationDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstOption = 0;
		while ( firstOption != 2) {
			try {
				System.out.println("Welcome to the iClicker Simulation");
				System.out.println("Please make a choice: ");
				System.out.println("1. Create question");
				System.out.println("2. Exit");
				firstOption = sc.nextInt();
				if (firstOption > 2 || firstOption < 1) {
					System.out.println("Invalid Choice!!");
				} else if(firstOption == 1){
					System.out.println("Please Enter the question: ");
					String question = sc.nextLine();
					System.out.println("Please enter the number of choices: ");
					int numChoices = sc.nextInt();
					List<String> answerList = new ArrayList<String>(numChoices);
					
				} else {
					System.out.println("Thank you for using the iClicker Simulation");
					System.exit(0);
				}
			} catch(InputMismatchException ime) {
				System.out.println("Invalid Input!!");
				firstOption = 0;
				
			}
			
		}
		
		

	}

}
