import javax.swing.*;
import java.awt.*;

public class HomePage extends JFrame {
    public HomePage() {
        super("Smart Savings - Login Page");

        JButton customerBtn = new JButton("Login as Customer");
        JButton shopkeeperBtn = new JButton("Login as Shopkeeper");

        customerBtn.addActionListener(e -> {
            new CustomerView();
            dispose();
        });

        shopkeeperBtn.addActionListener(e -> {
            new ShopkeeperView();
            dispose();
        });

        setLayout(new GridLayout(2, 1, 10, 10));
        add(customerBtn);
        add(shopkeeperBtn);

        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
