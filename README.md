# SharedListView
Demo of sharing data between two list views defined in different FXML files. 

The two FXML files are loaded via `<fx:include>`s from a `Main.fxml`. The controller for `Main.fxml` creates the data list
and passes it to each of the controllers for the included FXML files.
