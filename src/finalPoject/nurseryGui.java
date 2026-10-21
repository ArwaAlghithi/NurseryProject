package finalPoject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class nurseryGui extends JFrame {
    JButton t1, t2;
    JTextField f1, f2, f3, f4, f5;
    JLabel j1, j2, j3, j4, j5, j6;
    JPanel q;
    JScrollPane p1;

    public enum specialneeds {
        NONE,
        PHYSICAL,
        MENTAL,
        BOTH;
    }

    public nurseryGui(String title) {
        super(title);
        setComponents();
        setLayout();
        setActions();
    }

    public void setComponents() {
        t1 = new JButton("send");
        t2 = new JButton("cancel");

        f1 = new JTextField(15);
        f2 = new JTextField(15);
        f3 = new JTextField(15);
        f4 = new JTextField(15);
        f5 = new JTextField(15);
       

        JComboBox<specialneeds> box = new JComboBox<>(specialneeds.values());
        p1 = new JScrollPane(box);

        j1 = new JLabel("Enter name:");
        j2 = new JLabel("Enter age:");
        j3 = new JLabel("Enter gender:");
        j4 = new JLabel("Enter ID:");
        j5 = new JLabel("Enter Contact number:");
        j6 = new JLabel("Any special needs:");
    }

    public void setLayout() {
        q = new JPanel();
        q.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 1;
        q.add(j1, c);

        c.gridx = 0;
        c.gridy = 2;
        q.add(j2, c);

        c.gridx = 0;
        c.gridy = 3;
        q.add(j3, c);

        c.gridx = 0;
        c.gridy = 4;
        q.add(j4, c);

        c.gridx = 0;
        c.gridy = 5;
        q.add(j5, c);

        c.gridx = 0;
        c.gridy = 6;
        q.add(j6, c);

        c.gridx = 1;
        c.gridy = 1;
        q.add(f1, c);

        c.gridx = 1;
        c.gridy = 2;
        q.add(f2, c);

        c.gridx = 1;
        c.gridy = 3;
        q.add(f3, c);

        c.gridx = 1;
        c.gridy = 4;
        q.add(f4, c);

        c.gridx = 1;
        c.gridy = 5;
        q.add(f5, c);

        c.gridx = 1;
        c.gridy = 6;
        q.add(p1, c);

        c.gridx = 0;
        c.gridy = 9;
        q.add(t1, c);

        c.gridx = 1;
        c.gridy = 9;
        q.add(t2, c);

        this.add(q);
        this.pack();
    }

    private void cancel(ActionEvent e) {
        f1.setText("");
        f2.setText("");
        f3.setText("");
        f4.setText("");
        f5.setText("");
        
    }

    private boolean valid() {
        return !f1.getText().isEmpty() &&
               !f2.getText().isEmpty() &&
               !f3.getText().isEmpty() &&
               !f4.getText().isEmpty() &&
               !f5.getText().isEmpty() ;
               
    }

    private void showError() {
        JOptionPane.showMessageDialog(null,
                "All fields must be filled out!", "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void setActions() {
        t1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (valid()) {
                    message(e);
                } else {
                    showError();
                }
            }
        });

        t2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cancel(e);
            }
        });
    }

    public void message(ActionEvent a) {
        JOptionPane.showMessageDialog(null, "Done! We'll contact you soon.");
    }

    public void frame() {
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
       
            nurseryGui r = new nurseryGui("Nursery application");
            r.frame();
        
    }
}
