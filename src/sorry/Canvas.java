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
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Control;
import javafx.scene.control.Dialog;
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
import javafx.stage.Modality;
import javafx.util.Duration;
import javafx.util.Pair;
import sorry.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

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
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Control;
import javafx.scene.control.Dialog;
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
import javafx.stage.Modality;
import javafx.util.Duration;
import javafx.util.Pair;
import sorry.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

/**
 * The canvas on which shapes will be drawn.
 *
 * @author
 *
 */
public class Canvas extends Pane {

	public ArrayList all_pegs;

	public Canvas() {

		try {
			this.all_pegs = new ArrayList<>();
			this.InitComponents();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private int minute;
	private int hour;
	private int second;
	private boolean isa;
	private boolean isb;
	private boolean isc;
	private boolean isd; 

	//	public void hardNice(board b, deck d) {
	//        if (b.getTurn() == 2 && player2()[1].getdifficulty() == "hard" && player2()[1].getbehavior() == "nice") {
	////            b.movePeg(player2()[0], move);
	////            b.setBumpcheck(true);
	////            System.out.println(b.getBumpCheck());
	//
	//            for (int i = 0; i < player2().length; i++) {
	//                if (b.getNiceMove() <= 0) {
	//                    b.movePeg(player2()[i], d.getDrawnCard().getVal(), true);
	//                    setComputerPeg(player2()[i]);
	//                    //b.setNiceMove(0);
	//                }
	//
	//            }
	//            b.setNiceMove(0);
	//            //if (b.getBumpCheck()==true)
	//        }
	//    }

	private void InitComponents() throws FileNotFoundException {
		GridPane root = new GridPane();
		root.setPrefWidth(720);
		root.setPrefHeight(720);
		root.setStyle("-fx-background-image: url('https://i.imgur.com/CSFYsaE.png');"
				+ "-fx-background-size: 720 720;" + "fx-background-position: center;");
		final int size = 16;
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				StackPane square = new StackPane();
				// square.setPadding(new Insets(0, 20, 0, 20));
				square.setPrefHeight(45);
				square.setPrefWidth(45);
				//				square.setBorder(new Border(new BorderStroke(Color.BLACK,
				//						BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

				root.add(square, col, row);
			}
		}
		for (int i = 0; i < size; i++) {
			root.getColumnConstraints().add(new ColumnConstraints(5, Control.USE_COMPUTED_SIZE, Double.POSITIVE_INFINITY, Priority.ALWAYS, HPos.CENTER, true));
			root.getRowConstraints().add(new RowConstraints(5, Control.USE_COMPUTED_SIZE, Double.POSITIVE_INFINITY, Priority.ALWAYS, VPos.CENTER, true));
		}

		board board1 = new board();
		//     sorry.pegs peg1 = new sorry.pegs();
		//     sorry.pegs peg2 = new sorry.pegs();
		//     sorry.pegs peg3 = new sorry.pegs();
		//     sorry.pegs peg4 = new sorry.pegs();
		//     board1.addPeg(peg1, 1, 15);
		//	 board1.addPeg(peg2, 2, 15);
		//	 board1.addPeg(peg3, 3, 15);
		//	 board1.addPeg(peg4, 4, 15);

		Players plyrs1 = new Players();
		String choice = "blue";
		plyrs1.colorChoice(choice);
		plyrs1.p1Init(board1, choice);
		plyrs1.p2Init(board1, "hard", "mean", choice);
		plyrs1.p3Init(board1, "hard", "mean", choice);
		plyrs1.p4Init(board1, "hard", "mean", choice);

		Image redpeg = new Image("https://i.imgur.com/Z63apU2.png");
		Label pegr1 = new Label();
		Label pegr2 = new Label();
		Label pegr3 = new Label();
		Label pegr4 = new Label();
		pegr1.setPrefHeight(20);
		pegr1.setPrefWidth(20);
		pegr2.setPrefHeight(20);
		pegr2.setPrefWidth(20);
		pegr3.setPrefHeight(20);
		pegr3.setPrefWidth(20);
		pegr4.setPrefHeight(20);
		pegr4.setPrefWidth(20);
		pegr1.setGraphic(new ImageView(redpeg));
		pegr2.setGraphic(new ImageView(redpeg));
		pegr3.setGraphic(new ImageView(redpeg));
		pegr4.setGraphic(new ImageView(redpeg));

		Image greenpeg = new Image("https://i.imgur.com/5QSltjY.png");
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

		Image bluepeg = new Image("https://i.imgur.com/OStJya1.png");
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


		Image yellowpeg = new Image("https://i.imgur.com/KoRrrmk.png");
		Label pegy1 = new Label();
		Label pegy2 = new Label();
		Label pegy3 = new Label();
		Label pegy4 = new Label();
		pegy1.setGraphic(new ImageView(yellowpeg));
		pegy2.setGraphic(new ImageView(yellowpeg));
		pegy3.setGraphic(new ImageView(yellowpeg));
		pegy4.setGraphic(new ImageView(yellowpeg));
		pegy1.setMinHeight(20);
		pegy1.setPrefWidth(20);
		pegy2.setPrefHeight(20);
		pegy2.setPrefWidth(20);
		pegy3.setPrefHeight(20);
		pegy3.setPrefWidth(20);
		pegy4.setPrefHeight(20);
		pegy4.setPrefWidth(20);

		if (choice == "blue") {
			root.add(pegb1, plyrs1.peg1.getY(), plyrs1.peg1.getX());
			root.add(pegb2, plyrs1.peg2.getY(), plyrs1.peg2.getX());
			root.add(pegb3, plyrs1.peg3.getY(), plyrs1.peg3.getX());
			root.add(pegb4, plyrs1.peg4.getY(), plyrs1.peg4.getX());

			root.add(pegy1, plyrs1.peg5.getY(), plyrs1.peg5.getX());			
			root.add(pegy2, plyrs1.peg6.getY(), plyrs1.peg6.getX());			
			root.add(pegy3, plyrs1.peg7.getY(), plyrs1.peg7.getX());			
			root.add(pegy4, plyrs1.peg8.getY(), plyrs1.peg8.getX());			
			plyrs1.peg5.setGpeg(pegy1);
			plyrs1.peg6.setGpeg(pegy2);
			plyrs1.peg7.setGpeg(pegy3);
			plyrs1.peg8.setGpeg(pegy4);

			root.add(pegg1, plyrs1.peg9.getY(), plyrs1.peg9.getX());
			root.add(pegg2, plyrs1.peg10.getY(), plyrs1.peg10.getX());
			root.add(pegg3, plyrs1.peg11.getY(), plyrs1.peg11.getX());
			root.add(pegg4, plyrs1.peg12.getY(), plyrs1.peg12.getX());
			plyrs1.peg9.setGpeg(pegg1);
			plyrs1.peg10.setGpeg(pegg2);
			plyrs1.peg11.setGpeg(pegg3);
			plyrs1.peg12.setGpeg(pegg4);

			root.add(pegr1, plyrs1.peg13.getY(), plyrs1.peg13.getX());
			root.add(pegr2, plyrs1.peg14.getY(), plyrs1.peg14.getX());
			root.add(pegr3, plyrs1.peg15.getY(), plyrs1.peg15.getX());
			root.add(pegr4, plyrs1.peg16.getY(), plyrs1.peg16.getX());
			plyrs1.peg13.setGpeg(pegr1);
			plyrs1.peg14.setGpeg(pegr2);
			plyrs1.peg15.setGpeg(pegr3);
			plyrs1.peg16.setGpeg(pegr4);


		} else if (choice == "red") {
			root.add(pegr1, plyrs1.peg1.getY(), plyrs1.peg1.getX());
			root.add(pegr2, plyrs1.peg2.getY(), plyrs1.peg2.getX());
			root.add(pegr3, plyrs1.peg3.getY(), plyrs1.peg3.getX());
			root.add(pegr4, plyrs1.peg4.getY(), plyrs1.peg4.getX());

			root.add(pegy1, plyrs1.peg5.getY(), plyrs1.peg5.getX());
			root.add(pegy2, plyrs1.peg6.getY(), plyrs1.peg6.getX());
			root.add(pegy3, plyrs1.peg7.getY(), plyrs1.peg7.getX());
			root.add(pegy4, plyrs1.peg8.getY(), plyrs1.peg8.getX());

			root.add(pegg1, plyrs1.peg9.getY(), plyrs1.peg9.getX());
			root.add(pegg2, plyrs1.peg10.getY(), plyrs1.peg10.getX());
			root.add(pegg3, plyrs1.peg11.getY(), plyrs1.peg11.getX());
			root.add(pegg4, plyrs1.peg12.getY(), plyrs1.peg12.getX());

			root.add(pegb1, plyrs1.peg13.getY(), plyrs1.peg13.getX());
			root.add(pegb2, plyrs1.peg14.getY(), plyrs1.peg14.getX());
			root.add(pegb3, plyrs1.peg15.getY(), plyrs1.peg15.getX());
			root.add(pegb4, plyrs1.peg16.getY(), plyrs1.peg16.getX());
		} else if (choice == "green") {
			root.add(pegg1, plyrs1.peg1.getY(), plyrs1.peg1.getX());
			root.add(pegg2, plyrs1.peg2.getY(), plyrs1.peg2.getX());
			root.add(pegg3, plyrs1.peg3.getY(), plyrs1.peg3.getX());
			root.add(pegg4, plyrs1.peg4.getY(), plyrs1.peg4.getX());

			root.add(pegy1, plyrs1.peg5.getY(), plyrs1.peg5.getX());
			root.add(pegy2, plyrs1.peg6.getY(), plyrs1.peg6.getX());
			root.add(pegy3, plyrs1.peg7.getY(), plyrs1.peg7.getX());
			root.add(pegy4, plyrs1.peg8.getY(), plyrs1.peg8.getX());

			root.add(pegr1, plyrs1.peg9.getY(), plyrs1.peg9.getX());
			root.add(pegr2, plyrs1.peg10.getY(), plyrs1.peg10.getX());
			root.add(pegr3, plyrs1.peg11.getY(), plyrs1.peg11.getX());
			root.add(pegr4, plyrs1.peg12.getY(), plyrs1.peg12.getX());

			root.add(pegb1, plyrs1.peg13.getY(), plyrs1.peg13.getX());
			root.add(pegb2, plyrs1.peg14.getY(), plyrs1.peg14.getX());
			root.add(pegb3, plyrs1.peg15.getY(), plyrs1.peg15.getX());
			root.add(pegb4, plyrs1.peg16.getY(), plyrs1.peg16.getX());
		} else {
			root.add(pegy1, plyrs1.peg1.getY(), plyrs1.peg1.getX());
			root.add(pegy2, plyrs1.peg2.getY(), plyrs1.peg2.getX());
			root.add(pegy3, plyrs1.peg3.getY(), plyrs1.peg3.getX());
			root.add(pegy4, plyrs1.peg4.getY(), plyrs1.peg4.getX());

			root.add(pegg1, plyrs1.peg5.getY(), plyrs1.peg5.getX());
			root.add(pegg2, plyrs1.peg6.getY(), plyrs1.peg6.getX());
			root.add(pegg3, plyrs1.peg7.getY(), plyrs1.peg7.getX());
			root.add(pegg4, plyrs1.peg8.getY(), plyrs1.peg8.getX());

			root.add(pegr1, plyrs1.peg9.getY(), plyrs1.peg9.getX());
			root.add(pegr2, plyrs1.peg10.getY(), plyrs1.peg10.getX());
			root.add(pegr3, plyrs1.peg11.getY(), plyrs1.peg11.getX());
			root.add(pegr4, plyrs1.peg12.getY(), plyrs1.peg12.getX());

			root.add(pegb1, plyrs1.peg13.getY(), plyrs1.peg13.getX());
			root.add(pegb2, plyrs1.peg14.getY(), plyrs1.peg14.getX());
			root.add(pegb3, plyrs1.peg15.getY(), plyrs1.peg15.getX());
			root.add(pegb4, plyrs1.peg16.getY(), plyrs1.peg16.getX());
		}
		//        root.setOnMouseClicked(evt -> {
		//            Node target = evt.getPickResult().getIntersectedNode();
		//
		//            if (target != root) {
		//                // in your case you'd need to make sure this is not the Label
		//                Bounds bounds = target.getBoundsInParent();
		//                System.out.println("bounds = " + bounds);
		//                System.out.println("centerX = " + GridPane.getColumnIndex(target));
		//                System.out.println("centerY = " + GridPane.getRowIndex(target));
		//                //System.out.println(sorry.board.isEmpty(GridPane.getColumnIndex(target),GridPane.getRowIndex(target)));
		//            }
		//        });
		deck d = new deck();
		board1.setTurn(1);
		Button draw = new Button("Draw a card");
		draw.setStyle(" -fx-text-fill: white;-fx-font: 20 arial;-fx-font-weight: bold;-fx-background-color: linear-gradient(#61a2b1, #2A5058);-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
		draw.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello World!");
				Dialog<Pair<String, String>> dialog = new Dialog<>();
				dialog.initModality(Modality.APPLICATION_MODAL);
				dialog.setTitle("Sorry Game - Game Paused");

				String card = d.draw();   
				String c1 = "https://i.imgur.com/6gVHiZU.png";
				String c2 = "https://i.imgur.com/r681E0F.png";
				String c3 = "https://i.imgur.com/80Xd275.png";
				String c4 = "https://i.imgur.com/ZG4XBkt.png";
				String c5 = "https://i.imgur.com/W2zPspO.png";
				String c7 = "https://i.imgur.com/gpsqsaZ.png";
				String c8 = "https://i.imgur.com/RWkTvnb.png";
				String c10 = "https://i.imgur.com/CXEzQvO.png";
				String c11 = "https://i.imgur.com/yMh5NXL.png";
				String c12 = "https://i.imgur.com/tRbNrC9.png";
				String c13 = "https://i.imgur.com/XmVOZHZ.png";

				Image image = null;
				if (card =="1"){
					image = new Image(c1);
				}
				else if(card =="2"){
					image = new Image(c2);
				}
				else if(card =="3"){
					image = new Image(c3);
				}
				else if(card =="4"){
					image = new Image(c4);
				}
				else if(card =="5"){
					image = new Image(c5);
				}
				else if(card =="7"){
					image = new Image(c7);
				}
				else if(card =="8"){
					image = new Image(c8);
				}
				else if(card =="10"){
					image = new Image(c10);
				}
				else if(card =="11"){
					image = new Image(c11);
				}
				else if(card =="12"){
					image = new Image(c12);
				}
				else if(card =="Sorry"){
					image = new Image(c13);
				}

				//image = new Image(new FileInputStream("/Users/apple/Documents/Sorry/src/card" + card + ".png"));
				System.out.println(card);
				Label label1 = new Label();
				label1.setAlignment(Pos.CENTER);
				//				System.out.println( board1.isStart(plyrs1.getPeg1()));
				//				System.out.println(plyrs1.getPeg1().getColor());
				label1.setGraphic(new ImageView(image));
				dialog.getDialogPane().setContent(label1);
				dialog.getDialogPane().setStyle("-fx-background-color: #4472C4;");
				if (sorry.deck.thedeck.length <= 0) {
					d.reset();
				}
				if (board1.getTurn() == 1) {
					ButtonType btnType1 = new ButtonType("Peg 1");
					ButtonType btnType2 = new ButtonType("Peg 2");
					ButtonType btnType3 = new ButtonType("Peg 3");
					ButtonType btnType4 = new ButtonType("Peg 4");
					ButtonType btnType5 = new ButtonType("Confirm Move");
					ButtonBar buttonBar = (ButtonBar) dialog.getDialogPane().lookup(".button-bar");
					buttonBar.setStyle("-fx-font-size: 15px;"
							+ "-fx-background-color: #4472C4;");
					buttonBar.getButtons().forEach(b -> b.setStyle("-fx-font-family: \"Andalus\";"));
					dialog.getDialogPane().getButtonTypes().setAll(btnType1, btnType2, btnType3, btnType4, btnType5);
					Optional result = dialog.showAndWait();
					if (result.get() == btnType1) {
						if(card == "1" | card == "2"){                        
							if(board1.isStart(plyrs1.getPeg1())){
								root.getChildren().remove(pegb1);
								board1.start(plyrs1.getPeg1());
								root.add(pegb1, plyrs1.peg1.getY(), plyrs1.peg1.getX());
								System.out.println("1 & move");
								plyrs1.easyNice(board1,d);
								plyrs1.hardNice(board1,d);
								plyrs1.hardMean(board1,d);
								plyrs1.easyMean(board1,d);
								System.out.println("array length:"+plyrs1.getPeg5());
								if(plyrs1.getPeg5()!=null){
									root.getChildren().remove(plyrs1.getComputerPeg().getGpeg());
									root.add(plyrs1.getComputerPeg().getGpeg(), plyrs1.getComputerPeg().getY(), plyrs1.getComputerPeg().getX());
								}
							}else{
								root.getChildren().remove(pegb1);
								board1.movePeg(plyrs1.getPeg1(), d);
								root.add(pegb1, plyrs1.peg1.getY(), plyrs1.peg1.getX());
								System.out.println("other & move");
							}
						}else{
							root.getChildren().remove(pegb1);
							board1.movePeg(plyrs1.getPeg1(), d);
							root.add(pegb1, plyrs1.peg1.getY(), plyrs1.peg1.getX());
							System.out.println("other & move");
						}
					}
					else if (result.get() == btnType2) {
						if(card == "1" | card == "2"){
							if(board1.isStart(plyrs1.getPeg2())){
								root.getChildren().remove(pegb2);
								board1.start(plyrs1.getPeg2());
								root.add(pegb1, plyrs1.peg2.getY(), plyrs1.peg2.getX());
								System.out.println("1 & move");
							}else{
								root.getChildren().remove(pegb2);
								board1.movePeg(plyrs1.getPeg1(), d);
								root.add(pegb1, plyrs1.peg2.getY(), plyrs1.peg2.getX());
								System.out.println("other & move");
							}
						}else{
							root.getChildren().remove(pegb2);
							board1.movePeg(plyrs1.getPeg2(), d);
							root.add(pegb2, plyrs1.peg2.getY(), plyrs1.peg2.getX());
							System.out.println("other & move");
						}
					}else if (result.get() == btnType3) {
						if(card == "1" | card == "2"){                        
							if(board1.isStart(plyrs1.getPeg3())){
								root.getChildren().remove(pegb3);
								board1.start(plyrs1.getPeg3());
								root.add(pegb3, plyrs1.peg3.getY(), plyrs1.peg3.getX());
								System.out.println("1 & move");
							}else{
								root.getChildren().remove(pegb3);
								board1.movePeg(plyrs1.getPeg3(), d);
								root.add(pegb3, plyrs1.peg3.getY(), plyrs1.peg3.getX());
								System.out.println("other & move");
							}
						}else{
							root.getChildren().remove(pegb3);
							board1.movePeg(plyrs1.getPeg3(), d);
							root.add(pegb3, plyrs1.peg3.getY(), plyrs1.peg3.getX());
							System.out.println("other & move");
						}
					}else if (result.get() == btnType4) {
						if(card == "1" | card == "2"){                        
							if(board1.isStart(plyrs1.getPeg4())){
								root.getChildren().remove(pegb4);
								board1.start(plyrs1.getPeg4());
								root.add(pegb1, plyrs1.peg4.getY(), plyrs1.peg4.getX());
								System.out.println("1 & move");
							}else{
								root.getChildren().remove(pegb4);
								board1.movePeg(plyrs1.getPeg4(), d);
								root.add(pegb4, plyrs1.peg4.getY(), plyrs1.peg4.getX());
								System.out.println("other & move");
							}
						}else{
							root.getChildren().remove(pegb1);
							board1.movePeg(plyrs1.getPeg4(), d);
							root.add(pegb1, plyrs1.peg4.getY(), plyrs1.peg4.getX());
							System.out.println("other & move");
						}
					}
				}
			}
			// board1.movePeg(peg1,d);

		});

		Button menu = new Button("Menu");
		menu.setStyle(" -fx-text-fill: white;-fx-font: 20 arial;-fx-font-weight: bold;-fx-background-color: linear-gradient(#61a2b1, #2A5058);-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
		menu.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Alert alert = new Alert(Alert.AlertType.NONE);
				alert.setTitle("Sorry Game - Game Paused");
				Image image;

				image = new Image("https://i.imgur.com/zRnPAOA.png");
				Label label1 = new Label();
				label1.setAlignment(Pos.CENTER);
				label1.setGraphic(new ImageView(image));
				alert.getDialogPane().setContent(label1);
				alert.getDialogPane().setStyle("-fx-background-color: #4472C4;");


				ButtonType btnType1 = new ButtonType("Save");
				ButtonType btnType2 = new ButtonType("Restart");
				ButtonType btnType3 = new ButtonType("Score");
				ButtonType btnType4 = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
				ButtonBar buttonBar = (ButtonBar) alert.getDialogPane().lookup(".button-bar");
				buttonBar.setStyle("-fx-font-size: 15px;"
						+ "-fx-background-color: #4472C4;");
				buttonBar.getButtons().forEach(b -> b.setStyle("-fx-font-family: \"Andalus\";"));
				alert.getButtonTypes().setAll(btnType1, btnType2, btnType3, btnType4);
				Optional result = alert.showAndWait();
				
					 String playerName = "maddie";
			    String dayTime = "4262018";
			    String mode = "1v3";
			    String resultnew = "win";
				if (result.get() == btnType1) {
						try {
							Connection mysqlConn = MysqlConnect.myConnect();
							Statement st;
							st = mysqlConn.createStatement();
							st.executeUpdate("INSERT INTO savedata (playerName,dayTime,mode,difficulty,behavior,color,result) VALUES ( '" + playerName + "', '" + dayTime + "', '" + mode + "', '"
									+ difficulty + "','" + behavior + "','" + choice + "','" + resultnew + "');");

						} catch (Exception e) {
							System.err.println("Got an exception! ");
							System.err.println(e.getMessage());
						}
					

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
		draw.setMinWidth(hbox1.getPrefWidth() - 10);
		menu.setMinWidth(hbox2.getPrefWidth() - 10);
		HBox hbox3 = new HBox(hbox1, hbox2);
		hbox3.setPrefHeight(60);
		draw.setMinHeight(hbox3.getPrefHeight() - 10);
		menu.setMinHeight(hbox3.getPrefHeight() - 10);

		Label timerLabel = new Label();
		Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
			Calendar cal = Calendar.getInstance();
			second = cal.get(Calendar.SECOND);
			minute = cal.get(Calendar.MINUTE);
			hour = cal.get(Calendar.HOUR);
			//System.out.println(hour + ":" + (minute) + ":" + second);
			timerLabel.setText("Current time: " + hour + ":" + (minute) + ":" + second);
		}),
				new KeyFrame(Duration.seconds(1))
				);
		clock.setCycleCount(Animation.INDEFINITE);
		clock.play();
		timerLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 14));
		HBox hbox4 = new HBox(timerLabel);
		hbox4.setPrefHeight(20);
		hbox4.setAlignment(Pos.CENTER);
		VBox vbox1 = new VBox(root, hbox3, hbox4);
		this.getChildren().addAll(vbox1);
	}
}
