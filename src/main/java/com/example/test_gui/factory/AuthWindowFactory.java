package com.example.test_gui.factory;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public final class AuthWindowFactory {
    private AuthWindowFactory() {
    }

    public static Scene createLoginScene() throws IOException {
        FXMLLoader loader = new FXMLLoader(AuthWindowFactory.class.getResource("/com/example/test_gui/login-view.fxml"));
        return new Scene(loader.load(), 420, 300);
    }

    public static Scene createSignUpScene() throws IOException {
        FXMLLoader loader = new FXMLLoader(AuthWindowFactory.class.getResource("/com/example/test_gui/signup-view.fxml"));
        return new Scene(loader.load(), 420, 360);
    }
}
