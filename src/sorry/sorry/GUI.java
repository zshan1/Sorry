package sorry;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.*;
import javax.swing.border.*;
import java.net.URL;
import javax.imageio.ImageIO;

public class GUI {

    private final JPanel gui = new JPanel(new BorderLayout(10, 10));
    private JButton[][] gameBoardSquares = new JButton[16][16];
    private Image[][] gamePieceImages = new Image[1][5];
    private JPanel gameBoard;
    private JPanel cards;
    private final JLabel message = new JLabel(
            "Welcome to Sorry!");
    
    public static final int WHITE = 1;

    GUI() {
        initializeGui();
    }

    public final void initializeGui() {
        // create the images for the pieces
         createImages();

        // set up the main GUI
        gui.setBorder(new EmptyBorder(46, 46, 46, 46));
        JToolBar tools = new JToolBar();
       // tools.setFloatable(false);
      //  tools.setPreferredSize(new Dimension(500,100));
      
        gui.add(tools, BorderLayout.PAGE_START);
        
        JButton btn = new JButton("New");
        btn.setFont(btn.getFont().deriveFont(Font.BOLD, 34f));
        tools.add(btn); // TODO - add functionality!
        btn.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                setupNewGame();
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
        
        

        gameBoard = new JPanel(new GridLayout(16, 16)) {

            /**
             * Override the preferred size to return the largest it can, in
             * a square shape.  Must (must, must) be added to a GridBagLayout
             * as the only component (it uses the parent as a guide to size)
             * with no GridBagConstaint (so it is centered).
             */
            @Override
            public final Dimension getPreferredSize() {
                Dimension d = super.getPreferredSize();
                Dimension prefSize = null;
                Component c = getParent();
                if (c == null) {
                    prefSize = new Dimension(
                            (int)d.getWidth(),(int)d.getHeight());
                } else if (c!=null &&
                        c.getWidth()>d.getWidth() &&
                        c.getHeight()>d.getHeight()) {
                    prefSize = c.getSize();
                } else {
                    prefSize = d;
                }
                int w = (int) prefSize.getWidth();
                int h = (int) prefSize.getHeight();
                // the smaller of the two sizes
                int s = (w>h ? h : w);
                return new Dimension(s,s);
            }
        };
        gameBoard.setBorder(new CompoundBorder(
                new EmptyBorder(16,16,16,16),
                new LineBorder(Color.BLACK)
                ));
        
       
        Color red = new Color(255,0,0);
        Color blue = new Color(0,128,255);
        Color green = new Color(0,204,0);
        Color yellow = new Color(255,255,0);
        
        Color lightred = new Color(255,102,102);
        Color lightblue = new Color(102,178,255);
        Color lightgreen = new Color(102,255,102);
        Color lightyellow = new Color(255,255,153);
        
        JPanel boardConstrain = new JPanel(new GridBagLayout());
        boardConstrain.add(gameBoard);
        gui.add(boardConstrain);

        // create the board squares
        Insets buttonMargin = new Insets(0, 0, 0, 0);
        for (int ii = 0; ii < gameBoardSquares.length; ii++) {
            for (int jj = 0; jj < gameBoardSquares[ii].length; jj++) {
                JButton b = new JButton();
                b.setMargin(buttonMargin);
                // our chess pieces are 64x64 px in size, so we'll
                // 'fill this in' using a transparent icon..
                ImageIcon icon = new ImageIcon(
                        new BufferedImage(80, 80, BufferedImage.TYPE_INT_ARGB));
                b.setIcon(icon);
                    b.setBackground(Color.WHITE);                
                gameBoardSquares[jj][ii] = b;
            
            }
        }

//color in red slides
                	gameBoardSquares[1][0].setBackground(lightred); 
                	gameBoardSquares[2][0].setBackground(lightred); 
                	gameBoardSquares[3][0].setBackground(lightred); 
                	gameBoardSquares[4][0].setBackground(lightred); 
                	gameBoardSquares[9][0].setBackground(lightred); 
                	gameBoardSquares[10][0].setBackground(lightred); 
                	gameBoardSquares[11][0].setBackground(lightred); 
                	gameBoardSquares[12][0].setBackground(lightred); 
                	gameBoardSquares[13][0].setBackground(lightred); 
//color in red safe zones
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
                	
//color in blue slides
                	gameBoardSquares[15][1].setBackground(lightblue); 
                	gameBoardSquares[15][2].setBackground(lightblue); 
                	gameBoardSquares[15][3].setBackground(lightblue); 
                	gameBoardSquares[15][4].setBackground(lightblue); 
                	gameBoardSquares[15][9].setBackground(lightblue); 
                	gameBoardSquares[15][10].setBackground(lightblue); 
                	gameBoardSquares[15][11].setBackground(lightblue); 
                	gameBoardSquares[15][12].setBackground(lightblue); 
                	gameBoardSquares[15][13].setBackground(lightblue); 
//color in blue safe zones
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
                	
//color in green slides
                	gameBoardSquares[0][2].setBackground(lightgreen); 
                	gameBoardSquares[0][3].setBackground(lightgreen); 
                	gameBoardSquares[0][4].setBackground(lightgreen); 
                	gameBoardSquares[0][5].setBackground(lightgreen); 
                	gameBoardSquares[0][6].setBackground(lightgreen); 
                	gameBoardSquares[0][11].setBackground(lightgreen); 
                	gameBoardSquares[0][12].setBackground(lightgreen); 
                	gameBoardSquares[0][13].setBackground(lightgreen); 
                	gameBoardSquares[0][14].setBackground(lightgreen); 
//color in green safe zones
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
                 
//color in yellow slides
                	gameBoardSquares[2][15].setBackground(lightyellow); 
                	gameBoardSquares[3][15].setBackground(lightyellow); 
                	gameBoardSquares[4][15].setBackground(lightyellow); 
                	gameBoardSquares[5][15].setBackground(lightyellow); 
                	gameBoardSquares[6][15].setBackground(lightyellow); 
                	gameBoardSquares[11][15].setBackground(lightyellow); 
                	gameBoardSquares[12][15].setBackground(lightyellow); 
                	gameBoardSquares[13][15].setBackground(lightyellow); 
                	gameBoardSquares[14][15].setBackground(lightyellow); 
//color in yellow safe zones
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

    public final JComponent getGui() {
        return gui;
    }

   private final void createImages() {
try{
         
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
                
            
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    /**
     * Initializes the icons of the initial chess board piece places
     */
    private final void setupNewGame() {
        message.setText("Make your move!");
        
//set up the red pieces
     gameBoardSquares[4][2].setIcon(new ImageIcon(
                    gamePieceImages[0][2]));
     gameBoardSquares[4][3].setIcon(new ImageIcon(
             gamePieceImages[0][2]));
     gameBoardSquares[5][2].setIcon(new ImageIcon(
             gamePieceImages[0][2]));
     gameBoardSquares[5][3].setIcon(new ImageIcon(
             gamePieceImages[0][2]));
        
        
// set up the green pieces
            gameBoardSquares[2][10].setIcon(new ImageIcon(
                    gamePieceImages[0][1]));
            gameBoardSquares[2][11].setIcon(new ImageIcon(
                    gamePieceImages[0][1]));
            gameBoardSquares[3][10].setIcon(new ImageIcon(
                    gamePieceImages[0][1]));
            gameBoardSquares[3][11].setIcon(new ImageIcon(
                    gamePieceImages[0][1]));
        
// set up the yellow pieces
            gameBoardSquares[10][12].setIcon(new ImageIcon(
                    gamePieceImages[0][3]));
            gameBoardSquares[10][13].setIcon(new ImageIcon(
                    gamePieceImages[0][3]));
            gameBoardSquares[11][12].setIcon(new ImageIcon(
                    gamePieceImages[0][3]));
            gameBoardSquares[11][13].setIcon(new ImageIcon(
                    gamePieceImages[0][3]));
            
// set up the blue pieces

            gameBoardSquares[13][4].setIcon(new ImageIcon(
                    gamePieceImages[0][0]));
            gameBoardSquares[13][5].setIcon(new ImageIcon(
                    gamePieceImages[0][0]));
            gameBoardSquares[12][4].setIcon(new ImageIcon(
                    gamePieceImages[0][0]));
            gameBoardSquares[12][5].setIcon(new ImageIcon(
                    gamePieceImages[0][0]));
    }
            
    public static void main(String[] args) {
        Runnable r = new Runnable() {

            @Override
            public void run() {
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
        };
        // Swing GUIs should be created and updated on the EDT
        // http://docs.oracle.com/javase/tutorial/uiswing/concurrency
        SwingUtilities.invokeLater(r);
    }
}
