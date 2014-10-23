package cs356.assignment1;

import java.util.List;

public class IClickerService {
	
	private int questionType;
	private Question q;
	private int studentCount;
	private int answerCount;
	private int[] totals;
	private int[] singleArray;
	private int[][] multiArray;
	
	
	public IClickerService (int questionType, Question q, int studentCount) {
		this.questionType = questionType;
		this.studentCount = studentCount;
		answerCount = 0;
		this.q = new Question(q.getNumberOfChoices(), q.getQuestion());
		totals = new int[q.getNumberOfChoices()];
		for (int i:totals) {i = 0; }
		
		singleArray = new int[studentCount];
		for (int i:singleArray) {i = 0;}
		multiArray = new int[studentCount][q.getNumberOfChoices()];
		
		
	}
	
	public boolean submitSingleAnswer(Student s, int a) {
		if (singleArray[Integer.parseInt(s.getId())] == 0) {
			singleArray[Integer.parseInt(s.getId())] = a;
			answerCount++;
		} else {
			singleArray[Integer.parseInt(s.getId())] = a;
			
		}
		
		if (answerCount == studentCount) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean submitMultiAnswer( Student s, int[] studentAnswers) {
		int sum = 0;
		for (int i = 0; i < studentAnswers.length; i++) {
			sum += multiArray[Integer.parseInt(s.getId())][i];
		}
		if (sum == 0) {
			multiArray[Integer.parseInt(s.getId())] = studentAnswers;
			answerCount++;
		} else {
			multiArray[Integer.parseInt(s.getId())] = studentAnswers;
		}
		if (answerCount == studentCount) {
			return true;
		} else {
			return false;
		}
		
		
	}
	
	public void displayQuestion() {
		System.out.println(q.getQuestion());
		
	}
	
	
	
	public void showResults(List<String> answers) {
		
		System.out.println("Here are the results: ");
		if (this.questionType == 1) {
			for (int i = 0; i < singleArray.length; i++) {
				totals[singleArray[i]]++;
			}
			int count = 1;
			for (String s: answers) {
				System.out.println(count + "." + s + ": " + totals[count-1]);
				System.out.println("Number of students: " + studentCount);
			}
		} else {
			for (int i = 0; i < studentCount; i++) {
				for (int j = 0; j < totals.length; j++) {
					totals[j]+= multiArray[i][j];
				}
			}
			int count = 1;
			for (String s: answers) {
				System.out.println(count + "." + s + ": " + totals[count-1]);
				System.out.println("Number of students: " + studentCount);
			}
		}
	}
	
	
	
	
	
	
}
