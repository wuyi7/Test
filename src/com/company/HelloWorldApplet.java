package com.company;

import java.applet.Applet;
import java.awt.*;

/**
 * @Author: WuYi at 2022-06-19 18:29
 * @Description:
 * @Version:1.0
 */
public class HelloWorldApplet extends Applet {
    public void paint (Graphics g)
    {
        g.drawString ("Hello World", 25, 50);
    }
}
