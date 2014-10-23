package cs356.assignment1;

import java.util.ArrayList;
import java.util.List;

public class Question implements QuestionInterface {

	private int numberOfChoices;
	private String question;
	List<String> choices;
	
	public Question(int numberOfChoices, String question) {
		this.numberOfChoices = numberOfChoices;
		this.question = question;
		
	}

	public int getNumberOfChoices() {
		return numberOfChoices;
	}

	public void setNumberOfChoices(int numberOfChoices) {
		this.numberOfChoices = numberOfChoices;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getChoices() {
		return choices;
	}

	public void setChoices(List<String> choices) {
		this.choices = new ArrayList<String>(choices);
	}
	
}
