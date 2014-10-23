package cs356.assignment1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SimulationDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int firstOption = 0;
		while ( firstOption != 2) {
			try {
				System.out.println("Welcome to the iClicker Simulation");
				System.out.println("Please make a choice: ");
				System.out.println("1. Create question");
				System.out.println("2. Exit");
				firstOption = sc.nextInt();
				sc.nextLine();
				if (firstOption > 2 || firstOption < 1) {
					System.out.println("Invalid Choice!!");
				} else if(firstOption == 1){
					System.out.println("Please Enter the question: ");
					String question = sc.nextLine();
					int secondOption = 0; 
					while ( secondOption != 1 || secondOption != 2) {
						try {
							System.out.println("Please choose the question type: ");
							System.out.println("1. Single Answer");
							System.out.println("2. Multiple Answers");
							secondOption = sc.nextInt();
							if (secondOption == 1) {
								System.out.println("How many answers?");
								int numAnswers = sc.nextInt();
								sc.nextLine();
								List<String> answers = new ArrayList<String>();
								String temp;
								for (int i = 0; i < numAnswers; i++) {
									System.out.println("Enter answer number " + (i +1) + ": ");
									temp = sc.nextLine();
									answers.add(temp);
								}
								
								Question q = new Question(numAnswers, question);
								int studentCount = rand.nextInt(41)+20;
								IClickerService i = new IClickerService(secondOption, q, studentCount);
								System.out.println("Generating results......");
								boolean test = false;
								
								while (!test) {
									
									iClickerStudent clicker = new iClickerStudent(Integer.toString(rand.nextInt(studentCount+1)));
									
									test = i.submitSingleAnswer(clicker, rand.nextInt(numAnswers));
									i.displayQuestion();
									i.showResults(answers);
								}
								
								
							} else if (secondOption == 2) {
								
							} else {
								System.out.println("Invalid Choice!!!");
							}
						} catch (InputMismatchException i) {
							System.out.println("Invalid Input!!!");
							secondOption = 0;
						}
					}
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
