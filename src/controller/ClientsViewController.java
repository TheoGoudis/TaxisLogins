package controller;

import dataaccess.ClientModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

public class ClientsViewController {
	
	@FXML private Tab clientsTab;
	@FXML private TableView<ClientModel> clientsTable;
	@FXML private TableColumn<ClientModel, String> clientsTableColCategory;
	@FXML private TableColumn<ClientModel, String> clientsTableColFirstame;
	@FXML private TableColumn<ClientModel, String> clientsTableColLastname;
	@FXML private TableColumn<ClientModel, String> clientsTableColUsername;
	@FXML private TableColumn<ClientModel, String> clientsTableColPassword;
	@FXML private TableColumn<ClientModel, String> clientsTableColAfm;
	@FXML private TableColumn<ClientModel, String> clientsTableColAmka;
	@FXML private TableColumn<ClientModel, Boolean> clientsTableColWeb;
	@FXML private TableColumn<ClientModel, Boolean> clientsTableColEdit;
	
	private dataaccess.DaoImpl daoImpl=new dataaccess.DaoImpl();
	
	//test client data
	private ObservableList<ClientModel> data=FXCollections.observableArrayList();
	
	@FXML
	private void initialize() throws Exception{
		try{
			TabPane tabpane=(TabPane)clientsTab.getTabPane();
			//fill table
			data.addAll(daoImpl.findAll());
			clientsTableColCategory.setCellValueFactory(new PropertyValueFactory<ClientModel,String>("category"));
			clientsTableColFirstame.setCellValueFactory(new PropertyValueFactory<ClientModel,String>("firstName"));
			clientsTableColLastname.setCellValueFactory(new PropertyValueFactory<ClientModel,String>("lastName"));
			clientsTableColUsername.setCellValueFactory(new PropertyValueFactory<ClientModel,String>("username"));
			clientsTableColPassword.setCellValueFactory(new PropertyValueFactory<ClientModel,String>("password"));
			clientsTableColAfm.setCellValueFactory(new PropertyValueFactory<ClientModel,String>("afm"));
			clientsTableColAmka.setCellValueFactory(new PropertyValueFactory<ClientModel,String>("amka"));
			
			clientsTableColWeb.setCellFactory(new Callback<TableColumn<ClientModel, Boolean>, TableCell<ClientModel, Boolean>>(){
				@Override
				public TableCell<ClientModel, Boolean> call(TableColumn<ClientModel, Boolean> p) {
					return new ButtonCellWeb(tabpane);
				}
			});
			
			clientsTableColEdit.setCellFactory(new Callback<TableColumn<ClientModel, Boolean>, TableCell<ClientModel, Boolean>>(){
				@Override
				public TableCell<ClientModel, Boolean> call(TableColumn<ClientModel, Boolean> p) {
					return new ButtonCellEdit();
				}
			});
			
			clientsTable.setItems(data);
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void updateClients(ObservableList<ClientModel> clients){
		
	}
}