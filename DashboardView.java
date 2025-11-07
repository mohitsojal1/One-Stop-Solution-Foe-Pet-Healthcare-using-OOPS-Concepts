package com.petcare.ui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DashboardView {
    private final Stage stage;
    public DashboardView(Stage stage){ this.stage=stage; showHome(); }
    private VBox sidebar(){
        VBox box=new VBox(12);
        box.setPadding(new Insets(20));
        box.setStyle("-fx-background-color:#FFE9F0;");
        box.setPrefWidth(180);
        Button home=new Button("🏠 Home");
        style(home);
        home.setOnAction(e->showHome());
        box.getChildren().add(home);
        return box;
    }
    private void style(Button b){
        b.setPrefWidth(160);
        b.setStyle("-fx-background-color:#FFC1CC;-fx-font-size:14px;-fx-background-radius:12;");
    }
    public void showHome(){
        BorderPane root=new BorderPane();
        root.setLeft(sidebar());
        Label title=new Label("🐾 One Stop Solution for Pet Health Care 🐾");
        title.setStyle("-fx-font-size:22px;-fx-font-weight:bold;-fx-text-fill:#333;");
        VBox box=new VBox(title);
        box.setAlignment(Pos.CENTER);
        root.setCenter(box);
        Scene scene=new Scene(root,800,500);
        stage.setScene(scene);
        stage.setTitle("Pet Health Care");
        stage.show();
    }
}
