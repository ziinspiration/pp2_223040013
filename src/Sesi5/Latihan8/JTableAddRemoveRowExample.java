package Sesi5.Latihan8;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTableAddRemoveRowExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Add/Remove Row Example");
        String[] columnNames = { "ID", "Name", "Age" };
        DefaultTableModel model = new DefaultTableModel(columnNames, 0); // Model dengan 0 baris awal
        JTable table = new JTable(model);

        JButton addButton = new JButton("Add Row");
        addButton.setBounds(50, 220, 100, 30);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object[] newRow = { model.getRowCount() + 1, "New Name", 20 };
                model.addRow(newRow);
            }
        });

        JButton removeButton = new JButton("Remove Row");
        removeButton.setBounds(160, 220, 120, 30);
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    model.removeRow(selectedRow);
                }
            }
        });

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 20, 300, 180);

        frame.setLayout(null);
        frame.add(scrollPane);
        frame.add(addButton);
        frame.add(removeButton);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}