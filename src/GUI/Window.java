package GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

public class Window extends JFrame {
    
    public Window() {
        this.setTitle("Demo");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new GridLayout(2,1 ));
        this.setResizable(false);

        JPanel tleft = new JPanel();
        tleft.setLayout(new BorderLayout());
        tleft.setBackground(Color.BLACK);
        
        JPanel tright = new JPanel();
        tright.setLayout(new BorderLayout());
        tright.setBackground(Color.CYAN);

        JPanel bleft = new JPanel();
        bleft.setLayout(new BorderLayout());
        bleft.setBackground(Color.PINK);

        JPanel bright = new JPanel();
        bright.setLayout(new BorderLayout());
        bright.setBackground(Color.GRAY);
        
        JLabel one = new JLabel("1");
        one.setForeground(Color.WHITE);
        one.setVerticalAlignment(JLabel.CENTER);
        one.setHorizontalAlignment(JLabel.CENTER);

        JLabel two = new JLabel("2");
        two.setForeground(Color.WHITE);
        two.setVerticalAlignment(JLabel.CENTER);
        two.setHorizontalAlignment(JLabel.CENTER);

        JLabel three = new JLabel("3");
        three.setForeground(Color.WHITE);
        three.setVerticalAlignment(JLabel.CENTER);
        three.setHorizontalAlignment(JLabel.CENTER);

        JLabel four = new JLabel("4");
        four.setForeground(Color.WHITE);
        four.setVerticalAlignment(JLabel.CENTER);
        four.setHorizontalAlignment(JLabel.CENTER);

        tleft.add(one);
        tright.add(two);
        bleft.add(three);
        bright.add(four);
        
        JPanel upper = new JPanel();
        upper.setBackground(Color.BLUE);
        upper.setLayout(new BorderLayout());
        JLabel sprite = new JLabel("Charizard");
        sprite.setForeground(Color.WHITE);
        sprite.setIcon(new ImageIcon("Images/Charizard.png"));
        sprite.setHorizontalTextPosition(JLabel.CENTER);
        sprite.setVerticalTextPosition(JLabel.BOTTOM);
        sprite.setHorizontalAlignment(JLabel.RIGHT);
        sprite.setVerticalAlignment(JLabel.TOP);
        upper.add(sprite);
        
        JPanel lower = new JPanel();
        lower.setLayout(new GridLayout(2,2));
        //lower.setBackground(Color.GREEN);
        lower.add(tleft);
        lower.add(tright);
        lower.add(bleft);
        lower.add(bright);
        
        this.add(upper);
        this.add(lower);
        this.setVisible(true);
    }
    

    public static void main(String[] args) {
        new Window();
    }
}
