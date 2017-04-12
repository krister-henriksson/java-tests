package convert;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicConverter implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Converter");
        frame.setPreferredSize(new Dimension(1000, 500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout_super = new GridLayout(1, 4);
        container.setLayout(layout_super);

        double input = 0;

        JTextField textFieldL = new JTextField("" + input);
        JTextField textFieldR = new JTextField("0.0");

        // *******************************************************
        GridLayout layout_subL = new GridLayout(7, 1);
        JPanel panelL = new JPanel(layout_subL);

        JButton buttonInchCM = new JButton("Inch to Centimeter");
        JButton buttonFootM = new JButton("Foot to Meter");
        JButton buttonYardM = new JButton("Yard to Meter");
        JButton buttonMileKM = new JButton("Imperial Mile to Kilometer");
        JButton buttonOunceG = new JButton("Ounce to Gram");
        JButton buttonFluidOunceCL = new JButton("Fluid Ounce to Centiliter");
        JButton buttonPoundKG = new JButton("Imperial Pound to Kilogram");

        Listener listInchM = new Listener(ConversionFactors.INCH_TO_CM, false, textFieldL, textFieldR);
        buttonInchCM.addActionListener(listInchM);
        Listener listFootM = new Listener(ConversionFactors.FOOT_TO_M, false, textFieldL, textFieldR);
        buttonFootM.addActionListener(listFootM);
        Listener listYardM = new Listener(ConversionFactors.YARD_TO_M, false, textFieldL, textFieldR);
        buttonYardM.addActionListener(listYardM);
        Listener listMileKM = new Listener(ConversionFactors.IMP_MILE_TO_KM, false, textFieldL, textFieldR);
        buttonMileKM.addActionListener(listMileKM);
        Listener listOunceG = new Listener(ConversionFactors.OUNCE_TO_G, false, textFieldL, textFieldR);
        buttonOunceG.addActionListener(listOunceG);
        Listener listFluidOunceCL = new Listener(ConversionFactors.FLOUNCE_TO_CL, false, textFieldL, textFieldR);
        buttonFluidOunceCL.addActionListener(listFluidOunceCL);
        Listener listPoundKG = new Listener(ConversionFactors.IMP_POUND_TO_KG, false, textFieldL, textFieldR);
        buttonPoundKG.addActionListener(listPoundKG);

        panelL.add(buttonInchCM);
        panelL.add(buttonFootM);
        panelL.add(buttonYardM);
        panelL.add(buttonMileKM);
        panelL.add(buttonOunceG);
        panelL.add(buttonFluidOunceCL);
        panelL.add(buttonPoundKG);

        // *******************************************************
        GridLayout layout_subR = new GridLayout(7, 1);
        JPanel panelR = new JPanel(layout_subR);

        JButton buttonInchCMrev = new JButton("Centimeter to Inch");
        JButton buttonFootMrev = new JButton("Meter to Foot");
        JButton buttonYardMrev = new JButton("Meter to Yard");
        JButton buttonMileKMrev = new JButton("Kilometer to Imperial Mile");
        JButton buttonOunceGrev = new JButton("Gram to Ounce");
        JButton buttonFluidOunceCLrev = new JButton("Centiliter to Fluid Ounce");
        JButton buttonPoundKGrev = new JButton("Kilogram to Imperial Pound");

        Listener listInchMrev = new Listener(ConversionFactors.INCH_TO_CM, true, textFieldL, textFieldR);
        buttonInchCMrev.addActionListener(listInchMrev);
        Listener listFootMrev = new Listener(ConversionFactors.FOOT_TO_M, true, textFieldL, textFieldR);
        buttonFootMrev.addActionListener(listFootMrev);
        Listener listYardMrev = new Listener(ConversionFactors.YARD_TO_M, true, textFieldL, textFieldR);
        buttonYardMrev.addActionListener(listYardMrev);
        Listener listMileKMrev = new Listener(ConversionFactors.IMP_MILE_TO_KM, true, textFieldL, textFieldR);
        buttonMileKMrev.addActionListener(listMileKMrev);
        Listener listOunceGrev = new Listener(ConversionFactors.OUNCE_TO_G, true, textFieldL, textFieldR);
        buttonOunceGrev.addActionListener(listOunceGrev);
        Listener listFluidOunceCLrev = new Listener(ConversionFactors.FLOUNCE_TO_CL, true, textFieldL, textFieldR);
        buttonFluidOunceCLrev.addActionListener(listFluidOunceCLrev);
        Listener listPoundKGrev = new Listener(ConversionFactors.IMP_POUND_TO_KG, true, textFieldL, textFieldR);
        buttonPoundKGrev.addActionListener(listPoundKGrev);

        panelR.add(buttonInchCMrev);
        panelR.add(buttonFootMrev);
        panelR.add(buttonYardMrev);
        panelR.add(buttonMileKMrev);
        panelR.add(buttonOunceGrev);
        panelR.add(buttonFluidOunceCLrev);
        panelR.add(buttonPoundKGrev);

        // *******************************************************
        container.add(textFieldL);
        container.add(panelL);
        container.add(panelR);
        container.add(textFieldR);

    }

    public JFrame getFrame() {
        return frame;
    }
}
