package br.edu.nafa.Zoo.viewController;

import java.util.Optional;
import br.edu.nafa.Zoo.main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.TextInputDialog;

public class PrincipalController{
	
	private static final String SENHA = "123";
	private Main main;
	
	@FXML private void handleBaseDeDados() {
		TextInputDialog dialog = new TextInputDialog();
		dialog.setTitle("Senha");
		dialog.setHeaderText("Digite a senha cadastrada na classe");
		dialog.setContentText("Senha:");

		Optional<String> result = dialog.showAndWait();
		if (result.isPresent()){
			if (result.get().equals(SENHA)) {
				main.iniciarCadastroAnimal();
			} else {
				dialog.setHeaderText("Senha errada!");
			}
		}
	}
	
	@FXML private void handleInformacoes() {
		
	}
	
	public void setMainApp(Main main) {
		this.main = main;
	}
}
