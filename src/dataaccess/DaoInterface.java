package dataaccess;

import javafx.collections.ObservableList;

public interface DaoInterface {
	public ClientModel create( long id, String name, String data ) throws Exception;
	public void delete( long id ) throws Exception;
	public void update( long id, ClientModel model ) throws Exception;
	public ObservableList<ClientModel> findAll() throws Exception;
	public ObservableList<ClientModel> findByMany(String firstName, String lastName, String username, String password, String afm, String amka, String category) throws Exception;
	public ClientModel findById( long id ) throws Exception;
}
