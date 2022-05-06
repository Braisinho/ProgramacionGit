package interfazBD;

import javax.swing.*;
import java.awt.*;

public class TableSortDemo extends JPanel {

    private JTable table;
    private JScrollPane scrollPane;

    public TableSortDemo() {
        table = new JTable(new MyTableModel());
        table.setPreferredScrollableViewportSize(new Dimension(500, 250));
        table.setFillsViewportHeight(true);
        table.setAutoCreateRowSorter(true);
        scrollPane = new JScrollPane(table);
        add(scrollPane);
    }
}
