package com.thssh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by hth on 2017/6/27.
 */

class FileUtils {
    public static void write(String text) {
//        writer.
        FileWriter writer = null;
//        FileOutputStream fos = null;
        try {
//             fos = new FileOutputStream(new File("/Users/hth/Desktop/log"));
            writer = new FileWriter(new File("/Users/hth/Desktop/log"));
            writer.write(text);
//            fos.write(text.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
