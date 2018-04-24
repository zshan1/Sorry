package sorry;

import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * you can contact me directly at q,q five,three,two,four,one
 * four,one,zero,three if any problem
 */
public class Paint extends Application {
	
	private Canvas canvas;
	private PlayerInter player1;
	private PlayerInter player2;
	private PlayerInter player3;
	private PlayerInter player4;

    /**
     * Launches the application.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    /**
     * Starts the application, setting up the canvas and palette and arranging them on the screen.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        canvas = new Canvas();
        // format the canvas using css-style settings

        player2 = new PlayerInter();
        player2.setStyle("-fx-background-color: lightgrey;-fx-border-color: black;");  
        
        player4 = new PlayerInter();
        player4.setStyle("-fx-background-color: lightgrey;-fx-border-color: black;");
        
       
        
        BorderPane rootPane = new BorderPane();
        rootPane.setCenter(canvas);
        rootPane.setLeft(player2);
//        rootPane.setLeft(player3);
        rootPane.setRight(player4);
        
        
        Scene scene = new Scene(rootPane);
                
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
        canvas.requestFocus();
    	
    }
    
}