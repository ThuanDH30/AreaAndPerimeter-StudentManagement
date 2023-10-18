/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Validation;
import model.Circle;
import model.Rectangle;
import model.Triangle;
import view.Menu;

/**
 *
 * @author Bravo
 */
public class Calculator extends Menu{
    static String[] options = {"Circle","Rectangle","Triangle","Exit"};
    Validation validation;
    public Calculator() {
        super("=====Calculator Shape Program=====", options);
        validation = new Validation();
    }
    
    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1: {
                double radius = validation.inputDouble("Enter radius: ", 0);
                new Circle(radius).printResult();
                break;
            }
            case 2: {
                double side = validation.inputDouble("Enter side: ", 0);
                double length = validation.inputDouble("Enter length: ", 0);
                new Rectangle(side, length).printResult();
                break;
            }
            case 3: {
                double sideA = validation.inputDouble("Enter side A: ", 0);
                double sideB = validation.inputDouble("Enter side B: ", 0);
                double sideC = validation.inputDouble("Enter side C: ", 0);
                new Triangle(sideA, sideB, sideC).printResult();
                break;
            }
            case 4: {
                System.exit(0);
            }
        }
    }
}
