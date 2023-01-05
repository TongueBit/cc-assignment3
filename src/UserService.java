import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserService {
	
	public static User[] createUserArray(BufferedReader br) throws IOException {
		
		User[] users = new User[4]; //not very dynamic so I added a counter for number of entries
		String line = "";
		int i = 0;
		while ((line = br.readLine()) != null) {
			String[] userData = line.split(",");
			User user = new User(userData[0], userData[1], userData[2]);
			users[i] = user;
			i++;
		}
		return users;
	}
	
	public static void validateUser(User[] users) {
		int loginAttempts = 5;
		Scanner scanner = new Scanner(System.in);

		while (loginAttempts > 0) {
			System.out.println("Enter your email:");
			String email = scanner.nextLine();
			System.out.println("Enter your password:");
			String password = scanner.nextLine();
			
			for(User user: users) {
				if(email.equalsIgnoreCase(user.getUsername()) && password.equals(user.getPassword())) {
					System.out.println("Welcome: " + user.getName());
					System.exit(0);
				}
			}
			System.out.println("Invalid login, please try again");
			loginAttempts--;
			
		}
		System.out.println("Too many failed login attempts, you are now locked out.");
		System.exit(0);
	}
}
