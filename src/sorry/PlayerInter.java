package sorry;

import Interfaces.Drawable;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.event.*;
import sorry.*;
import javafx.scene.shape.*;


/**
 * @author Zixiao Shan
 *
 */
public class PlayerInter extends VBox {


	public static ColorPicker cp_palette;
	public static Boolean mode_shape_choose=false;
	public static Color canvas_color;


	public PlayerInter() {
		// basic settings 
		super(10);
		this.setPadding(new Insets(20,20,700,20));
		this.InitComponents();
	}

	private void InitComponents()
	{
		//player information field
		final Text text=new Text("Player");
		final Text text2=new Text("Score: 0 ");
		text.setFont(Font.font ("Verdana", FontWeight.BOLD,14));
		text.setFill(Color.WHITE);
		text2.setFont(Font.font ("Verdana", FontWeight.BOLD,14));
		text2.setFill(Color.WHITE);

		VBox vbox1 = new VBox(text, text2);
		vbox1.setPadding(new Insets(20,20,350,20));
		final Text text3=new Text("Player");
		final Text text4=new Text("Score: 0");
		text3.setFont(Font.font ("Verdana", FontWeight.BOLD,14));
		text3.setFill(Color.WHITE);
		text4.setFont(Font.font ("Verdana", FontWeight.BOLD,14));
		text4.setFill(Color.WHITE);
		//add the player information field to paint
		VBox vbox2 = new VBox(text3, text4);
		vbox2.setPadding(new Insets(20,20,350,20));
		this.getChildren().addAll(vbox1,vbox2);
	}

}
