package application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.*;


public class fx2 extends Application{
	Button btn;
	
	public static void main(String[]args) {
		launch(args);
	}
	
	public void start(Stage ps){
		ps.setTitle("JavaFX");
		btn = new Button();
		btn.setText("This is a button");
		btn.setAlignment(Pos.BOTTOM_LEFT);
		
		btn.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				Label lbl = new Label();
				lbl.setText("Surprise");
				
				StackPane pane2 = new StackPane();
				pane2.getChildren().add(lbl);
				Scene scene2 = new Scene(pane2,150,150);
				Stage stg = new Stage();
				stg.setTitle("JavaFX");
				stg.setScene(scene2);
				stg.show();
				
				
				
			}
			
		});
	

		StackPane pane = new StackPane();
		pane.getChildren().add(btn);	
		//pane.getChildren().add(button2);
		
		
		Scene scene =new Scene(pane, 300,300);
		ps.setScene(scene);
		ps.show();
	}

}