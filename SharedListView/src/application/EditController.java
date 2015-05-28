package application;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class EditController {

    @FXML
    private ListView<Item> listView ;
    
    @FXML
    private Button deleteButton ;
    
    public void setItems(ObservableList<Item> items) {
        listView.setItems(items);
        deleteButton.disableProperty().bind(
                listView.getSelectionModel().selectedItemProperty().isNull());
    }
    
    @FXML
    private void delete() {
        listView.getItems().remove(listView.getSelectionModel().getSelectedItem());
    }
}
