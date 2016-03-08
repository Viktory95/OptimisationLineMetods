import javax.swing.*;

/**
 * Created by Ivan on 26.02.2016.
 */
public class OptimithationMetod extends JFrame {

    private JPanel OM;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel topPanel;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JTextArea textArea4;
    private JButton button1;


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
