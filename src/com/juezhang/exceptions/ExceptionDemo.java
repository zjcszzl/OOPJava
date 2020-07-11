package com.juezhang.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
    public static void show(){
        //sayHello(null);
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
            int value = reader.read();
            System.out.println("File Opened");
        } catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        } catch (IOException e){
            System.out.println("Could not read data");
        } finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
