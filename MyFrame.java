import Package1.Task;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
    int height = 12;
    int width = 7;
    int multiplyer = 40;

    public MyFrame() {
        Task task1 = new Task("Task1");
        Task task2 = new Task("Task2");
        Task task3 = new Task("Task3");

        Font tasksFont = new Font("Arial", Font.BOLD, 18);
        JLabel label0 = new JLabel("Tasks");
        label0.setBorder(BorderFactory.createEmptyBorder(10, 40, 10, 0));
        label0.setFont(tasksFont);

        JCheckBox checkBox1 = new JCheckBox(task1.getName());
        checkBox1.addItemListener(new TaskItemListener(task1));
        JCheckBox checkBox2 = new JCheckBox(task2.getName());
        checkBox2.addItemListener(new TaskItemListener(task3));
        JCheckBox checkBox3 = new JCheckBox(task3.getName());
        checkBox3.addItemListener(new TaskItemListener(task3));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 0, 10));
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);
        panel.setBorder(BorderFactory.createEmptyBorder(0, 50, 350, 0));

        this.add(label0, BorderLayout.NORTH);
        this.add(panel);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(width * multiplyer, height * multiplyer);
        this.setResizable(false);
        this.setVisible(true);
    }

}
