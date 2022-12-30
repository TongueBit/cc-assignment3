import java.io.BufferedReader;
import java.io.FileReader;

public class UserLoginApplication {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader fileReader = null;    
		
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			User[] users = UserService.createUserArray(fileReader);
			UserService.validateUser(users);
			
		}
		finally {
			fileReader.close();
		}
		
	}

}
