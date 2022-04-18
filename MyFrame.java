import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyFrame extends JFrame {
   private String texto;
    MyFrame(String texto){

        JLabel label = new JLabel(texto);
        label.setForeground(new Color(0,76,165));

        this.add(label);


        this.setTitle("Mi primera ventana");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setResizable(false);
        this.setSize(500,500);
        this.setVisible(true);
        //this.getContentPane().setBackground(new Color(0,40,30));

        // ImageIcon image = new ImageIcon("");
        // this.getIconImage(image.getImage());


    }

}
