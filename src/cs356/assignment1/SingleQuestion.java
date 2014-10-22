package cs356.assignment1;

import java.util.List;



public class SingleQuestion implements QuestionInterface {
	private int numberOfChoices;
	private String question;
	private List<String> answers;
	
	public SingleQuestion(int numberOfChoices, String question) {
		this.numberOfChoices = numberOfChoices;
		this.question = question;
	}
}
