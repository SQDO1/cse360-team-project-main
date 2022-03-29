package com.yummy.project.ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Checkout implements Page {

	public Scene getScene() {
		Pane rootPane = new Pane();
		
		int windowLength = 1100;
		int windowHeight = 630;
		
		Scene scene = new Scene(rootPane, windowLength, windowHeight);
		scene.setFill(Color.WHITE);
		
		//----MAIN COLOR ----
		Color mainColor = Color.MISTYROSE;
		
		//----PAGE TITLE ----
		Text title = new Text(windowLength / 40 ,100, "Checkout");
		title.setFont(Font.font ("SimSun", FontWeight.EXTRA_BOLD, 50));
		title.setFill(Color.BLACK);
		
		//---LEFT SIDE BUTTONS AND TEXT-----
		
		//edit orders
		Button editOrder = new Button("Edit Order");
		editOrder.relocate(50, 250);
		editOrder.setStyle("-fx-background-color: #F08080");
		editOrder.setFont(new Font("SimSun", 20));
		
		/*TODO: figure out what to do, right now. right now it just
		 * links back to the menu page*/
		editOrder.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				Main.setPage(new MenuPage());
			}
		});
		
		//-----DISPLAY OF ORDER
		
		
		
		//---- RIGHT SIDE BUTTONS ----
		
		// user info
		Button userInfo = new Button("User Info");
		userInfo.relocate(850, 300);
		userInfo.setStyle("-fx-background-color: #F08080");
		userInfo.setFont(new Font("SimSun", 20));
		
		userInfo.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				Main.setPage(new AccountPage());
			}
		});
			
		//payment info 
		/*TODO: need to figure out what to do with payment info button
		currently just sending back to account page.
		*/
		Button paymentInfo = new Button("Payment Info");
		paymentInfo.relocate(850, 400);
		paymentInfo.setStyle("-fx-background-color: #F08080");
		paymentInfo.setFont(new Font("SimSun", 20));
		
		paymentInfo.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				Main.setPage(new AccountPage());
			}
		});
		
		//----CONFIRM ORDER----
		/*TODO: configure what happens when i press this button*/
		Button confirmOrder = new Button("confirmOrder");
		confirmOrder.relocate(850, 500);
		confirmOrder.setStyle("-fx-background-color: #F08080");
		confirmOrder.setFont(new Font("SimSun", 20));
		
		confirmOrder.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				Main.setPage(new OrderPage());
			}
		});
		
		
		//---EXPECTED WAIT----
		
		
		
		//--- COUPON ---
		
		
		//----BACK BUTTON----
        	Button back = new Button("Back");
        	back.relocate(20, 20);
       		back.setStyle("-fx-background-color: #778899");
        	back.setFont(new Font("SimSun", 15));
        	// Go back to FrontPage when button is clicked
        	back.setOnAction(new EventHandler<ActionEvent>() {
            		@Override
            		public void handle(ActionEvent actionEvent) {Main.setPage(new MenuPage());}
        	});
		
		rootPane.getChildren().addAll(title, editOrder, userInfo, paymentInfo);
		rootPane.getChildren().addAll(confirmOrder);
		return scene;
	}
	@Override
	public String getTitle() {
		return "Checkout";
	}
}

	
