
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("PO2_Lab4_Tomasz_Ciuła_S5_D2_148792");
        TextField name = new TextField("Podaj Imię");
        TextField age = new TextField("Podaj wiek");
        Label label = new Label();
        Button calculate = new Button("Oblicz");
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = name.getText();
                Integer a = Integer.parseInt(age.getText());
                label.setText(n + ", masz za sobą " + (a*365) + " dni życia");
            }
        });
        Panel p = new Panel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        p.add(name);
        p.add(age);
        p.add(calculate);
        p.add(label);

        frame.add(p);
        frame.setSize(400, 300);
        frame.setLocation(300, 300);
        frame.setVisible(true);


    }
}