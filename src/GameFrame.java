import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame(){
      this.add(new GamePanel());
      this.setTitle("Snake");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setResizable(false);
      // fit jframe
      this.pack();
      this.setVisible(true);
      this.setLocationRelativeTo(null);// this will go in the middle monitor

    }
}
