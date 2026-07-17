package JavaGraphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class CatchBallGame extends JPanel implements ActionListener, KeyListener {

    int ballX = 100;
    int ballY = 0;
    int paddleX = 150;
    int score = 0;

    Timer timer;
    Random random = new Random();

    public CatchBallGame() {
        setPreferredSize(new Dimension(400, 500));
        setBackground(Color.WHITE);

        timer = new Timer(20, this);
        timer.start();

        addKeyListener(this);
        setFocusable(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw ball
        g.setColor(Color.RED);
        g.fillOval(ballX, ballY, 20, 20);

        // Draw paddle
        g.setColor(Color.BLUE);
        g.fillRect(paddleX, 450, 80, 10);

        // Draw score
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Score: " + score, 10, 30);
    }

    public void actionPerformed(ActionEvent e) {
        ballY += 5;

        // Ball reaches paddle
        if (ballY >= 430 && ballX >= paddleX && ballX <= paddleX + 80) {
            score++;
            ballY = 0;
            ballX = random.nextInt(380);
        }

        // Ball missed
        if (ballY > 500) {
            ballY = 0;
            ballX = random.nextInt(380);
        }

        repaint();
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT && paddleX > 0)
            paddleX -= 20;

        if (e.getKeyCode() == KeyEvent.VK_RIGHT && paddleX < 320)
            paddleX += 20;
    }

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Catch the Ball");
        CatchBallGame game = new CatchBallGame();

        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}