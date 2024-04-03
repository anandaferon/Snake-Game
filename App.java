import javax.swing.*;

public class App extends JFrame {
    public static void main(String[] args) throws Exception {
        int boardWidth = 600;
        int boardLength = boardWidth;

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardLength);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(boardWidth, boardLength);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();
    }
}
