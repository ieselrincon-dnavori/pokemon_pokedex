package modelo;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Pokemon {
    private final SimpleStringProperty name;
    private final SimpleIntegerProperty number;
    private final SimpleStringProperty type;
    private final SimpleStringProperty imageUrl;
    private final SimpleStringProperty abilities;
    private final SimpleStringProperty height;
    private final SimpleStringProperty weight;

    public Pokemon(String name, int number, String type, String imageUrl, String abilities, String height, String weight) {
        this.name = new SimpleStringProperty(name);
        this.number = new SimpleIntegerProperty(number);
        this.type = new SimpleStringProperty(type);
        this.imageUrl = new SimpleStringProperty(imageUrl);
        this.abilities = new SimpleStringProperty(abilities);
        this.height = new SimpleStringProperty(height);
        this.weight = new SimpleStringProperty(weight);
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

    public String getAbilities() {
        return abilities.get();
    }

    public SimpleStringProperty abilitiesProperty() {
        return abilities;
    }

    public String getHeight() {
        return height.get();
    }

    public SimpleStringProperty heightProperty() {
        return height;
    }

    public String getWeight() {
        return weight.get();
    }

    public SimpleStringProperty weightProperty() {
        return weight;
    }
}
