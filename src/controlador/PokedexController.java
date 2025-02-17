package controlador;

import modelo.Pokemon;
import api.PokemonAPI;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class PokedexController {

    @FXML
    private TableView<Pokemon> pokemonTable;
    @FXML
    private TableColumn<Pokemon, String> nameColumn;
    @FXML
    private TableColumn<Pokemon, Integer> numberColumn;
    @FXML
    private TableColumn<Pokemon, String> typeColumn;
    @FXML
    private TextArea descriptionArea;
    @FXML
    private ImageView pokemonImage;

    private ObservableList<Pokemon> pokemonData = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        numberColumn.setCellValueFactory(cellData -> cellData.getValue().numberProperty().asObject());
        typeColumn.setCellValueFactory(cellData -> cellData.getValue().typeProperty());

        // Fijar el tamaño de las columnas
        nameColumn.setPrefWidth(150);
        nameColumn.setResizable(false);


        numberColumn.setPrefWidth(150);
        numberColumn.setResizable(false);

        typeColumn.setPrefWidth(150);
        typeColumn.setResizable(false);

        pokemonTable.setItems(pokemonData);
        pokemonTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showPokemonDetails(newValue));

        loadPokemonData();
    }

    private void showPokemonDetails(Pokemon pokemon) {
        if (pokemon != null) {
            //texto lateral de los bichos.
            descriptionArea.setText("Nombre: " + pokemon.getName()
                    + "\nTipo: " + pokemon.getType()
                    + "\nHabilidades: " + pokemon.getAbilities()
                    + "\nAltura: " + (Double.parseDouble(pokemon.getHeight()) / 10) + " m"
                    + "\nPeso: " + (Double.parseDouble(pokemon.getWeight()) / 10) + " kg");
            pokemonImage.setImage(new Image(pokemon.getImageUrl()));
        } else {
            descriptionArea.setText("");
            pokemonImage.setImage(null);
        }
    }

    private void loadPokemonData() {
        CompletableFuture.runAsync(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    Pokemon pokemon = PokemonAPI.getPokemon(i);
                    javafx.application.Platform.runLater(() -> pokemonData.add(pokemon));
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
