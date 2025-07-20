import javax.swing.*;
import java.awt.*;

public class ShopkeeperView extends JFrame {
    JTextField nameField, priceField, storeField;

    public ShopkeeperView() {
        super("Shopkeeper - Add Product");

        nameField = new JTextField(15);
        priceField = new JTextField(15);
        storeField = new JTextField(15);

        JButton addBtn = new JButton("Add Product");

        addBtn.addActionListener(e -> {
            String name = nameField.getText();
            double price = Double.parseDouble(priceField.getText());
            String store = storeField.getText();

            Product p = new Product(name, price, store);
            ProductStore.addProduct(p);

            JOptionPane.showMessageDialog(this, "Product Added!");
            nameField.setText(""); priceField.setText(""); storeField.setText("");
        });

        setLayout(new GridLayout(5, 2, 5, 5));
        add(new JLabel("Product Name:"));
        add(nameField);
        add(new JLabel("Price:"));
        add(priceField);
        add(new JLabel("Store Name:"));
        add(storeField);
        add(new JLabel(""));
        add(addBtn);

        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
