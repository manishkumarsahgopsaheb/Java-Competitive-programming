import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class third_frame{
    public third_frame(){

        JLabel label1 = new JLabel();
        label1.setText("Anything you");
        label1.setBounds(10,10, 200,30);
        label1.setFont(new Font("Verdana", Font.PLAIN, 18));

        JLabel label2 = new JLabel();
        label2.setText("want to add");
        label2.setBounds(10,40, 150,30);
        label2.setFont(new Font("Verdana", Font.PLAIN, 18));

        JCheckBox Backaging = new JCheckBox("Backaging");
        Backaging.setBounds(10,80,100,30);

        JCheckBox Sockaclash = new JCheckBox("Sockaclash");
        Sockaclash.setBounds(10,110,100,30);

        JCheckBox Velvet = new JCheckBox("Velvet");
        Velvet.setBounds(10,140,100,30);

        JCheckBox Fabric = new JCheckBox("Fabric");
        Fabric.setBounds(10,170,100,30);

        JRadioButton r1 = new JRadioButton("Roses");
        JRadioButton r2 = new JRadioButton("Gift Card");

        r1.setBounds(10,200,100,30);
        r2.setBounds(10,230,100,30);

        ButtonGroup bg  = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JLabel describe = new JLabel("Describe");
        describe.setBounds(10,260,100,30);

        JTextField textField = new JTextField();
        textField.setBounds(10,290,250,30);


        JButton next = new JButton("Next");
        next.setBounds(100,330,100,30);


        JFrame frame = new JFrame();
        frame.setTitle("Gift Store");
        frame.setSize(400,400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(label1);
        frame.add(label2);
        frame.add(Backaging);
        frame.add(Sockaclash);
        frame.add(Velvet);
        frame.add(Fabric);
        frame.add(r1);
        frame.add(r2);
        frame.add(describe);
        frame.add(textField);
        frame.add(next);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new third_frame();
            }
        });
    }
}




class second_frame{
    public second_frame(){
        JLabel label1 = new JLabel();
        label1.setText("Please Choose Your");
        label1.setBounds(10,10, 200,30);
        label1.setFont(new Font("Verdana", Font.PLAIN, 18));

        JLabel label2 = new JLabel();
        label2.setText("Favourite Gift");
        label2.setBounds(10,40, 150,30);
        label2.setFont(new Font("Verdana", Font.PLAIN, 18));

        JCheckBox chocolate = new JCheckBox("Chocolate");
        chocolate.setBounds(10,80,100,30);

        JCheckBox Belagian = new JCheckBox("Belagian");
        Belagian.setBounds(10,110,100,30);

        JCheckBox Swiss = new JCheckBox("Swiss");
        Swiss.setBounds(10,140,100,30);

        JCheckBox Roses = new JCheckBox("Roses");
        Roses.setBounds(10,170,100,30);

        JCheckBox Tulip = new JCheckBox("Tulip");
        Tulip.setBounds(10,200,100,30);

        JCheckBox jasmine = new JCheckBox("Jasmine");
        jasmine.setBounds(10,230,100,30);

        JCheckBox Violets = new JCheckBox("Violets");
        Violets.setBounds(10,260,100,30);

        JCheckBox caledula = new JCheckBox("Calendula");
        caledula.setBounds(10,290,100,30);

        JButton next = new JButton("Next");
        next.setBounds(100,330,100,30);


        JFrame frame = new JFrame();
        frame.setTitle("Gift Store");
        frame.setSize(400,400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(label1);
        frame.add(label2);
        frame.add(chocolate);
        frame.add(Belagian);
        frame.add(Swiss);
        frame.add(Roses);
        frame.add(Tulip);
        frame.add(jasmine);
        frame.add(Violets);
        frame.add(caledula);
        frame.add(next);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new third_frame();
            }
        });
    }
}

public class MyGui {


    public MyGui() throws InterruptedException {
        JLabel label1 = new JLabel();
        label1.setText("Welcome");
        label1.setBounds(150,110, 100,30);
        label1.setFont(new Font("Verdana", Font.PLAIN, 18));


        JLabel label2 = new JLabel();
        label2.setText("To");
        label2.setBounds(175,150,100,30);
        label2.setFont(new Font("Verdana", Font.PLAIN, 18));


        JLabel label3 = new JLabel();
        label3.setText("Gift Store");
        label3.setBounds(150,190,100,30);
        label3.setFont(new Font("Verdana", Font.PLAIN, 18));


        JFrame frame = new JFrame(); // creating the object of Jframe
        frame.setTitle("Gift Store");  // setting the title
        frame.setSize(400,400); // setting of dimension
        frame.setResizable(false); // prevent frame from resize
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);

        Thread.sleep(1000);  // after running of 1000 millis of MyGui class which is the welcome window i am calling second frame from here
        frame.dispose();
        new second_frame();
    }

    public static void main(String[] args) throws InterruptedException {
        new MyGui();
    }
}
