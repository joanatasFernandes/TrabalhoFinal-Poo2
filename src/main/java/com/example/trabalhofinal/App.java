package com.example.trabalhofinal;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

import com.example.trabalhofinal.authority.UsuarioAuthority;
import com.example.trabalhofinal.config.ResourceConfig;
import com.example.trabalhofinal.util.SceneUtil;

public class App extends Application {
	public static Stage mainStage = null;

	@Override
	public void start(Stage stage) throws IOException {
		UsuarioAuthority.init();
		SceneUtil.stage(stage, "login");
		stage.setTitle(ResourceConfig.bundle.getString("label.nome.aplicacao"));

		ImageView iconView = new ImageView(new Image("C://Users//Joanatas.Fernandes//Pictures//Saved Pictures//fimDeTarde.png"));

		stage.getIcons().add(iconView.getImage());
		stage.setMaximized(true);
		stage.show();
		mainStage = stage;
	}

	public static void main(String[] args) {
		launch();
	}
}
