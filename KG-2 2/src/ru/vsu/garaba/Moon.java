package ru.vsu.garaba;

import java.awt.*;

public class Moon {

    public Moon(Graphics2D gr, int screenWidth, int screenHeight) {

        drawMoon(gr, screenWidth, screenHeight);
    }

    private void drawMoon(Graphics2D gr, int screenWidth, int screenHeight) {

        gr.setPaint(new Color(0xCDC7AB));//присвоение цвета луне
        gr.fillOval((int) (screenWidth / 31.428), (int) (screenHeight / 40.0),
                (int) (screenWidth / 11.0), (int) (screenHeight / 8.0));//рисуем луну по координатам


        gr.setPaint(new Color(0x050400));
        gr.fillOval(0, (int) (screenHeight / 40.0), (int) (screenWidth / 11.0), (int) (screenHeight / 8.0));


        gr.setPaint(new Color(0xC6BDBD));
        gr.fillOval((int) (screenWidth / 1.294), (int) (screenHeight / 3.2), (int) (screenWidth / 5.5), (int) (screenHeight / 4.0));


    }


}
