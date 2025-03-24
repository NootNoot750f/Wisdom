package org.example;

public class App {
    public static void main(String[] args) {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();
        
        // Testing the value method
        System.out.println(calculator.value(1)); // Should print 1
        System.out.println(calculator.value(2)); // Should print 3
        System.out.println(calculator.value(4)); // Should print 10
        
        // Testing the add method
        System.out.println(calculator.add(1, 1)); // Should print 2
        System.out.println(calculator.add(2, 3)); // Should print 9
        System.out.println(calculator.add(4, 2)); // Should print 13
        
        // Testing the subtract method
        System.out.println(calculator.subtract(1, 1)); // Should print 0
        System.out.println(calculator.subtract(2, 3)); // Should print -3
        System.out.println(calculator.subtract(4, 2)); // Should print 7
    }
}
