package br.edu.nafa.Zoo.viewController;

import br.edu.nafa.Zoo.Main.MainApp;
import br.edu.nafa.Zoo.model.Animal;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * 
 * @author Natanael
 *
 */

public class CadastrarAnimaisControler {
	
	 	@FXML
	    private TableView<Animal> animalTable;
	    @FXML
	    private TableColumn<Animal, String> colunaNome;
	    @FXML
	    private TableColumn<Animal, String> colunaEspecieVulgar;
	    @FXML
	    private TableColumn<Animal, String> colunaEspecieCientifica;
	    @FXML
	    private TableColumn<Animal, String> colunaGenero;
	    @FXML
	    private TableColumn<Animal, String> colunaColoracao;
	    @FXML
	    private TableColumn<Animal, Float> peso;
	    @FXML
	    private TableColumn<Animal, Float> comprimentoTotal;
	    
	    @FXML
	    private Label nomeAnimal;
	    @FXML
	    private Label subspecieVulgar;
	    @FXML
	    private Label subspecieCientifica;
	    @FXML
	    private Label genero;
	    @FXML
	    private Label coloracao;
	    @FXML
	    private Label pesoLabel;
	    @FXML
	    private Label comprimento;
	    
	    private MainApp mainApp;
	    
	    public CadastrarAnimaisControler() {
	    }
	    
	    @FXML
	    private void initialize() {
	        // Inicializa a tablea de pessoa com duas colunas.
	        colunaNome.setCellValueFactory(cellData -> cellData.getValue().nomePropety());
	  
	    }
	    
	    public void setMainApp(MainApp mainApp) {
	        this.mainApp = mainApp;

	        // Adiciona os dados da observable list na tabela
	        animalTable.setItems(mainApp.getPersonData());
	    }
	    
	    @FXML
	    private void handleDeletar() {
	         // botao deletar
	        }
	    
	    @FXML
	    private void handleEditar() {
	         // botao editar
	        }
	    @FXML
	    private void handleNovo() {
	         // botao cadastrar
	        }
}
