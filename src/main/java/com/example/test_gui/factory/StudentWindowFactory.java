package com.example.test_gui.factory;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public final class StudentWindowFactory {
    private StudentWindowFactory() {
    }

    public static Scene createScene() throws IOException {
        FXMLLoader loader = new FXMLLoader(StudentWindowFactory.class.getResource("/com/example/test_gui/student-view.fxml"));
        return new Scene(loader.load(), 1180, 720);
    }
}
