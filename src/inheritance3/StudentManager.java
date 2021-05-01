package inheritance3;

import java.util.Scanner;

public class StudentManager extends UserManager {
	Scanner s = new Scanner(System.in);
	
	public void joinCourse() {
		System.out.println("Kursa Baþarýyla Kayýt Oldunuz.");
	}
	public void outCourse() {
		System.out.println("Kurstan Ayrýldýnýz.");
	}
	public void messageToInstructor(Instructor instructor) {
		System.out.println("Mesaj: ");
		s.nextLine();
		System.out.println("Mesajýnýz " + instructor.getFullName() + " Adlý Eðitmene Gönderildi.");
	}
}
