package application;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Item {
    private final StringProperty name = new SimpleStringProperty();
    private final IntegerProperty value = new SimpleIntegerProperty();
    
    public Item(String name, int value) {
        setName(name);
        setValue(value);
    }

    public final StringProperty nameProperty() {
        return this.name;
    }

    public final String getName() {
        return this.nameProperty().get();
    }

    public final void setName(final String name) {
        this.nameProperty().set(name);
    }

    public final IntegerProperty valueProperty() {
        return this.value;
    }

    public final int getValue() {
        return this.valueProperty().get();
    }

    public final void setValue(final int value) {
        this.valueProperty().set(value);
    }
    
    @Override
    public String toString() {
        return getName();
    }
}
