
import java.awt.*;
import javax.swing.*;
public class Game{
    JFrame window;
    Container con;
    JPanel titleNamePanel;
    JLabel titleNameLabel;
    Font titleFont = new Font("Times New Roman", Font.PLAIN,90);
    public static void main(String[] args) {
        new Game();
    }
    public Game(){
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100,100,600,150);
        titleNamePanel.setBackground(Color.BLUE);
        titleNameLabel = new JLabel("ADVENTURE");
        titleNameLabel.setForeground(Color.WHITE);
        titleNamePanel.add(titleNameLabel);
        titleNameLabel.setFont(titleFont);
        con.add(titleNamePanel);
    }
}