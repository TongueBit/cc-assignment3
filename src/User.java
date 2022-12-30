

//POJO = plain old java object
public class User {
	
	//instance variables declared private
	private String username;
	private String password;
	private String name;
	private int unsuccessfulLoginAttempts = 5;
	
	User(String username, String password, String name) {
		this.username = username;
		this.password = password;
		this.name = name;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public int getUnsuccessfulLoginAttempts() {
		return unsuccessfulLoginAttempts;
	}
	public void subtractUnsuccessfulLoginAttempts(int unsuccessfulLoginAttempts) {
		this.unsuccessfulLoginAttempts = unsuccessfulLoginAttempts;
	}
	
	
}
