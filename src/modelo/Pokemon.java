package modelo;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Pokemon {
    private final SimpleStringProperty name;
    private final SimpleIntegerProperty number;
    private final SimpleStringProperty type;
    private final SimpleStringProperty imageUrl;

    public Pokemon(String name, int number, String type, String imageUrl) {
        this.name = new SimpleStringProperty(name);
        this.number = new SimpleIntegerProperty(number);
        this.type = new SimpleStringProperty(type);
        this.imageUrl = new SimpleStringProperty(imageUrl);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public int getNumber() {
        return number.get();
    }

    public SimpleIntegerProperty numberProperty() {
        return number;
    }

    public String getType() {
        return type.get();
    }

    public SimpleStringProperty typeProperty() {
        return type;
    }

    public String getImageUrl() {
        return imageUrl.get();
    }

    public SimpleStringProperty imageUrlProperty() {
        return imageUrl;
    }
}
