import javax.swing.*;
import java.awt.*;

public class JavaSweeper extends JFrame {
    private JPanel panel;

    private JavaSweeper() {
        initPanel();
        initFrame();
    }

    private void initPanel() {
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawLine(0, 0, 500, 300);
                g.drawImage(getImage("bomb"),0,0,this);
                g.drawImage(getImage("num1"),50,0,this);
                g.drawImage(getImage("num1"),50,50,this);
                g.drawImage(getImage("num1"),0,50,this);
            }
        };
        panel.setPreferredSize(new Dimension(500, 300));
        add(panel);
    }

    private void initFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaSweeper");
        setVisible(true);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
    }
    private Image getImage(String name){
        ImageIcon icon = new ImageIcon("res/img/" + name + ".png");
        return icon.getImage();
    }

    public static void main(String[] args) {
        new JavaSweeper();
    }
}
