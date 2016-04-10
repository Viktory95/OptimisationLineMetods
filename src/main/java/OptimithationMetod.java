import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ivan on 26.02.2016.
 */
public class OptimithationMetod extends JFrame {

    private JPanel OM;
    private JPanel leftPanel;
    private JPanel rightPanel;
    public JTextArea textArea1;
    public JTextArea textArea2;
    private JTextArea textArea3;
    private JTextArea textArea4;
    public JButton tapButton;
    public JTextArea textArea5;
    public JTextArea textArea6;
    private JTextArea textArea7;
    private JTextArea textArea8;
    public JTextArea textArea9;
    public JTextArea textArea10;
    private JPanel bottomPanel;
    private JTextArea textArea11;
    private JTextArea textArea12;


    public OptimithationMetod(){
        setContentPane(OM);
        setTitle("OptimisationMethod");
        //setContentPane(new OptimithationMetod().getContentPane());
        setLocationRelativeTo(null);
        setSize(100, 100);
        pack();
        tapButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HalfLine HL = new HalfLine(); //Экземпляр класса метода деления отрезка пополам
                GoldenSection GS = new GoldenSection(); //Экземпляр класса метода золотого сечения
                Parabola P = new Parabola();
                Newton N = new Newton();

                HL.Left = Double.parseDouble(textArea9.getText());
                HL.Right = Double.parseDouble(textArea10.getText());

                GS.Left = Double.parseDouble(textArea9.getText());
                GS.Right = Double.parseDouble(textArea10.getText());

                P.U1 = Double.parseDouble(textArea9.getText());
                P.U3 = Double.parseDouble(textArea10.getText());
                P.U2 = (P.U3 - P.U1)/2/* - 0.0028*/;

                N.U = Double.parseDouble(textArea9.getText());

                HL.deviation = Double.parseDouble(textArea11.getText());
                HL.Capacity = Double.parseDouble(textArea12.getText());

                GS.deviation = Double.parseDouble(textArea11.getText());

                N.Capacity = Double.parseDouble(textArea12.getText());

                HL.Recoursive();
                GS.Recoursive();
                P.Recoursive();
                N.Recoursive();

                textArea1.setText(Integer.toString(HL.iteration));
                textArea5.setText(Double.toString(HL.FunctionResult));

                textArea2.setText(Integer.toString(GS.iteration));
                textArea6.setText(Double.toString(GS.FunctionResult));

                textArea3.setText(Integer.toString(P.iteration));
                textArea7.setText(Double.toString(P.FunctionResult));

                textArea4.setText(Integer.toString(N.iteration));
                textArea8.setText(Double.toString(N.FunctionResult));
            }
        });
       // textArea1 = new JTextArea();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }



}
