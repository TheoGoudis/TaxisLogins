package taxislogins;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Client {
	
	private StringProperty firstName;
	private StringProperty lastName;
	private IntegerProperty afm;
	private IntegerProperty amka;
	private StringProperty username;
	private StringProperty password;
	
	Client(){
		this(null, null, null, null, null, null);
	}

	public Client(String firstName, String lastName, String username, String password, Integer afm, Integer amka) {
		this.firstName=new SimpleStringProperty(firstName);
		this.lastName=new SimpleStringProperty(lastName);
		this.afm=new SimpleIntegerProperty(afm);
		this.amka=new SimpleIntegerProperty(amka);
		this.username=new SimpleStringProperty(username);
		this.password=new SimpleStringProperty(password);
	}
	
	
	public String getFirstName(){
		return firstName.get();
	}
	
	public String getLastName(){
		return lastName.get();
	}

	
	public String getUsername(){
		return username.get();
	}
	
	public String getPassword(){
		return password.get();
	}
	
	public Integer getAfm(){
		return afm.get();
	}
	
	public Integer getAmka(){
		return amka.get();
	}
	
	public void setFirstName(String firstName){
		this.firstName.set(firstName);
	}
	
	public void setLastName(String lastName){
		this.lastName.set(lastName);
	}
	
	public void setUsername(String username){
		this.username.set(username);
	}
	
	public void setPassword(String password){
		this.password.set(password);
	}
	
	public void setAfm(int afm){
		this.afm.set(afm);
	}
	
	public void setAmka(int afm){
		this.amka.set(afm);
	}
}
