package taxislogins;

public class Client {
	
	public String firstName;
	private String lastName;
	private String afm;
	private String amka;
	private String username;
	private String password;
	
	Client(String firstName, String lastName, String username, String password, String afm, String amka) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.afm=afm;
		this.amka=amka;
		this.username=username;
		this.password=password;
		System.out.println(this.firstName);
	}
	
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}

	
	public String getUsername(){
		return username;
	}
	
	public String getPassword(){
		return password;
	}
	
	public String getAfm(){
		return afm;
	}
	
	public String getAmka(){
		return amka;
	}
	
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	
	public void setUsername(String username){
		this.username=username;
	}
	
	public void setPassword(String password){
		this.password=password;
	}
	
	public void setAfm(String afm){
		this.afm=afm;
	}
	
	public void setAmka(String amka){
		this.amka=amka;
	}
}
