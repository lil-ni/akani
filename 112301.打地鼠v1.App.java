import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    private JPanel MyPanel=new JPanel();
    private JLabel label_img=new JLabel();
    private JLabel label_background=new JLabel();
    private JLabel label_score=new JLabel();
    int i=0;
    public App() {
        label_img.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
//              label_img.setBounds(100,100,64,64);  固定位置
//              随机位置：
                label_img.setBounds((int)(Math.random()*10%10*64),(int)(Math.random()*10%10*64),64,64);
                i++;
                label_score.setText("Your Score:"+String.valueOf(i));
            }
        });
    }

    void go(){
        java.net.URL imgURL1 = App.class.getResource("pink.gif");
        label_img.setIcon(new ImageIcon(imgURL1));
        label_img.setBounds(100,100,100,100);
        java.net.URL imgURL2 = App.class.getResource("background.jpg");
        label_background.setIcon(new ImageIcon(imgURL2));
        label_background.setBounds(0,0,1024,720);
        label_score.setForeground(Color.pink);
        label_score.setFont(new Font("Arial",Font.PLAIN,30));
        label_score.setText("Your Score:0");
        label_score.setBounds(50,50,500,100);

        MyPanel.add(label_img);
        MyPanel.add(label_score);
        MyPanel.add(label_background);
        MyPanel.setLayout(null);
        JFrame frame = new JFrame("粉色系打地鼠游戏");
        frame.setContentPane(MyPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1024,720);
//        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
