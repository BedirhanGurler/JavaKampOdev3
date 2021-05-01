package inheritance3;

public class Student extends User {
	private int registeredCourseCount;
	private double score;
	
	public Student(int id, String fullName, String userName, String password, int registeredCourseCount, double score) {
		super(id, fullName, userName, password);
		this.registeredCourseCount = registeredCourseCount;
		this.score = score;
	}

	public int getRegisteredCourseCount() {
		return registeredCourseCount;
	}

	public void setRegisteredCourseCount(int registeredCourseCount) {
		this.registeredCourseCount = registeredCourseCount;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	
	
	
}
