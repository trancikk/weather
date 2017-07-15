import javax.swing.*;
import java.awt.*;

/**
 * Created by Trancikk on 14.07.2017.
 */
public class SwingObserveExample {
    JFrame jFrame ;

    public static void main(String[] args) {
        SwingObserveExample example = new SwingObserveExample();
        example.go();
    }

    public void go(){
        jFrame = new JFrame();
        JButton jButton = new JButton("Do it?");
        jButton.addActionListener(new AngelListener());
        jButton.addActionListener(new DevilListener());
        jFrame.getContentPane().add(BorderLayout.CENTER,jButton);

    }


}
