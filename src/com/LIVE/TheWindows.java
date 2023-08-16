package com.LIVE;
import  com.LIVE.window.WAPAPER_browser.BROWSER;
import javax.swing.JFrame;

public class TheWindows extends JFrame {
    public static void START_WINDOW() {
        JFrame Start_GUI = new JFrame("LIVE WALLPAPER");
        Start_GUI.setSize(100,100);
        Start_GUI.show(true);
        int DETERMINE_WHETHER_TO_CLOSE_WINDOW = 1;
        /*
        此代码是用来创建窗口用的
         */

        if ( DETERMINE_WHETHER_TO_CLOSE_WINDOW == 1) {
            Start_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //结束窗口所在应用程序
        }
     }
}