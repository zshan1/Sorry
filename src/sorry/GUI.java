import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.*;
import java.net.URL;
import javax.imageio.ImageIO;

public class GUI {

	private final JPanel gui = new JPanel(new BorderLayout(50, 50));
	private JButton[][] gameBoardSquares = new JButton[16][16];
	private Image[][] gamePieceImages = new Image[1][5];
	private JPanel gameBoard;
	private final JLabel message = new JLabel("Welcome to Sorry!");
	public static final int WHITE = 1;
	private JPanel drawCardPane, displayCardPane;
	private JButton drawCardBtn;
	private JLabel displayCardLabel;
	private String currentCardImage;
	public boolean cardDrawn;
	Color red = new Color(255, 0, 0);
	Color blue = new Color(0, 128, 255);
	Color green = new Color(0, 204, 0);
	Color yellow = new Color(255, 255, 0);
	Color lightred = new Color(255, 102, 102);
	Color lightblue = new Color(102, 178, 255);
	Color lightgreen = new Color(102, 255, 102);
	Color lightyellow = new Color(255, 255, 153);
	private JButton redPawn[] = new JButton[4];
	private JButton yellowPawn[] = new JButton[4];
	private JButton bluePawn[] = new JButton[4];
	private JButton greenPawn[] = new JButton[4];

	GUI() throws IOException {
		initializeGui();
	}

	public final JComponent getGui() {
		return gui;
	}

