public class Pokemon {
    private String name;
    private int number;
    private String type;
    private String description;

    public Pokemon(String name, int number, String type, String description) {
        this.name = name;
        this.number = number;
        this.type = type;
        this.description = description;
    }

    // Getters y setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
