package inheritance3;

import java.util.Scanner;

public class InstructorManager extends UserManager {
	Scanner s = new Scanner(System.in);
	public void addCourse(){
		System.out.print("Kurs Adý: ");
		s.nextLine();
		
		System.out.print("Kurs Ücreti: ");
		s.nextInt();
		s.nextLine();
		
		System.out.print("Eðitmen Adý: ");
		s.nextLine();
		
		System.out.println("Kurs Baþarýyla Eklendi.");
		
		
	}
	public void courseDelete() {
		System.out.println("Kursu Silmek Ýstiyor musunuz?");
		String answer = s.nextLine();
		
		if(answer.equals("Evet") || answer.equals("evet")) {
			System.out.println("Kurs Silindi.");
		}
		else {
			System.out.println("Kursu Silmekten Vazgeçtiniz.");
		}
	}
	
}
