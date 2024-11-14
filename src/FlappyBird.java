import javax.swing.*;
import java.awt.*;

public class FlappyBird extends JPanel {
    int boardWidth = 360;
    int boardHeight = 640;

    Image backgroundImg;
    Image birdImg;
    Image topPipeImg;
    Image bottomPipeImg;

    FlappyBird(){
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.blue);

        //load images
        backgroundImg = new ImageIcon(getClass().getResource("/Image/flappybirdbg.png")).getImage();
        birdImg = new ImageIcon(getClass().getResource("/Image/flappybird.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("/Image/toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("/Image/bottompipe.png")).getImage();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g){
        g.drawImage(backgroundImg, 0, 0, boardWidth, boardHeight, null);
    }
}
