package org.ea;

import java.awt.Robot;
import java.awt.event.InputEvent;

public class AutoClick {
    public static void main(String[] args) {
        try{
            while (true) {
                Robot r = new Robot();
                int button = InputEvent.BUTTON1_DOWN_MASK;
                System.out.println("click");
                r.mousePress(button);
                Thread.sleep(400);
                r.mouseRelease(button);
                Thread.sleep(2 * 60 * 1000);
            }
        }catch (Exception e) {
            e.printStackTrace();

        }

    }
}