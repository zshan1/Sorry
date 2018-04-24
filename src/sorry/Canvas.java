package sorry;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Control;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Duration;
import sorry.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

/**
 * The canvas on which shapes will be drawn.
 * @author 
 *
 */
public class Canvas extends Pane {

	public ArrayList all_pegs;


	public Canvas() {

        try {
        	this.all_pegs=new ArrayList<>();
			this.InitComponents();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private int minute;
	private int hour;
	private int second;
	
    
	private void InitComponents() throws FileNotFoundException
    {
	 GridPane root = new GridPane();
     root.setPrefWidth(720);
     root.setPrefHeight(720);
     //root.setStyle("-fx-background-image: url('file:/Users/apple/Documents/GitHub/Sorry/src/board.png');"+
           //  "-fx-background-size: 720 720;"+"fx-background-position: center;");
     final int size = 16 ;
     for (int row = 0; row < size; row++) {
         for (int col = 0; col < size; col ++) {
             StackPane square = new StackPane();
            // square.setPadding(new Insets(0, 20, 0, 20));
             square.setPrefHeight(45);
             square.setPrefWidth(45);
             square.setBorder(new Border(new BorderStroke(Color.BLACK, 
                     BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
             
             root.add(square, col, row);
         }
     }
     for (int i = 0; i < size; i++) {
         root.getColumnConstraints().add(new ColumnConstraints(5, Control.USE_COMPUTED_SIZE, Double.POSITIVE_INFINITY, Priority.ALWAYS, HPos.CENTER, true));
         root.getRowConstraints().add(new RowConstraints(5, Control.USE_COMPUTED_SIZE, Double.POSITIVE_INFINITY, Priority.ALWAYS, VPos.CENTER, true));
     }
     
     
//     board board1 = new board();
//     sorry.pegs peg1 = new sorry.pegs();
//     sorry.pegs peg2 = new sorry.pegs();
//     sorry.pegs peg3 = new sorry.pegs();
//     sorry.pegs peg4 = new sorry.pegs();
//     board1.addPeg(peg1, 1, 15);
//	 board1.addPeg(peg2, 2, 15);
//	 board1.addPeg(peg3, 3, 15);
//	 board1.addPeg(peg4, 4, 15);
	 
     Image redpeg = new Image(new FileInputStream("/Users/apple/Documents/GitHub/Sorry/src/newred.png"));
     Label pegr1 = new Label();
     Label pegr2 = new Label();
     Label pegr3 = new Label();
     Label pegr4 = new Label();
     pegr1.setGraphic(new ImageView(redpeg));
     pegr2.setGraphic(new ImageView(redpeg));
     pegr3.setGraphic(new ImageView(redpeg));
     pegr4.setGraphic(new ImageView(redpeg));
     pegr1.setPrefHeight(20);
     pegr1.setPrefWidth(20);
     pegr2.setPrefHeight(20);
     pegr2.setPrefWidth(20);
     pegr3.setPrefHeight(20);
     pegr3.setPrefWidth(20);
     pegr4.setPrefHeight(20);
     pegr4.setPrefWidth(20);
     root.add(pegr1,  4,  1);
     root.add(pegr2,  4,  2);
     root.add(pegr3,  3,  2);
     root.add(pegr4,  5,  2);
     
     Image greenpeg = new Image(new FileInputStream("/Users/apple/Documents/GitHub/Sorry/src/newgreen.png"));
     Label pegg1 = new Label();
     Label pegg2 = new Label();
     Label pegg3 = new Label();
     Label pegg4 = new Label();
     pegg1.setGraphic(new ImageView(greenpeg));
     pegg2.setGraphic(new ImageView(greenpeg));
     pegg3.setGraphic(new ImageView(greenpeg));
     pegg4.setGraphic(new ImageView(greenpeg));
     pegg1.setPrefHeight(20);
     pegg1.setPrefWidth(20);
     pegg2.setPrefHeight(20);
     pegg2.setPrefWidth(20);
     pegg3.setPrefHeight(20);
     pegg3.setPrefWidth(20);
     pegg4.setPrefHeight(20);
     pegg4.setPrefWidth(20);
     root.add(pegg1,  2,  10);
     root.add(pegg2,  2,  11);
     root.add(pegg3,  1,  11);
     root.add(pegg4,  2,  12);
     
     Image bluepeg = new Image(new FileInputStream("/Users/apple/Documents/GitHub/Sorry/src/newblue.png"));
     Label pegb1 = new Label();
     Label pegb2 = new Label();
     Label pegb3 = new Label();
     Label pegb4 = new Label();
     pegb1.setGraphic(new ImageView(bluepeg));
     pegb2.setGraphic(new ImageView(bluepeg));
     pegb3.setGraphic(new ImageView(bluepeg));
     pegb4.setGraphic(new ImageView(bluepeg));
     pegb1.setPrefHeight(20);
     pegb1.setPrefWidth(20);
     pegb2.setPrefHeight(20);
     pegb2.setPrefWidth(20);
     pegb3.setPrefHeight(20);
     pegb3.setPrefWidth(20);
     pegb4.setPrefHeight(20);
     pegb4.setPrefWidth(20);
     root.add(pegb1,  13,  3);
     root.add(pegb2,  13,  4);
     root.add(pegb3,  13,  5);
     root.add(pegb4,  14,  4);
     
     Image yellowpeg = new Image(new FileInputStream("/Users/apple/Documents/GitHub/Sorry/src/newyellow.png"));
     Label pegy1 = new Label();
     Label pegy2 = new Label();
     Label pegy3 = new Label();
     Label pegy4 = new Label();
     pegy1.setGraphic(new ImageView(yellowpeg));
     pegy2.setGraphic(new ImageView(yellowpeg));
     pegy3.setGraphic(new ImageView(yellowpeg));
     pegy4.setGraphic(new ImageView(yellowpeg));
     pegy1.setPrefHeight(20);
     pegy1.setPrefWidth(20);
     pegy2.setPrefHeight(20);
     pegy2.setPrefWidth(20);
     pegy3.setPrefHeight(20);
     pegy3.setPrefWidth(20);
     pegy4.setPrefHeight(20);
     pegy4.setPrefWidth(20);
     root.add(pegy1,  11,  14);
     root.add(pegy2,  10,  13);
     root.add(pegy3,  12,  13);
     root.add(pegy4,  11,  13);
    
     
     root.setOnMouseClicked(evt -> {
         Node target = evt.getPickResult().getIntersectedNode();

         if (target != root) {
             // in your case you'd need to make sure this is not the Label
             Bounds bounds = target.getBoundsInParent();
             System.out.println("bounds = " +bounds);
             System.out.println("centerX = " +GridPane.getColumnIndex(target));
             System.out.println("centerY = " +GridPane.getRowIndex(target));
             //System.out.println(sorry.board.isEmpty(GridPane.getColumnIndex(target),GridPane.getRowIndex(target)));
			}      
     });
     
     deck d = new deck();
     Button draw = new Button("Draw a card");
     draw.setStyle(" -fx-text-fill: white;-fx-font: 20 arial;-fx-font-weight: bold;-fx-background-color: linear-gradient(#61a2b1, #2A5058);-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
     draw.setOnAction(new EventHandler<ActionEvent>() {

         @Override
         public void handle(ActionEvent event) {
             System.out.println("Hello World!");   
//				 try {
//					String name = d.draw();
//					Image card = new Image(new FileInputStream("/Users/apple/Documents/GitHub/Sorry/src/card"+name+".png"));
//					Label cardL = new Label();
//				    cardL.setGraphic(new ImageView(card));
//				    cardL.setPrefHeight(20);
//				    cardL.setPrefWidth(20);
//				    root.add(cardL,  9,  9);
//				} catch (FileNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}		     
                // card.setImage(null);
//			     System.out.print(d.draw());
             //d.printArray(sorry.deck.thedeck);
             if(sorry.deck.thedeck.length <= 0){
                 d.reset();
//                 String name = d.draw();
//				 Image card;
//					try {
//						card = new Image(new FileInputStream("/Users/apple/Documents/GitHub/Sorry/src/card"+name+".png"));
//						Label cardL = new Label();
//					    cardL.setGraphic(new ImageView(card));
//					    cardL.setPrefHeight(20);
//					    cardL.setPrefWidth(20);
//					    root.add(cardL,  9,  9);
//					} catch (FileNotFoundException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
             }
         //    board1.movePeg(peg1,d);
         }
     });

     Button menu = new Button("Menu");
     menu.setStyle(" -fx-text-fill: white;-fx-font: 20 arial;-fx-font-weight: bold;-fx-background-color: linear-gradient(#61a2b1, #2A5058);-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
     menu.setOnAction(new EventHandler<ActionEvent>() {

         @Override
         public void handle(ActionEvent event) {
        	 Alert alert = new Alert(Alert.AlertType.NONE);
        	 alert.setTitle("Sorry Game - Game Paused");
        	 Image image;
			try {
				image = new Image(new FileInputStream("/Users/apple/Documents/GitHub/Sorry/src/logo.png"));
				Label label1 = new Label();
				label1.setAlignment(Pos.CENTER);
	           	label1.setGraphic(new ImageView(image));
	        	alert.getDialogPane().setContent(label1);
	        	alert.getDialogPane().setStyle("-fx-background-color: #4472C4;");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			
        	 ButtonType btnType1 = new ButtonType("Save");
        	 ButtonType btnType2 = new ButtonType("Restart");
        	 ButtonType btnType3 = new ButtonType("Score");
        	 ButtonType btnType4 = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
        	 ButtonBar buttonBar = (ButtonBar)alert.getDialogPane().lookup(".button-bar");
        	    buttonBar.setStyle("-fx-font-size: 15px;"
        	            + "-fx-background-color: #4472C4;");
        	    buttonBar.getButtons().forEach(b->b.setStyle("-fx-font-family: \"Andalus\";"));
        	 alert.getButtonTypes().setAll(btnType1, btnType2, btnType3, btnType4);
        	 Optional result = alert.showAndWait();
        	 if (result.get() == btnType1) {
        		 System.out.println("Hello World!");
        	 } else if (result.get() == btnType2) {
        		 System.out.println("Hello World!");
        	 } else if (result.get() == btnType3) {
        		 System.out.println("Hello World!");
        	 } else {
        		 System.out.println("Cancel pressed");
        	 }
        	
         }
         
     });
     
     HBox hbox1 = new HBox(draw);
     hbox1.setAlignment(Pos.CENTER);
     HBox hbox2 = new HBox(menu);
     hbox2.setAlignment(Pos.CENTER);
     
     hbox1.setPrefWidth(360);
     hbox2.setPrefWidth(360);
     draw.setMinWidth(hbox1.getPrefWidth()-10);
     menu.setMinWidth(hbox2.getPrefWidth()-10);
     HBox hbox3 = new HBox(hbox1,hbox2);
     hbox3.setPrefHeight(60);
     draw.setMinHeight(hbox3.getPrefHeight()-10);
     menu.setMinHeight(hbox3.getPrefHeight()-10);
     
     Label timerLabel = new Label();
     Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {            
         Calendar cal = Calendar.getInstance();
         second = cal.get(Calendar.SECOND);
         minute = cal.get(Calendar.MINUTE);
         hour = cal.get(Calendar.HOUR);
         //System.out.println(hour + ":" + (minute) + ":" + second);
         timerLabel.setText("Current time: "+ hour + ":" + (minute) + ":" + second);
     }),
          new KeyFrame(Duration.seconds(1))
     );
     clock.setCycleCount(Animation.INDEFINITE);
     clock.play();
     timerLabel.setFont(Font.font ("Verdana", FontWeight.BOLD, 14));
     HBox hbox4 = new HBox(timerLabel);
     hbox4.setPrefHeight(20);
     hbox4.setAlignment(Pos.CENTER);
     VBox vbox1 = new VBox(root, hbox3,hbox4);
     this.getChildren().addAll(vbox1);
    }


	/**
	 * Set up key pressed events. Fill in the key handler to manipulate the shapes on the screen.
	 */
		
		//System.out.println("Keys set up")
}
