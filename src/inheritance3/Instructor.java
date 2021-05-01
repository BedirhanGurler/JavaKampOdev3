package inheritance3;

public class Instructor extends User {
	private String instructorDetail;
	private int courseCount;
	private int studentCount;
	
	

	public Instructor(int id, String fullName, String userName, String password, String instructorDetail,
			int courseCount, int studentCount) {
		super(id, fullName, userName, password);
		this.instructorDetail = instructorDetail;
		this.courseCount = courseCount;
		this.studentCount = studentCount;
	}

	public String getInstructorDetail() {
		return instructorDetail;
	}

	public void setInstructorDetail(String instructorDetail) {
		this.instructorDetail = instructorDetail;
	}

	public int getCourseCount() {
		return courseCount;
	}

	public void setCourseCount(int courseCount) {
		this.courseCount = courseCount;
	}

	public int getStudentCount() {
		return studentCount;
	}

	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
	
	
	
	
	
}
