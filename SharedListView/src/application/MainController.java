package application;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

public class MainController {
    @FXML
    private DetailsController detailsController ;
    
    @FXML
    private EditController editController ;
    
    public void initialize() {
        final Random rng = new Random();
        ObservableList<Item> items = FXCollections.observableArrayList(
            IntStream.rangeClosed(1, 20).mapToObj(i -> new Item("Item "+i, rng.nextInt(50)))
                .collect(Collectors.toList())
        );
        
        // use same list for both controllers (i.e. both list views):
        detailsController.setItems(items);
        editController.setItems(items);
    }
}
