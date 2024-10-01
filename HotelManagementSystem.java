import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HotelManagementSystem extends JFrame implements ActionListener {

    HotelManagementSystem() {
        setSize(1100, 565);
        setLocation(100, 50);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        JLabel image = new JLabel(i1);
        add(image);
        image.setBounds(0, 0, 1100, 565);

        JLabel text  = new JLabel("Hotel Management System");
        text.setBounds(20, 430, 1000, 90);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("SansSerif", Font.PLAIN, 50));
        image.add(text);

        JButton startBtn = new JButton("Get Started");
        startBtn.setBounds(900, 450, 150, 50);
        startBtn.setBackground(Color.WHITE);
        startBtn.setForeground(Color.BLACK);
        startBtn.addActionListener(this);
        startBtn.setFont(new Font("SansSerif", Font.PLAIN, 20));
        image.add(startBtn);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new HotelManagementSystem();
    }
}