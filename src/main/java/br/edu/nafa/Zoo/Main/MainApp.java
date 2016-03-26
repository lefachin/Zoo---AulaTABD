package br.edu.nafa.Zoo.Main;

import java.io.IOException;

import br.edu.nafa.Zoo.model.Animal;
import br.edu.nafa.Zoo.viewController.CadastrarAnimaisControler;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * 
 * @author Natanael
 *
 */

// Classe inicia o tela..
// A tela vai ser o seguinte, do lado esquerdo tem o nome do animal. 
// Quando clicar no nome no lado direito vai ta as infomrações dele. Assim vai da pra alterar
// cadastrar e excluir tudo em uma tela so.

public class MainApp extends Application {
	
	private ObservableList<Animal> tabelaAnimal = FXCollections.observableArrayList();
	
	public MainApp() {
        tabelaAnimal.add(new Animal("Cavalo"));
    	
    }
	
	 public ObservableList<Animal> getPersonData() {
	        return tabelaAnimal;
	    }
    

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");

        initRootLayout();

        showPersonOverview();
    }

    /**
     * Inicializa o root layout (layout base).
     */
    public void initRootLayout() {
        try {
            // Carrega o root layout do arquivo fxml.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("../viewController/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Mostra a scene (cena) contendo oroot layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Mostra o person overview dentro do root layout.
     */
    public void showPersonOverview() {
    	try {
            // Carrega a person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("../viewController/AnimalOverview.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            // Define a person overview no centro do root layout.
            rootLayout.setCenter(personOverview);

            // Dá ao controlador acesso à the main app.
            CadastrarAnimaisControler controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Retorna o palco principal.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}