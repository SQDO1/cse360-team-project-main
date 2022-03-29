package com.yummy.project.ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.text.FontWeight;



public class OrderPage implements Page {
    public Scene getScene() {

        //canvas to put the items on
        StackPane layout = new StackPane();

        //----CANCEL BUTTON----
        Button cancel = new Button("Cancel");
        cancel.relocate(675.0,375.0);
        cancel.setMaxHeight(200.0);
        cancel.setMaxWidth(200.0);
        cancel.setStyle("-fx-background-color: #F08080");
        cancel.setFont(new Font("SimSun",20));



        //----BACK BUTTON----
        Button back = new Button("Back");
        back.relocate(15.0,10.0);
        back.setMaxHeight(200.0);
        back.setMaxWidth(200.0);
        back.setFont(new Font("SimSun",20));
        back.setStyle("-fx-background-color: #778899");
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Main.setPage(new MenuPage());
            }
        });

        //----RECTANGLE 1----
        Rectangle rec = new Rectangle();
        rec.setX(130.0f);
        rec.setY(50.0f);
        rec.setWidth(730.0f);
        rec.setHeight(800.0f);
        rec.setArcWidth(10.0);
        rec.setArcHeight(10.0);
        rec.setFill(Color.WHITE);
        rec.setStrokeWidth(5.0);
        rec.setStroke(Color.LIGHTGREY);

        //----RECTANGLE 2----
        Rectangle rec2 = new Rectangle();
        rec2.setX(130.0f);
        rec2.setY(50.0f);
        rec2.setWidth(730.0f);
        rec2.setHeight(150.0f);
        rec2.setArcWidth(10.0);
        rec2.setArcHeight(10.0);
        rec2.setFill(Color.WHITE);
        rec2.setStrokeWidth(5.0);
        rec2.setStroke(Color.LIGHTGREY);

        //----RECTANGLE 3----
        Rectangle rec3 = new Rectangle();
        rec3.setX(180.0f);
        rec3.setY(280.0f);
        rec3.setWidth(630.0f);
        rec3.setHeight(150.0f);
        rec3.setArcWidth(10.0);
        rec3.setArcHeight(10.0);
        rec3.setFill(Color.WHITE);
        rec3.setStrokeWidth(5.0);
        rec3.setStroke(Color.LIGHTGREY);

        //----RECTANGLE 4----
        Rectangle rec4 = new Rectangle();
        rec4.setX(180.0f);
        rec4.setY(650.0f);
        rec4.setWidth(630.0f);
        rec4.setHeight(150.0f);
        rec4.setArcWidth(10.0);
        rec4.setArcHeight(10.0);
        rec4.setFill(Color.WHITE);
        rec4.setStrokeWidth(5.0);
        rec4.setStroke(Color.LIGHTGREY);

        //--- Order Header ---
        Text header = new Text(255, 150, "Yummy Orders");
        header.setFont(Font.font("SimSun", FontWeight.EXTRA_BOLD, 75));
        header.setFill(Color.BLACK);

        //--- Current Header ---
        Text header2 = new Text(170, 265, "Current Orders");
        header2.setFont(Font.font("SimSun", FontWeight.EXTRA_BOLD, 40));
        header2.setFill(Color.BLACK);

        //--- Previous Header ---
        Text header3 = new Text(170, 635, "Past Orders");
        header3.setFont(Font.font("SimSun", FontWeight.EXTRA_BOLD, 40));
        header3.setFill(Color.BLACK);


        //setting the Scene
        Group root = new Group(layout,back,rec,rec2,rec3,rec4,
                cancel,header,header2,header3);
        Scene scene = new Scene(root, 1000, 900,Color.MISTYROSE);

        return scene;
    }

    @Override
    public String getTitle() {
        return "Orders!";
    }
}