	public final void initializeGui() throws IOException {
		// create the images for the pieces
		// createImages();

		// set up the main GUI
		gui.setBorder(new EmptyBorder(20, 20, 20, 20));
		gui.setMinimumSize(new java.awt.Dimension(1900, 1700));
		gui.setPreferredSize(new java.awt.Dimension(1900, 1700));
		
		/***************************************************************************************/
		
		JToolBar tools = new JToolBar();

		// add the top menu buttons
		gui.add(tools, BorderLayout.PAGE_START);
		JButton btn = new JButton("New");
		btn.setFont(btn.getFont().deriveFont(Font.BOLD, 34f));
		tools.add(btn);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					setupNewGame();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		tools.setFont(tools.getFont().deriveFont(28f));
		tools.addSeparator();

		JButton btn1 = new JButton("Save");
		btn1.setFont(btn1.getFont().deriveFont(Font.BOLD, 34f));
		tools.add(btn1); // TODO - add functionality!
		tools.addSeparator();

		JButton btn2 = new JButton("Resume");
		btn2.setFont(btn2.getFont().deriveFont(Font.BOLD, 34f));
		tools.add(btn2); // TODO - add functionality!
		tools.addSeparator();

		JButton btn3 = new JButton("Quit");
		btn3.setFont(btn3.getFont().deriveFont(Font.BOLD, 34f));
		tools.add(btn3); // TODO - add functionality!
		tools.addSeparator();

		JButton btn4 = new JButton("Scores");
		btn4.setFont(btn4.getFont().deriveFont(Font.BOLD, 34f));
		tools.add(btn4); // TODO - add functionality!
		tools.addSeparator();

		message.setFont(message.getFont().deriveFont(Font.BOLD, 34f));
		tools.add(message);

		gui.add(new JLabel("?"), BorderLayout.LINE_START);

		// set up the panel for displaying the draw_a_card button
		drawCardPane = new JPanel();
		drawCardBtn = new JButton();
		drawCardPane.setMinimumSize(new java.awt.Dimension(400, 600));
		drawCardPane.setPreferredSize(new java.awt.Dimension(400, 600));
		// drawCardPane.setBounds(150, 280, 90, 125);
		drawCardPane.setOpaque(false);
		gui.add(drawCardPane);
		
		/***************************************************************************************/

		//
		// initialize the game board- add squares and color them in
		//
		gameBoard = new JPanel(new GridLayout(16, 16)) {

			/**
			 * Override the preferred size to return the largest it can, in a
			 * square shape. Must (must, must) be added to a GridBagLayout as
			 * the only component (it uses the parent as a guide to size) with
			 * no GridBagConstaint (so it is centered).
			 */
			@Override
			public final Dimension getPreferredSize() {
				Dimension d = super.getPreferredSize();
				Dimension prefSize = null;
				Component c = getParent();
				if (c == null) {
					prefSize = new Dimension((int) d.getWidth(), (int) d.getHeight());
				} else if (c != null && c.getWidth() > d.getWidth() && c.getHeight() > d.getHeight()) {
					prefSize = c.getSize();
				} else {
					prefSize = d;
				}
				int w = (int) prefSize.getWidth();
				int h = (int) prefSize.getHeight();
				// the smaller of the two sizes
				int s = (w > h ? h : w);
				return new Dimension(s, s);
			}
		};

		/***************************************************************************************/
		
		// USER TOOL BAR FOR GAME CHOICES
		// Let the user chose their piece
		message.setText("Choose your peg color, computer behavior, and difficulty at the bottom!");

		JToolBar userchoices = new JToolBar();
		userchoices.setBorder(new EmptyBorder(10, 10, 10, 10));
		gui.add(userchoices, BorderLayout.PAGE_END);

		final JPopupMenu popup = new JPopupMenu();

		JMenuItem redopt = new JMenuItem("Red");
		redopt.setFont(popup.getFont().deriveFont(Font.BOLD, 34f));
		popup.add(redopt);
		redopt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(gui, "Red selected");
			}
		});
		JMenuItem blueopt = new JMenuItem("Blue");
		blueopt.setFont(popup.getFont().deriveFont(Font.BOLD, 34f));
		popup.add(blueopt);
		blueopt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(gui, "Blue selected");
			}
		});
		JMenuItem greenopt = new JMenuItem("Green");
		greenopt.setFont(popup.getFont().deriveFont(Font.BOLD, 34f));
		popup.add(greenopt);
		greenopt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(gui, "Green selected");
			}
		});
		JMenuItem yellowopt = new JMenuItem("Yellow");
		yellowopt.setFont(popup.getFont().deriveFont(Font.BOLD, 34f));
		popup.add(yellowopt);
		yellowopt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(gui, "Yellow selected");
			}
		});

		final JPopupMenu popup2 = new JPopupMenu();

		JMenuItem niceopt = new JMenuItem("Nice");
		niceopt.setFont(popup.getFont().deriveFont(Font.BOLD, 34f));
		popup2.add(niceopt);
		niceopt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(gui, "Nice selected");
			}
		});
		JMenuItem meanopt = new JMenuItem("Mean");
		meanopt.setFont(popup.getFont().deriveFont(Font.BOLD, 34f));
		popup2.add(meanopt);
		meanopt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(gui, "Mean selected");
			}
		});

		final JPopupMenu popup3 = new JPopupMenu();

		JMenuItem easyopt = new JMenuItem("Easy");
		easyopt.setFont(popup.getFont().deriveFont(Font.BOLD, 34f));
		popup3.add(easyopt);
		easyopt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(gui, "Easy selected");

			}
		});
		JMenuItem hardopt = new JMenuItem("Hard");
		hardopt.setFont(popup.getFont().deriveFont(Font.BOLD, 34f));
		popup3.add(hardopt);
		hardopt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(gui, "Hard selected");
			}
		});

		final JPopupMenu popup4 = new JPopupMenu();

		JMenuItem onecomp = new JMenuItem("1 v 1");
		onecomp.setFont(popup.getFont().deriveFont(Font.BOLD, 34f));
		popup4.add(onecomp);
		onecomp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(gui, "1 computer opponent selected");

			}
		});
		JMenuItem twocomp = new JMenuItem("1 v 2");
		twocomp.setFont(popup.getFont().deriveFont(Font.BOLD, 34f));
		popup4.add(twocomp);
		twocomp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(gui, "2 computer opponents selected");
			}
		});
		JMenuItem threecomp = new JMenuItem("1 v 3");
		threecomp.setFont(popup.getFont().deriveFont(Font.BOLD, 34f));
		popup4.add(threecomp);
		threecomp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(gui, "3 computer opponents selected");
			}
		});

		final JButton button = new JButton("Peg Color");
		button.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
				// button.setVisible(false);
			}
		});
		final JButton button2 = new JButton("Computer Behavior");
		button2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				popup2.show(e.getComponent(), e.getX(), e.getY());
				// button2.setVisible(false);
			}
		});
		final JButton button3 = new JButton("Difficulty");
		button3.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				popup3.show(e.getComponent(), e.getX(), e.getY());
				// button3.setVisible(false);

			}
		});
		final JButton button4 = new JButton("Number of Computer Players");
		button4.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				popup4.show(e.getComponent(), e.getX(), e.getY());
				// button3.setVisible(false);

			}
		});

		userchoices.add(button);
		userchoices.add(button2);
		userchoices.add(button3);
		userchoices.add(button4);
		button.setFont(popup.getFont().deriveFont(Font.BOLD, 34f));
		button2.setFont(popup.getFont().deriveFont(Font.BOLD, 34f));
		button3.setFont(popup.getFont().deriveFont(Font.BOLD, 34f));
		button4.setFont(popup.getFont().deriveFont(Font.BOLD, 34f));
		
		/***************************************************************************************/

		gameBoard.setBorder(new CompoundBorder(new EmptyBorder(16, 16, 16, 16), new LineBorder(Color.BLACK)));

		drawCardPane.setBorder(new CompoundBorder(new EmptyBorder(16, 16, 16, 16), new LineBorder(Color.BLACK)));

		JPanel boardConstrain = new JPanel(new GridBagLayout());
		boardConstrain.add(gameBoard);
		boardConstrain.add(drawCardPane);
		gui.add(boardConstrain);

		// create the board squares
		for (int ii = 0; ii < gameBoardSquares.length; ii++) {
			for (int jj = 0; jj < gameBoardSquares[ii].length; jj++) {
				JButton b = new JButton();
				ImageIcon icon = new ImageIcon(new BufferedImage(35, 35, BufferedImage.TYPE_INT_ARGB));
				b.setIcon(icon);
				b.setBackground(Color.WHITE);
				gameBoardSquares[jj][ii] = b;

			}
		}

		// color in red slides
		gameBoardSquares[1][0].setBackground(lightred);
		gameBoardSquares[2][0].setBackground(lightred);
		gameBoardSquares[3][0].setBackground(lightred);
		gameBoardSquares[4][0].setBackground(lightred);
		gameBoardSquares[9][0].setBackground(lightred);
		gameBoardSquares[10][0].setBackground(lightred);
		gameBoardSquares[11][0].setBackground(lightred);
		gameBoardSquares[12][0].setBackground(lightred);
		gameBoardSquares[13][0].setBackground(lightred);
		// color in red safe zones
		gameBoardSquares[2][1].setBackground(red);
		gameBoardSquares[3][1].setBackground(red);
		gameBoardSquares[4][1].setBackground(red);
		gameBoardSquares[5][1].setBackground(red);
		gameBoardSquares[2][2].setBackground(red);
		gameBoardSquares[3][2].setBackground(red);
		gameBoardSquares[4][2].setBackground(red);
		gameBoardSquares[5][2].setBackground(red);
		gameBoardSquares[2][3].setBackground(red);
		gameBoardSquares[3][3].setBackground(red);
		gameBoardSquares[4][3].setBackground(red);
		gameBoardSquares[5][3].setBackground(red);
		gameBoardSquares[2][4].setBackground(red);
		gameBoardSquares[2][5].setBackground(red);
		gameBoardSquares[1][6].setBackground(red);
		gameBoardSquares[2][6].setBackground(red);
		gameBoardSquares[3][6].setBackground(red);
		gameBoardSquares[1][7].setBackground(red);
		gameBoardSquares[2][7].setBackground(red);
		gameBoardSquares[3][7].setBackground(red);

		// color in blue slides
		gameBoardSquares[15][1].setBackground(lightblue);
		gameBoardSquares[15][2].setBackground(lightblue);
		gameBoardSquares[15][3].setBackground(lightblue);
		gameBoardSquares[15][4].setBackground(lightblue);
		gameBoardSquares[15][9].setBackground(lightblue);
		gameBoardSquares[15][10].setBackground(lightblue);
		gameBoardSquares[15][11].setBackground(lightblue);
		gameBoardSquares[15][12].setBackground(lightblue);
		gameBoardSquares[15][13].setBackground(lightblue);
		// color in blue safe zones
		gameBoardSquares[14][2].setBackground(blue);
		gameBoardSquares[14][3].setBackground(blue);
		gameBoardSquares[14][4].setBackground(blue);
		gameBoardSquares[14][5].setBackground(blue);
		gameBoardSquares[13][2].setBackground(blue);
		gameBoardSquares[13][3].setBackground(blue);
		gameBoardSquares[13][4].setBackground(blue);
		gameBoardSquares[13][5].setBackground(blue);
		gameBoardSquares[12][2].setBackground(blue);
		gameBoardSquares[12][3].setBackground(blue);
		gameBoardSquares[12][4].setBackground(blue);
		gameBoardSquares[12][5].setBackground(blue);
		gameBoardSquares[11][2].setBackground(blue);
		gameBoardSquares[10][2].setBackground(blue);
		gameBoardSquares[9][1].setBackground(blue);
		gameBoardSquares[9][2].setBackground(blue);
		gameBoardSquares[9][3].setBackground(blue);
		gameBoardSquares[8][1].setBackground(blue);
		gameBoardSquares[8][2].setBackground(blue);
		gameBoardSquares[8][3].setBackground(blue);

		// color in green slides
		gameBoardSquares[0][2].setBackground(lightgreen);
		gameBoardSquares[0][3].setBackground(lightgreen);
		gameBoardSquares[0][4].setBackground(lightgreen);
		gameBoardSquares[0][5].setBackground(lightgreen);
		gameBoardSquares[0][6].setBackground(lightgreen);
		gameBoardSquares[0][11].setBackground(lightgreen);
		gameBoardSquares[0][12].setBackground(lightgreen);
		gameBoardSquares[0][13].setBackground(lightgreen);
		gameBoardSquares[0][14].setBackground(lightgreen);
		// color in green safe zones
		gameBoardSquares[1][10].setBackground(green);
		gameBoardSquares[1][11].setBackground(green);
		gameBoardSquares[1][12].setBackground(green);
		gameBoardSquares[1][13].setBackground(green);
		gameBoardSquares[2][10].setBackground(green);
		gameBoardSquares[2][11].setBackground(green);
		gameBoardSquares[2][12].setBackground(green);
		gameBoardSquares[2][13].setBackground(green);
		gameBoardSquares[3][10].setBackground(green);
		gameBoardSquares[3][11].setBackground(green);
		gameBoardSquares[3][12].setBackground(green);
		gameBoardSquares[3][13].setBackground(green);
		gameBoardSquares[4][13].setBackground(green);
		gameBoardSquares[5][13].setBackground(green);
		gameBoardSquares[6][12].setBackground(green);
		gameBoardSquares[6][13].setBackground(green);
		gameBoardSquares[6][14].setBackground(green);
		gameBoardSquares[7][12].setBackground(green);
		gameBoardSquares[7][13].setBackground(green);
		gameBoardSquares[7][14].setBackground(green);

		// color in yellow slides
		gameBoardSquares[2][15].setBackground(lightyellow);
		gameBoardSquares[3][15].setBackground(lightyellow);
		gameBoardSquares[4][15].setBackground(lightyellow);
		gameBoardSquares[5][15].setBackground(lightyellow);
		gameBoardSquares[6][15].setBackground(lightyellow);
		gameBoardSquares[11][15].setBackground(lightyellow);
		gameBoardSquares[12][15].setBackground(lightyellow);
		gameBoardSquares[13][15].setBackground(lightyellow);
		gameBoardSquares[14][15].setBackground(lightyellow);
		// color in yellow safe zones
		gameBoardSquares[10][12].setBackground(yellow);
		gameBoardSquares[10][13].setBackground(yellow);
		gameBoardSquares[10][14].setBackground(yellow);
		gameBoardSquares[11][12].setBackground(yellow);
		gameBoardSquares[11][13].setBackground(yellow);
		gameBoardSquares[11][14].setBackground(yellow);
		gameBoardSquares[12][12].setBackground(yellow);
		gameBoardSquares[12][13].setBackground(yellow);
		gameBoardSquares[12][14].setBackground(yellow);
		gameBoardSquares[12][9].setBackground(yellow);
		gameBoardSquares[12][8].setBackground(yellow);
		gameBoardSquares[13][8].setBackground(yellow);
		gameBoardSquares[13][9].setBackground(yellow);
		gameBoardSquares[13][10].setBackground(yellow);
		gameBoardSquares[13][11].setBackground(yellow);
		gameBoardSquares[13][12].setBackground(yellow);
		gameBoardSquares[13][13].setBackground(yellow);
		gameBoardSquares[13][14].setBackground(yellow);
		gameBoardSquares[14][8].setBackground(yellow);
		gameBoardSquares[14][9].setBackground(yellow);

		/*
		 * fill the board
		 */

		for (int ii = 0; ii < 16; ii++) {
			for (int jj = 0; jj < 16; jj++) {
				gameBoard.add(gameBoardSquares[jj][ii]);
			}

		}
	}

	/***************************************************************************************/
	
	private final void cardshuffle() throws IOException {

		// set up the layout of drawCardPane and add the button into the pane
		GroupLayout drawCardPaneLayout = new GroupLayout(drawCardPane);
		drawCardPane.setLayout(drawCardPaneLayout);
		drawCardPaneLayout.setHorizontalGroup(drawCardPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(drawCardPaneLayout.createSequentialGroup()
						.addComponent(drawCardBtn, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));
		drawCardPaneLayout.setVerticalGroup(drawCardPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(drawCardPaneLayout.createSequentialGroup()
						.addComponent(drawCardBtn, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));
		/***************************************************************************************/

		// set up the label and panel for displaying the newly drawn card.
		displayCardPane = new JPanel();
		displayCardLabel = new JLabel();
		// displayCardPane.setBounds(470, 250, 270, 364);
		displayCardPane.setOpaque(false);
		gui.add(displayCardPane);
		currentCardImage = "";
		displayCardLabel.setMaximumSize(new Dimension(400, 600));
		displayCardLabel.setMinimumSize(new Dimension(120, 164));
		displayCardLabel.setPreferredSize(new Dimension(120, 164));
		displayCardLabel.setOpaque(false);

		/***************************************************************************************/

		BufferedImage sorrycard = ImageIO.read(new File("src/sorrycard.JPG"));
		BufferedImage card2 = ImageIO.read(new File("src/2.png"));
		JLabel cardimg = new JLabel(new ImageIcon(sorrycard));
		JLabel cardimg2 = new JLabel(new ImageIcon(card2));

		// create the drawCardBtn for drawing a card
		drawCardBtn.setIcon(new ImageIcon(sorrycard));
		drawCardBtn.setToolTipText("Click to draw a card.");
		drawCardBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		drawCardBtn.setMinimumSize(new Dimension(400, 600));
		drawCardBtn.setPreferredSize(new Dimension(400, 600));
		drawCardBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				drawCardBtn.setIcon(new ImageIcon(card2));
			}
		});
	}
	
	/***************************************************************************************/

	// Initializes the initial piece orientation

	private final void setupNewGame() throws IOException {
		message.setText("Make your move!");

		// get choices from buttons
		String userpeg = " ";
		String userdifficulty = " ";
		String compbehavior = " ";
		String numofcomps = " ";

		BufferedImage blueimg = ImageIO.read(new File("src/newblue.png"));
		gamePieceImages[0][0] = blueimg;
		BufferedImage greenimg = ImageIO.read(new File("src/newgreen.png"));
		gamePieceImages[0][1] = greenimg;
		BufferedImage redimg = ImageIO.read(new File("src/newred.png"));
		gamePieceImages[0][2] = redimg;
		BufferedImage yellowimg = ImageIO.read(new File("src/newyellow.png"));
		gamePieceImages[0][3] = yellowimg;
		BufferedImage sorrycard = ImageIO.read(new File("src/sorrycard.JPG"));
		gamePieceImages[0][4] = sorrycard;

		/***************************************************************************************/
		// set up the yellow pawns
		for (int i = 0; i < 4; i++) {
			yellowPawn[i] = new JButton();
			yellowPawn[i].setIcon(new ImageIcon(yellowimg));
			yellowPawn[i].setActionCommand("" + (4 + i));
			yellowPawn[i].setDisabledIcon(new ImageIcon(yellowimg));
			yellowPawn[i].setMaximumSize(new java.awt.Dimension(75, 75));
			yellowPawn[i].setMinimumSize(new java.awt.Dimension(75, 75));
			yellowPawn[i].setPreferredSize(new java.awt.Dimension(75, 75));
			yellowPawn[i].addActionListener(null);
		}
		/***************************************************************************************/
		/***************************************************************************************/

		// set up the red pawns
		for (int i = 0; i < 4; i++) {
			redPawn[i] = new JButton();
			redPawn[i].setIcon(new ImageIcon(redimg));
			redPawn[i].setActionCommand("" + i);
			redPawn[i].setDisabledIcon(new ImageIcon(redimg));
			redPawn[i].setMaximumSize(new Dimension(75, 75));
			redPawn[i].setMinimumSize(new Dimension(75, 75));
			redPawn[i].setPreferredSize(new Dimension(75, 75));
		}
		/***************************************************************************************/
		/***************************************************************************************/
		// set up the green pawns
		for (int i = 0; i < 4; i++) {
			greenPawn[i] = new JButton();
			greenPawn[i].setIcon(new ImageIcon(greenimg));
			greenPawn[i].setActionCommand("" + (4 + i));
			greenPawn[i].setDisabledIcon(new ImageIcon(greenimg));
			greenPawn[i].setMaximumSize(new java.awt.Dimension(75, 75));
			greenPawn[i].setMinimumSize(new java.awt.Dimension(75, 75));
			greenPawn[i].setPreferredSize(new java.awt.Dimension(75, 75));
			greenPawn[i].addActionListener(null);
		}
		/***************************************************************************************/
		/***************************************************************************************/

		// set up the blue pawns
		for (int i = 0; i < 4; i++) {
			bluePawn[i] = new JButton();
			bluePawn[i].setIcon(new ImageIcon(blueimg));
			bluePawn[i].setActionCommand("" + i);
			bluePawn[i].setDisabledIcon(new ImageIcon(blueimg));
			bluePawn[i].setMaximumSize(new Dimension(75, 75));
			bluePawn[i].setMinimumSize(new Dimension(75, 75));
			bluePawn[i].setPreferredSize(new Dimension(75, 75));
		}
		/***************************************************************************************/

		// set up the red pieces

		gameBoardSquares[4][2].add(redPawn[0]);
		gameBoardSquares[4][3].add(redPawn[1]);
		gameBoardSquares[5][2].add(redPawn[2]);
		gameBoardSquares[5][3].add(redPawn[3]);

		// set up the green pieces

		gameBoardSquares[2][10].add(greenPawn[0]);
		gameBoardSquares[2][11].add(greenPawn[1]);
		gameBoardSquares[3][10].add(greenPawn[2]);
		gameBoardSquares[3][11].add(greenPawn[3]);

		// set up the yellow pieces
		gameBoardSquares[10][12].add(yellowPawn[0]);
		gameBoardSquares[10][13].add(yellowPawn[1]);
		gameBoardSquares[11][12].add(yellowPawn[2]);
		gameBoardSquares[11][13].add(yellowPawn[3]);

		// set up the blue pieces
		gameBoardSquares[13][4].add(bluePawn[0]);
		gameBoardSquares[13][5].add(bluePawn[1]);
		gameBoardSquares[12][4].add(bluePawn[2]);
		gameBoardSquares[12][5].add(bluePawn[3]);

		/***************************************************************************************/
		
		// enable card deck to be clicked

		cardshuffle();
		
		/***************************************************************************************/

		// give pieces keys so they can be tracked and moved
		//all 4 pieces belong to an array now, that is there key, move them like in the function below

		// to begin users turn have them draw a card and take a turn
		
		// if 1 or 2 they can move a piece if not move to the next player
		
		// how to let them chose what piece to move??
		
		// have squares they can move to light up, make them selectable
		
//		gameBoardSquares[4][7].setBackground(blue);
//		gameBoardSquares[4][7].addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				gameBoardSquares[4][7].add(redPawn[0]);
//			}
//		});
		
		
		// check if home or slide
		// based on how many comp players they selected decrement the card deck
		// and move the comp pieces

		// when it returns to the players turn let them draw again
		// make the deck unclickable when not their turn? boolean

		// score calculated at the end

	}

	public static void main(String[] args) throws IOException {

		GUI cg = new GUI();

		JFrame f = new JFrame("Sorry");
		f.add(cg.getGui());

		// Ensures JVM closes after frame(s) closed and
		// all non-daemon threads are finished
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// See https://stackoverflow.com/a/7143398/418556 for demo.
		f.setLocationByPlatform(true);

		// ensures the frame is the minimum size it needs to be
		// in order display the components within it
		f.pack();
		// ensures the minimum size is enforced.
		f.setMinimumSize(f.getSize());
		f.setVisible(true);
	}

}
