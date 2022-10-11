import java.awt.Component;
import javax.swing.*;

public class TicTacToeGUI
{
   public static void main(String []args)
   {
      TicTacToeBoard board = new TicTacToeBoard();
      TicTacToeButtons buttons = new TicTacToeButtons(board);

      JFrame mainFrame = new JFrame("Tic Tac Toe");
      mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JPanel mainPanel = new JPanel();
      mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
      mainPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

      JLabel instructions = new JLabel("Your piece is O");
      instructions.setAlignmentX(Component.CENTER_ALIGNMENT);
      mainPanel.add(instructions);

      buttons.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
      mainPanel.add(buttons);

      mainFrame.add(mainPanel);

      mainFrame.pack();
      mainFrame.setVisible(true);

      // an example of udating a button with X or O in the GUI
      TicTacToePiece x_piece = TicTacToePiece.X;
      board.placeTicTacToePiece(1,1, x_piece);
      buttons.showBoard();
   }
}
