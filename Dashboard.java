import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    Dashboard() {
        setBounds(0, 0, 1550, 1000);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 900);
        add(image);

        JLabel text = new JLabel("THE BPS GROUP WELCOMES YOU !");
        text.setBounds(350, 80, 1000, 50);
        text.setFont(new Font("SansSerif", Font.BOLD, 40));
        text.setForeground(Color.WHITE);
        image.add(text);

        // menu bar
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0, 1550, 30);
        image.add(mb);

        // menu 
        JMenu hotel = new JMenu("HOTEL MANAGEMENT");
        hotel.setForeground(Color.RED);
        mb.add(hotel);

        JMenuItem reception = new JMenuItem("RECEPTION");
        hotel.add(reception);

        JMenu admin = new JMenu("ADMIN");
        admin.setForeground(Color.BLUE);
        mb.add(admin);

        JMenuItem addEmployee = new JMenuItem("ADD EMPLOYEE");
        admin.add(addEmployee);

        JMenuItem addRooms = new JMenuItem("ADD ROOMS");
        admin.add(addRooms);

        JMenuItem addDrivers = new JMenuItem("ADD DRIVERS");
        admin.add(addDrivers);

        setVisible(true);
    }
    public static void main(String[] args) {
        
        new Dashboard();
    }
}
