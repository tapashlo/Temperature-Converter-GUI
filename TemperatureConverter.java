import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Temp {

    public static JFrame mainFrame;
    public static JLabel celsiusLabel;
    public static JTextField celsiusText;
    public static JLabel fahrenheitLabel;
    public static JTextField fahrenheitText;
    public static JButton btnCToF;
    public static JButton btnFToC;


    public static void main(String[] args) {
        //Comment goes here
        //Setting up the whole frame

        mainFrame = new JFrame("Temperature Converter");
        mainFrame.setSize(150, 200);
        mainFrame.setLayout(new FlowLayout());


        //Create the elements

        celsiusLabel = new JLabel("Celsius");
        celsiusText = new JTextField(10);
        fahrenheitLabel = new JLabel("Fahrenheit:");
        fahrenheitText = new JTextField(10);

        btnCToF = new JButton("C To F");
        //Adding action to buttons

        btnCToF.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //Convert C to F
                        String cText = celsiusText.getText();
                        double c = Double.parseDouble(cText);
                        double f = (c * 9/5) +32;
                        fahrenheitText.setText(String.valueOf(f));


                    }
                }
        );

        btnFToC = new JButton("F To C");

        //Adding a listener

        btnFToC.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //Converts f to c
                        String fText = fahrenheitText.getText();
                        double f = Double.parseDouble(fText);
                        double c = (f -32) * 5/9*1.00;
                        celsiusText.setText(String.valueOf(c));

                    }
                }
        );



        //add the labels to the frame

        mainFrame.add(celsiusLabel);
        mainFrame.add(celsiusText);
        mainFrame.add(fahrenheitLabel);
        mainFrame.add(fahrenheitText);
        mainFrame.add(btnCToF);
        mainFrame.add(btnFToC);




        //Make the frame visible

        mainFrame.setVisible(true);


    }
}
