package convert;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * * @author koehenri
 */
public class Listener
implements ActionListener {

    private ConversionFactors convFactor;
    private boolean invert;
    private JTextField from;
    private JTextField to;

    public Listener(ConversionFactors cf, boolean inv, JTextField fro, JTextField to) {
        convFactor = cf;
        invert = inv;
        from = fro;
        this.to = to;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // The 'from' field contains an integer, which we need.
        Scanner reader = new Scanner(from.getText());
        double source = 0;
        try {
            source = Double.parseDouble(reader.nextLine());
        } catch (NumberFormatException ex) {
            source = 1;
        }
        if (invert) {
            to.setText("" + (source / convFactor.getValue()));
        } else {
            to.setText("" + (source * convFactor.getValue()));
        }
    }

}
