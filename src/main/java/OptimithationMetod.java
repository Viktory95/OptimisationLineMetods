import javax.swing.*;

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


    public OptimithationMetod(){
        setContentPane(OM);
        setTitle("OptimisationMethod");
        //setContentPane(new OptimithationMetod().getContentPane());
        setLocationRelativeTo(null);
        setSize(100, 100);
        pack();
       // textArea1 = new JTextArea();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }



}
