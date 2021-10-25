package ru.vsu.garaba;

import java.awt.*;

public class Cloud {
    public Cloud(Graphics2D gr, int screenWidth, int screenHeight) {
        drawCloud(gr, screenWidth, screenHeight);
    }

    private void drawCloud(Graphics2D gr, int screenWidth, int screenHeight) {
        int x1 = 250;
        int y1 = 80;

        gr.setPaint(new Color(0xFF8B8888, true));

        gr.fillArc((int) (screenWidth / 4.4), (int) (screenHeight / 7.2727), (int) (screenWidth / 12.222), (int) (screenHeight / 13.333), 0, 360);//1
        gr.fillArc((int) (screenWidth / 3.4375), (int) (screenHeight / 7.2727), (int) (screenWidth / 12.222), (int) (screenHeight / 13.333), 0, 360);//9
        gr.fillArc((int) (screenWidth / 2.8205), (int) (screenHeight / 7.2727), (int) (screenWidth / 12.222), (int) (screenHeight / 13.333), 0, 360);//8
        gr.fillArc((int) (screenWidth / 2.5), (int) (screenHeight / 7.2727), (int) (screenWidth / 12.222), (int) (screenHeight / 13.333), 0, 360);//7
        gr.fillArc((int) (screenWidth / 3.666), (int) (screenHeight / 10.0), (int) (screenWidth / 12.222), (int) (screenHeight / 13.333), 0, 360);//2
        gr.fillArc((int) (screenWidth / 2.75), (int) (screenHeight / 10.0), (int) (screenWidth / 12.222), (int) (screenHeight / 13.333), 0, 360);//4
        gr.fillArc((int) (screenWidth / 3.1), (int) (screenHeight / 12.5), (int) (screenWidth / 13.333), (int) (screenHeight / 13.333), 0, 360);//4

        int x2 = 650;
        int y2 = 80;

        gr.setPaint(new Color(0xFF8B8888, true));

        gr.fillArc((int) (screenWidth / 1.69), (int) (screenHeight / 7.2727), (int) (screenWidth / 12.222), (int) (screenHeight / 13.333), 0, 360);//1
        gr.fillArc((int) (screenWidth / 1.527), (int) (screenHeight / 7.2727), (int) (screenWidth / 12.222), (int) (screenHeight / 13.333), 0, 360);//9
        gr.fillArc((int) (screenWidth / 1.392), (int) (screenHeight / 7.2727), (int) (screenWidth / 12.222), (int) (screenHeight / 13.333), 0, 360);//8
        gr.fillArc((int) (screenWidth / 1.309), (int) (screenHeight / 7.2727), (int) (screenWidth / 12.222), (int) (screenHeight / 13.333), 0, 360);//7
        gr.fillArc((int) (screenWidth / 1.571), (int) (screenHeight / 10.0), (int) (screenWidth / 12.222), (int) (screenHeight / 13.333), 0, 360);//2
        gr.fillArc((int) (screenWidth / 1.375), (int) (screenHeight / 10.0), (int) (screenWidth / 12.222), (int) (screenHeight / 13.333), 0, 360);//4
        gr.fillArc((int) (screenWidth / 1.466), (int) (screenHeight / 13.333), (int) (screenWidth / 13.333), (int) (screenHeight / 13.333), 0, 360);//4


    }

}
