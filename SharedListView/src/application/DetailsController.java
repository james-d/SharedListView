package application;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class DetailsController {
    @FXML
    private ListView<Item> listView ;
    @FXML
    private Label nameLabel ;
    @FXML
    private Label valueLabel ;
    
    public void initialize() {
        listView.getSelectionModel().selectedItemProperty().addListener((obs, oldItem, newItem) -> {
            if (newItem == null) {
                nameLabel.setText("");
                valueLabel.setText("");
            } else {
                nameLabel.setText("Name: "+newItem.getName());
                valueLabel.setText("Value: "+newItem.getValue());
            }
        });
    }
    
    public void setItems(ObservableList<Item> items) {
        listView.setItems(items);
    }
}
