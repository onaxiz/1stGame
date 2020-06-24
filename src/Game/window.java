package Game;
import javax.swing.*;
import java.awt.*;

public class window {
    public static void main(String[] args)
    {

        JFrame startFrame = new JFrame("game");
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startFrame.setLocation(0, 0);// имзменяем местоположение фрейма.
        Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
        startFrame.setSize(screenSize);
        //startFrame.setSize(1024,680); // размер окна
        startFrame.add(new Panel());

        //Panel panel = new Panel();// создаём объект панель
        //startFrame.setContentPane(panel); // перенос в фрейм панели с Panel

        //panel.mainTimer.start();// запуск Таймера

        // окно видемо
        startFrame.setVisible(true);
    }
}

