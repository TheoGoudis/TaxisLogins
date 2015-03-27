package taxislogins;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
	
	private StringProperty firstName;
	private StringProperty lastName;
	private IntegerProperty afm;
	private StringProperty username;
	private StringProperty password;
	
	Person(){
		this(null, null, null, null, null);
	}

	public Person(String firstName, String lastName, Integer afm, String username, String password) {
		this.firstName=new SimpleStringProperty(firstName);
		this.lastName=new SimpleStringProperty(lastName);
		this.afm=new SimpleIntegerProperty(afm);
		this.username=new SimpleStringProperty(username);
		this.password=new SimpleStringProperty(password);
	}
	
	
	public String getFirstName(){
		return firstName.get();
	}
	
	public String getLastName(){
		return lastName.get();
	}
	
	public Integer getAfm(){
		return afm.get();
	}
	
	public String getUsername(){
		return username.get();
	}
	
	public String getPassword(){
		return password.get();
	}
	
	public void setFirstName(String firstName){
		this.firstName.set(firstName);
	}
	
	public void setLastName(String lastName){
		this.lastName.set(lastName);
	}
	
	public void setAfm(int afm){
		this.afm.set(afm);
	}
	
	public void setUsername(String username){
		this.username.set(username);
	}
	
	public void setPassword(String password){
		this.password.set(password);
	}
	
}
