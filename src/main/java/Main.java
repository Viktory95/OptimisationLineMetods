import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;

/**
 * Created by Ivan on 26.02.2016.
 */

public class Main {
    public static void main(String[] args){
        OptimithationMetod optimithationMetod =new OptimithationMetod(); //Экземпляр класса окна
        ButtonActionListner actionListner = new ButtonActionListner(); //Экземпляр слушателя кнопки
        System.out.println(optimithationMetod.getContentPane().getX()+optimithationMetod.getContentPane().getY());
      //optmithationMetod.setVisible(true);
        optimithationMetod.tapButton.addActionListener(actionListner);//Подключение слушателя к кнопке
    }
}

class ButtonActionListner implements ActionListener {
    HalfLine HL = new HalfLine(); //Экземпляр класса метода деления отрезка пополам
    GoldenSection GS = new GoldenSection(); //Экземпляр класса метода золотого сечения
    OptimithationMetod optimithationMetod =new OptimithationMetod();
    public void actionPerformed(ActionEvent e) {
        HL.Left = Double.parseDouble(optimithationMetod.textArea9.getText());
        HL.Right = Double.parseDouble(optimithationMetod.textArea10.getText());
        HL.Recoursive();
        GS.Recoursive();
        optimithationMetod.textArea1.append(Integer.toString(HL.iteration));
        optimithationMetod.textArea5.append(Double.toString(HL.FunctionResult));

        optimithationMetod.textArea2.append(Integer.toString(GS.iteration));
        optimithationMetod.textArea6.append(Double.toString(GS.FunctionResult));
    }

}