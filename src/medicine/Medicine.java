package medicine;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Medicine {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1200, 800);
        frame.setTitle("Medicine List");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        ImageIcon icon;
        icon = new ImageIcon("img/img.png");
        JLabel image = new JLabel();
        image.setBounds(200, 20, 247, 50);
        image.setIcon(icon);
        frame.add(image);

        JLabel l1 = new JLabel();
        l1.setBounds(250, 80, 200, 25);
        l1.setText("Medicine List");
        Font font1 = new Font(" Brush Script MT", Font.BOLD, 24);
        l1.setFont(font1);
        l1.setForeground(Color.BLACK);
        frame.add(l1);

        // medicine 1
        JCheckBox cb1 = new JCheckBox("Angilock 50");
        cb1.setBounds(150, 200, 140, 25);
        Font font2 = new Font("Arial", Font.BOLD, 16);
        cb1.setFont(font2);
        frame.add(cb1);

        JTextField t1 = new JTextField();
        t1.setBounds(290, 200, 100, 25);
        Font font3 = new Font("Brush Script MT", Font.PLAIN, 16);
        t1.setFont(font3);
        frame.add(t1);

        String[] medicine1 = {"Strip", "Box"};
        JComboBox<String> comboBox1 = new JComboBox<>(medicine1);
        comboBox1.setBounds(430, 200, 100, 25);
        Font font4 = new Font("Brush Script MT", Font.PLAIN, 17);
        comboBox1.setFont(font4);
        frame.add(comboBox1);

        // medicine 2 
        JCheckBox cb2 = new JCheckBox("Bislol 10");
        cb2.setBounds(150, 250, 140, 25);
        Font font5 = new Font("Arial", Font.BOLD, 16);
        cb2.setFont(font5);
        frame.add(cb2);

        JTextField t2 = new JTextField();
        t2.setBounds(290, 250, 100, 25);
        Font font6 = new Font("Brush Script MT", Font.PLAIN, 16);
        t2.setFont(font6);
        frame.add(t2);

        String[] medicine2 = {"Strip", "Box"};
        JComboBox<String> comboBox2 = new JComboBox<>(medicine2);
        comboBox2.setBounds(430, 250, 100, 25);
        Font font7 = new Font("Brush Script MT", Font.PLAIN, 17);
        comboBox2.setFont(font7);
        frame.add(comboBox2);

        // medicine 3 
        JCheckBox cb3 = new JCheckBox("Bizoran 5/40");
        cb3.setBounds(150, 300, 140, 25);
        Font font8 = new Font("Arial", Font.BOLD, 16);
        cb3.setFont(font8);
        frame.add(cb3);

        JTextField t3 = new JTextField();
        t3.setBounds(290, 300, 100, 25);
        Font font9 = new Font("Brush Script MT", Font.PLAIN, 16);
        t3.setFont(font9);
        frame.add(t3);

        String[] medicine3 = {"Strip", "Box"};
        JComboBox<String> comboBox3 = new JComboBox<>(medicine3);
        comboBox3.setBounds(430, 300, 100, 25);
        Font font10 = new Font("Brush Script MT", Font.PLAIN, 17);
        comboBox3.setFont(font10);
        frame.add(comboBox3);

        // medicine 4 
        JCheckBox cb4 = new JCheckBox("DDR 30");
        cb4.setBounds(150, 350, 140, 25);
        Font font11 = new Font("Arial", Font.BOLD, 16);
        cb4.setFont(font11);
        frame.add(cb4);

        JTextField t4 = new JTextField();
        t4.setBounds(290, 350, 100, 25);
        Font font12 = new Font("Brush Script MT", Font.PLAIN, 16);
        t4.setFont(font12);
        frame.add(t4);

        String[] medicine4 = {"Strip", "Box"};
        JComboBox<String> comboBox4 = new JComboBox<>(medicine4);
        comboBox4.setBounds(430, 350, 100, 25);
        Font font13 = new Font("Brush Script MT", Font.PLAIN, 17);
        comboBox4.setFont(font13);
        frame.add(comboBox4);

        // medicine 5
        JCheckBox cb5 = new JCheckBox("Emazid 25");
        cb5.setBounds(150, 400, 140, 25);
        Font font14 = new Font("Arial", Font.BOLD, 16);
        cb5.setFont(font14);
        frame.add(cb5);

        JTextField t5 = new JTextField();
        t5.setBounds(290, 400, 100, 25);
        Font font15 = new Font("Brush Script MT", Font.PLAIN, 16);
        t5.setFont(font15);
        frame.add(t5);

        String[] medicine5 = {"Strip", "Box"};
        JComboBox<String> comboBox5 = new JComboBox<>(medicine5);
        comboBox5.setBounds(430, 400, 100, 25);
        Font font16 = new Font("Brush Script MT", Font.PLAIN, 17);
        comboBox5.setFont(font16);
        frame.add(comboBox5);

        // medicine 6
        JCheckBox cb6 = new JCheckBox("Thyros 50");
        cb6.setBounds(150, 450, 140, 25);
        Font font17 = new Font("Arial", Font.BOLD, 16);
        cb6.setFont(font17);
        frame.add(cb6);

        JTextField t6 = new JTextField();
        t6.setBounds(290, 450, 100, 25);
        Font font18 = new Font("Brush Script MT", Font.PLAIN, 16);
        t6.setFont(font18);
        frame.add(t6);

        String[] medicine6 = {"Strip", "Box"};
        JComboBox<String> comboBox6 = new JComboBox<>(medicine6);
        comboBox6.setBounds(430, 450, 100, 25);
        Font font19 = new Font("Brush Script MT", Font.PLAIN, 17);
        comboBox6.setFont(font19);
        frame.add(comboBox6);

        // medicine 7
        JCheckBox cb7 = new JCheckBox("Uromax");
        cb7.setBounds(150, 500, 140, 25);
        Font font20 = new Font("Arial", Font.BOLD, 16);
        cb7.setFont(font20);
        frame.add(cb7);

        JTextField t7 = new JTextField();
        t7.setBounds(290, 500, 100, 25);
        Font font21 = new Font("Brush Script MT", Font.PLAIN, 16);
        t7.setFont(font21);
        frame.add(t7);

        String[] medicine7 = {"Strip", "Box"};
        JComboBox<String> comboBox7 = new JComboBox<>(medicine7);
        comboBox7.setBounds(430, 500, 100, 25);
        Font font22 = new Font("Brush Script MT", Font.PLAIN, 17);
        comboBox7.setFont(font22);
        frame.add(comboBox7);

        // medicine 8
        JCheckBox cb8 = new JCheckBox("Dulos 30");
        cb8.setBounds(150, 550, 140, 25);
        Font font23 = new Font("Arial", Font.BOLD, 16);
        cb8.setFont(font23);
        frame.add(cb8);

        JTextField t8 = new JTextField();
        t8.setBounds(290, 550, 100, 25);
        Font font24 = new Font("Brush Script MT", Font.PLAIN, 16);
        t8.setFont(font24);
        frame.add(t8);

        String[] medicine8 = {"Strip", "Box"};
        JComboBox<String> comboBox8 = new JComboBox<>(medicine8);
        comboBox8.setBounds(430, 550, 100, 25);
        Font font25 = new Font("Brush Script MT", Font.PLAIN, 17);
        comboBox8.setFont(font25);
        frame.add(comboBox8);

        JButton btn = new JButton("Calculate");
        btn.setBounds(300, 650, 100, 30);
        frame.add(btn);

        JLabel totalField = new JLabel();

        Font fontlf = new Font("Brush Script MT", Font.BOLD, 17);
        totalField.setFont(fontlf);
        totalField.setBounds(880, 400, 60, 25);
        frame.add(totalField);

        JLabel total = new JLabel();
        total.setBounds(940, 400, 100, 25);
        Font fonttotal = new Font("Brush Script MT", Font.BOLD, 17);
        total.setFont(fonttotal);
        frame.add(total);

        // Create column names for the table
        String[] columnNames = {"Item", "Price", "Qty", "Total"};

        // Create an empty table model
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        // Create the table using the table model
        JTable table = new JTable(tableModel);

        // Create a scroll pane to add the table
        JScrollPane scrollPane = new JScrollPane(table);

        scrollPane.setBounds(600, 200, 400, 200);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tableModel.setRowCount(0); // Clear previous data
                double sum = 0.0;
                if (cb1.isSelected()) {
                    String med = cb1.getText();
                    String mt = comboBox1.getSelectedItem().toString();
                    int qt = Integer.parseInt(t1.getText());
                    double p;
                    if (mt.equals("Strip")) {
                        p = qt * 50;
                        sum = sum + p;
                        tableModel.addRow(new Object[]{med, 50, qt, p});
                        frame.add(scrollPane);

                    } else {
                        p = qt * (50 * 4);
                        sum = sum + p;
                        tableModel.addRow(new Object[]{med, 50, qt, p});
                        frame.add(scrollPane);
                    }
                    totalField.setText("Total : ");
                }

                if (cb2.isSelected()) {
                    String med = cb2.getText();
                    String mt = comboBox2.getSelectedItem().toString();
                    int qt = Integer.parseInt(t2.getText());
                    double p;
                    if (mt.equals("Strip")) {
                        p = qt * 100;
                        sum = sum + p;
                        tableModel.addRow(new Object[]{med, 100, qt, p});
                        frame.add(scrollPane);

                    } else {

                        p = qt * (100 * 4);
                        sum = sum + p;
                        tableModel.addRow(new Object[]{med, 100, qt, p});
                        frame.add(scrollPane);
                    }
                    totalField.setText("Total : ");
                }

                if (cb3.isSelected()) {
                    String med = cb3.getText();
                    String mt = comboBox3.getSelectedItem().toString();
                    int qt = Integer.parseInt(t3.getText());
                    double p;
                    if (mt.equals("Strip")) {
                        p = qt * 120;
                        sum = sum + p;
                        tableModel.addRow(new Object[]{med, 120, qt, p});
                        frame.add(scrollPane);

                    } else {
                        p = qt * (120 * 4);
                        sum = sum + p;
                        tableModel.addRow(new Object[]{med, 120, qt, p});
                        frame.add(scrollPane);
                    }
                    totalField.setText("Total : ");
                }

                if (cb4.isSelected()) {
                    String med = cb4.getText();
                    String mt = comboBox4.getSelectedItem().toString();
                    int qt = Integer.parseInt(t4.getText());
                    double p;
                    if (mt.equals("Strip")) {
                        p = qt * 80;
                        sum = sum + p;
                        tableModel.addRow(new Object[]{med, 80, qt, p});
                        frame.add(scrollPane);

                    } else {
                        p = qt * (80 * 4);
                        sum = sum + p;
                        tableModel.addRow(new Object[]{med, 80, qt, p});
                        frame.add(scrollPane);
                    }
                    totalField.setText("Total : ");
                }

                if (cb5.isSelected()) {
                    String med = cb5.getText();
                    String mt = comboBox5.getSelectedItem().toString();
                    int qt = Integer.parseInt(t5.getText());
                    double p;
                    if (mt.equals("Strip")) {
                        p = qt * 90;
                        sum = sum + p;
                        tableModel.addRow(new Object[]{med, 90, qt, p});
                        frame.add(scrollPane);

                    } else {
                        p = qt * (90 * 4);
                        sum = sum + p;
                        tableModel.addRow(new Object[]{med, 90, qt, p});
                        frame.add(scrollPane);
                    }
                    totalField.setText("Total : ");
                }

                if (cb6.isSelected()) {
                    String med = cb6.getText();
                    String mt = comboBox6.getSelectedItem().toString();
                    int qt = Integer.parseInt(t6.getText());
                    double p;
                    if (mt.equals("Strip")) {
                        p = qt * 110;
                        sum = sum + p;
                        tableModel.addRow(new Object[]{med, 110, qt, p});
                        frame.add(scrollPane);

                    } else {
                        p = qt * (110 * 4);
                        sum = sum + p;
                        tableModel.addRow(new Object[]{med, 110, qt, p});
                        frame.add(scrollPane);
                    }
                    totalField.setText("Total : ");
                }

                if (cb7.isSelected()) {
                    String med = cb7.getText();
                    String mt = comboBox7.getSelectedItem().toString();
                    int qt = Integer.parseInt(t7.getText());
                    double p;
                    if (mt.equals("Strip")) {
                        p = qt * 140;
                        sum = sum + p;
                        tableModel.addRow(new Object[]{med, 140, qt, p});
                        frame.add(scrollPane);

                    } else {
                        p = qt * (140 * 4);
                        sum = sum + p;
                        tableModel.addRow(new Object[]{med, 140, qt, p});
                        frame.add(scrollPane);
                    }
                    totalField.setText("Total : ");
                }

                if (cb8.isSelected()) {
                    String med = cb8.getText();
                    String mt = comboBox8.getSelectedItem().toString();
                    int qt = Integer.parseInt(t8.getText());
                    double p;
                    if (mt.equals("Strip")) {
                        p = qt * 170;
                        sum = sum + p;
                        tableModel.addRow(new Object[]{med, 170, qt, p});
                        frame.add(scrollPane);

                    } else {
                        p = qt * (170 * 4);
                        sum = sum + p;
                        tableModel.addRow(new Object[]{med, 170, qt, p});
                        frame.add(scrollPane);
                    }
                    totalField.setText("Total : ");
                }

                total.setText(Double.toString(sum));

            }
        });

        frame.setVisible(true);
    }

}
