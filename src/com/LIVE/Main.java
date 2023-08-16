package com.LIVE;
import com.LIVE.window.WALLPAPER_VOID;

public class Main {
    public static void main(String[] args) {

        class test extends Thread{
            @Override
            public void run() {
                WALLPAPER_VOID.EXE_PASS();
            }
        }

        TheWindows.START_WINDOW();

        new test().start();//启用一个线程
    }
}