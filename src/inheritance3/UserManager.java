package inheritance3;

public class UserManager {
	public void signIn(User user) {
		System.out.println(user.getFullName() + " Olarak Sisteme Giriþ Yaptýnýz.");
	}
	public void signOut(User user) {
		System.out.println("Çýkýþ Yapýldý.");
	}
}
