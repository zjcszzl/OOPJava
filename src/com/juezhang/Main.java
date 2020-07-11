package com.juezhang;

import com.juezhang.exceptions.ExceptionDemo;

import javax.xml.soap.Text;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ExceptionDemo.show();

        TextBox textBox1 = new TextBox();
        textBox1.setText("Box1");
        TextBox textBox2 = new TextBox();
        textBox2.setText("Box2");
        // heap: objects
        // stack: short variables
        Employee employee = new Employee(50_000,20);
        Employee otherEmployee = new Employee(50);
        System.out.println(employee.calculateWage(10));
        System.out.println(Employee.numberOfEmployees);
        Employee.printNumberOfEmployees();
        Browser browser = new Browser();
        browser.navigate("hhh");
        /*
        TextBox control = new TextBox();
        control.setText("Hello");
        System.out.println(control.toString());
        control.enable();
        control.disable();
        System.out.println(control.isEnabled());

        System.out.println(control.hashCode());

        //UIControl control1 = new UIControl(true);
        TextBox textbox = new TextBox();
        show(textbox);

        Point p3 = new Point(1,2);
        Point p4 = new Point(1,2);
        System.out.println(p3.equals(p4));
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());
        */
        UIControl[] controls = {new TextBox(), new CheckBox()};
        for(UIControl control : controls){
            control.render();
        }
    }

    public static void show(UIControl control){
        TextBox textbox = (TextBox)control;
        textbox.setText("Hello World");
        System.out.println(control);
    }

    public static void Types(){
        byte age = 30;
        int herAge = age;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;
        // primitive types: storing simple values
        // byte: 1, short: 2, int: 4, long: 8, float: 4, double: 8, char: 2, boolean: 1
        // reference types: complex objects like date, messages
        // primitive types vs reference types
        Point point1 = new Point(1,1);
        Point point2 = point1;
        // System.out.println(point2.x);
        point1.x = 3;
        // System.out.println(point2.x);
        Date now = new Date();
        // System.out.println(now.getTime());
        // Strings
        String msg = "Hello World";
        System.out.println(msg.endsWith("d"));
        System.out.println(msg.length());
        System.out.println(msg.indexOf("l"));
        System.out.println(msg.toUpperCase());
        System.out.println(msg.trim());
        // Escape Sequence: \", \', \\, \n, \t
        String message = "Hello \"Mike";
        System.out.println(message);
        // c:\windows\...
        System.out.println("c:\\windows\\...");
        // Arrays
        int[] numbers = new int[5];
        numbers[0] = 1;
        int[] nums = {1,2,3,4,5};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums.length);
        // Multi-dimensional Arrays
        int[][] matrix = new int[2][2];
        System.out.println(Arrays.deepToString(matrix));
        // Constant
        final float PI = 3.14F;
        // Arithmetic Expression: +, - , * , / , %, ++, --
        int result = 10 + 3;
        System.out.println(result);
        // Casting
        // Implicit casting: automatic, from small size to large size: byte->short->long->float->double
        short x = 1;
        int y = x + 2;
        System.out.println(y);
        // Integer.parseInt() --> convert String to Int
        double m = 2.28;
        int n = (int)m + 3;
        System.out.println(n);
        // Math class: ceil, floor, round, random,
        System.out.println(Math.round(3.8));
        // Formatting numbers
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        String res = currencyInstance.format(1234567.891);
        System.out.println(res);
        NumberFormat p = NumberFormat.getPercentInstance();
        String resu = p.format(0.1);
        System.out.println(resu);
        // Reading input
        Scanner scanner = new Scanner(System.in);
        byte Age = scanner.nextByte();
        // scanner.nextLine(): returns a string, can use all method string has
        // next: read one token, nextLine: read entire line
        System.out.println("You are " + Age);

    }

    public static void ControlFlow(){
        int x = 1;
        int y = 1;
        System.out.println(x==y);
        // Logical operator
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);
        // if
        if(temperature > 30){
            System.out.println("It's hot day");
        }else if(temperature > 22){
            System.out.println("it's warm");
        }else{
            System.out.println("it's cold");
        }
        int income = 120_000;
        boolean hasHighIncome = true;
        hasHighIncome = income > 170_000;
        if(income < 150_000)    hasHighIncome = false;
        System.out.println(hasHighIncome);
        // Ternary operator
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);
        // Switch statement
        String role = "admin";
        switch(role){
            case "admin":
                System.out.println("You are admin");
                break;
            case "moderator":
                System.out.println("You are moderator");
                break;
            default:
                System.out.println("You are a guest");
        }
        // For loop
        for(int i = 0; i < 5; i++) System.out.println("hello");
        // While loop
        int i = 0;
        while(i < 5){
            System.out.println("Morning");
            i++;
        }
        // Do while loop
        do{
            System.out.println("Afternoon");
            i += 1;
        }while(i < 10);
        // Break and continue: break would jump out the loop, continue would go next iteration
        // For-each Loop
        String[] fruits = {"apple", "mango", "orange"};
        for(i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }
        for(String fruit : fruits){ //forward only, no access to the index
            System.out.println(fruit);
        }



    }


}
