package cs356.assignment1;

public class iClickerStudent extends Student {
	
	String id;
	
	public iClickerStudent(String id) {
		this.id = id;
	}

	@Override
	public String getId() {
		
		return this.id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
		
	}

}
