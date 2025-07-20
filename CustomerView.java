import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerView extends JFrame {
    JTextField searchField, minField, maxField;
    DefaultListModel<String> model = new DefaultListModel<>();

    public CustomerView() {
        super("Customer - Browse Products");

        searchField = new JTextField(15);
        minField = new JTextField("0", 5);
        maxField = new JTextField("1000", 5);
        JButton filterBtn = new JButton("Filter");

        JList<String> list = new JList<>(model);
        JScrollPane scroll = new JScrollPane(list);

        filterBtn.addActionListener(e -> filterProducts());

        JPanel filterPanel = new JPanel();
        filterPanel.add(new JLabel("Search:"));
        filterPanel.add(searchField);
        filterPanel.add(new JLabel("Min ₹:"));
        filterPanel.add(minField);
        filterPanel.add(new JLabel("Max ₹:"));
        filterPanel.add(maxField);
        filterPanel.add(filterBtn);

        add(filterPanel, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);

        filterProducts();

        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    void filterProducts() {
        model.clear();
        String q = searchField.getText().toLowerCase();
        double min = Double.parseDouble(minField.getText());
        double max = Double.parseDouble(maxField.getText());

        List<Product> filtered = ProductStore.getAllProducts().stream()
            .filter(p -> p.name.toLowerCase().contains(q))
            .filter(p -> p.price >= min && p.price <= max)
            .sorted((a, b) -> Double.compare(a.price, b.price))
            .collect(Collectors.toList());

        for (Product p : filtered) {
            model.addElement(p.toString());
        }
    }
}
