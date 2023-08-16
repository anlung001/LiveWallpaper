package com.LIVE.window;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class WALLPAPER_VOID {
        void _ARGUMENT(){
            String cmd = "wallpaperEngine//wallpaper32.exe -control hideIcons";
            try {
                Process process = Runtime.getRuntime().exec(cmd);
                InputStream is = process.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String content = br.readLine();
                while (content != null) {
                    System.out.println(content);
                    content = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static void EXE_PASS() {
            WALLPAPER_VOID Run =new WALLPAPER_VOID();
            Run._ARGUMENT();
        }
}