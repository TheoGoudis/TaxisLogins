package dataaccess;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DaoImpl<observableArrayList> implements DaoInterface{
	
	final ObservableList<ClientModel> data= FXCollections.observableArrayList(
			new ClientModel(123456789,"Όνομα0","Επίθετο0","Username0","Password0","0123456789","0123456789","Ιδιώτης"),
			new ClientModel(234567890,"Όνομα1","Επίθετο1","Username1","Password1","1234567890","1234567890","Επιχείρηση"),
			new ClientModel(345678901,"Όνομα2","Επίθετο2","Username2","Password2","2345678901","2345678901","Ιδιώτης"),
			new ClientModel(456789012,"Όνομα3","Επίθετο3","Username3","Password3","3456789012","3456789012","Γεωργός"),
			new ClientModel(567890123,"Όνομα4","Επίθετο4","Username4","Password4","4567890123","4567890123","Γεωργός"),
			new ClientModel(678901234,"Όνομα5","Επίθετο5","Username5","Password5","5678901234","5678901234","Ιδιώτης"),
			new ClientModel(789012345,"Όνομα6","Επίθετο6","Username6","Password6","6789012345","6789012345","Αντ: Mpla Mpla ΑΕ"),
			new ClientModel(890123456,"Όνομα7","Επίθετο7","Username7","Password7","7890123456","7890123456","Επιχείρηση"),
			new ClientModel(901234567,"Όνομα8","Επίθετο8","Username8","Password8","8901234567","8901234567","Ανt: Μπλο Μπλο ΑΕ"),
			new ClientModel(112345678,"Όνομα9","Επίθετο9","Username9","Password9","9012345678","9012345678","Επιχείρηση")
			);
	
	@Override
	public ClientModel create(long id, String name, String data) throws Exception {
		// TODO add a new client
		return null;
	}

	@Override
	public void delete(long id) throws Exception {
		// TODO delete a client		
	}

	@Override
	public void update(long id, ClientModel model) throws Exception {
		// TODO update client
		
	}

	@Override
	public ObservableList<ClientModel> findAll() throws Exception {
		return data;
	}

	@Override
	public ObservableList<ClientModel> findByMany(String firstName,	String lastName, String username, String password, String afm, String amka, String category) throws Exception {
		// TODO get clients characterized by not null params
		return null;
	}

	@Override
	public ClientModel findById(long id) throws Exception {
		for(ClientModel client : data){
			if(client.getId()==id)
				return client;
		}
		return null;
	}

}
