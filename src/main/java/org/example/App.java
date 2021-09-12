package org.example;

import java.util.Scanner;

import static java.lang.System.out;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ivan pavlov
 */
public class App 
{
    static Scanner in = new Scanner(System.in);
    public static void main( String[] args )
    {
    App ask = new App();
    double w = ask.weight();
    double h = ask.height();
    ask.calc(h,w);
    }
    void calc(double h,double w){
        double bmi = 0;
        bmi = (( w/(h*h))*703);
        if(bmi<18.5){
        out.println(String.format("Your BMI is %.1f \n" +
                "You are underweight. You should see your doctor ",bmi));
    }else if(bmi>25){
            out.println(String.format("Your BMI is %.1f \n" +
                    "You are overweight. You should see your doctor",bmi));
        }else{
            out.println(String.format("Your BMI is %.1f \n" +
                    "You are within the ideal weight range.",bmi));
        }
}
private int weight(){
        out.print("What is your weight in pounds: ");
        return in.nextInt();
}
private int height(){
        out.print("How many feet tall are you: ");
                int feet = in.nextInt();
        out.print("Enter your remaining height in inches: ");
            int inch = in.nextInt();

        return (feet*12)+inch;
}
}
