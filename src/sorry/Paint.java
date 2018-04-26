package sorry;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * @author Zixiao Shan
 *
 */
public class Paint extends Application {

	private Canvas canvas;
	private PlayerInter player1;
	private PlayerInter player2;
	private PlayerInter player3;
	private PlayerInter player4;


	public static void main(String[] args) {

		//launch the game 
		Application.launch(args);
	}
	
	public static void restart(String[] args) {

		//launch the game 
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// create a new canvas
		canvas = new Canvas();
		// format the canvas using css-style settings
		//player slides 
		player2 = new PlayerInter();
		player2.setStyle("-fx-background-color: lightgrey;-fx-border-color: black;");  

		player4 = new PlayerInter();
		player4.setStyle("-fx-background-color: lightgrey;-fx-border-color: black;");


		//gather the element to show
		BorderPane rootPane = new BorderPane();
		rootPane.setCenter(canvas);
		rootPane.setLeft(player2);
		//         rootPane.setLeft(player3);
		rootPane.setRight(player4);

		// main menu part 
		Button btn = new Button("      New Game     ");
		HBox btb1 = new HBox(btn);
		btb1.setMinHeight(60);
		//         btn.setMinWidth(40);
		btb1.setAlignment(Pos.CENTER);
		btn.setStyle(" -fx-text-fill: white;-fx-font: 20 arial;-fx-font-weight: bold;-fx-background-color: linear-gradient(#61a2b1, #2A5058);-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );-fx-min-width: 40;");
		Button btn2 = new Button("        Resume        ");
		HBox btb2 = new HBox(btn2);
		btb2.setMinHeight(60);
		//         btn2.setMinWidth(40);
		btb2.setAlignment(Pos.CENTER);
		btn2.setStyle(" -fx-text-fill: white;-fx-font: 20 arial;-fx-font-weight: bold;-fx-background-color: linear-gradient(#61a2b1, #2A5058);-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );-fx-min-width: 40;");
		Button btn3 = new Button("          Score          ");
		HBox btb3 = new HBox(btn3);
		btb3.setMinHeight(60);
		//         btn3.setMinWidth(40);
		btb3.setAlignment(Pos.CENTER);
		btn3.setStyle(" -fx-text-fill: white;-fx-font: 20 arial;-fx-font-weight: bold;-fx-background-color: linear-gradient(#61a2b1, #2A5058);-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );-fx-min-width: 40;");
		Scene scene = new Scene(rootPane); 

		Stage stage2 = new Stage();
		stage2.setScene(scene);
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				stage2.show();
				primaryStage.close();
			}});
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {



			}});
		btn3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {



			}});
		VBox buttonbox = new VBox(btb1,btb2,btb3);
		buttonbox.setMinWidth(800);
		buttonbox.setMinHeight(300);
		buttonbox.setAlignment(Pos.CENTER);
		Image image = new Image("https://i.imgur.com/iXR9O1H.png");
		Label label1 = new Label();
		label1.setMinWidth(800);
		label1.setMinHeight(40);
		label1.setAlignment(Pos.CENTER);
		label1.setGraphic(new ImageView(image));
		BorderPane Pane = new BorderPane();
		Pane.setStyle("-fx-background-color: #4472C4;");;
		Pane.setTop(label1);
		Pane.setBottom(buttonbox);


		Scene scene2 = new Scene(Pane);     

		primaryStage.setScene(scene2);
		primaryStage.show();
		primaryStage.setResizable(false);
		canvas.requestFocus();

	}

}