import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

public class JavaSwing extends JFrame {
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;

    public JavaSwing(){

    }
    public JavaSwing(String s){
        super(s);
    }
    public void setComponents()
    {
        l1 = new JLabel("Addition of Two numbers");
        l2 = new JLabel("First Number");
        l3 = new JLabel("Second Number");
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("Add");
        setLayout(null);
        l1.setBounds(150,50,250,30);
        l2.setBounds(150,100,250,30);
        l3.setBounds(150,150,250,30);
        t1.setBounds(500,100,250,30);
        t2.setBounds(500,150,250,30);
        l4.setBounds(150,250,250,30);
        b1.setBounds(300,200,250,30);
        b1.addActionListener(new Handler());

        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b1);
        add(l4);


    }
    class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int sum = a+b;
           l4.setText("Result is "+sum);

        }
    }
    public static void main(String[] args) {
        JavaSwing jf = new JavaSwing("Swing Example");
        jf.setComponents();
        jf.setSize(800,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
