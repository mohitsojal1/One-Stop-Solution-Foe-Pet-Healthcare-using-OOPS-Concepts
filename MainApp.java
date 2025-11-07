package com.petcare;

import com.petcare.ui.DashboardView;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) {
        new DashboardView(stage);
    }
    public static void main(String[] args) { launch(); }
}
