package com.bohdansavshak.java16_jep_394_patternMatchingForInstanceOf;

public class Main {

    static class Shape {
    }

    static class Circle extends Shape {
    }

    static class Rectangle extends Shape {
    }

    public static void main(String[] args) {
        /*
        A pattern is a combination of (1) a predicate, or test, that can be applied to a target, and (2)
         a set of local variables, known as pattern variables,
         that are extracted from the target only if the predicate successfully applies to it.

         Pattern matching involves testing whether an object has a particular structure,
         then extracting data from that object if there's a match

        pattern matching consists of three things
        target in this case it's 'shape'
        predicate
        and pattern variable
         */

        Shape shape = new Circle();

        // before
        if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            System.out.println("This is circle: " + c);
        } else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            System.out.println("This is rectangle: " + r);
        }

        // after
        if (shape instanceof Circle circle) {
            System.out.println("This is circle: " + circle);
        } else if (shape instanceof Rectangle rectangle) {
            System.out.println("This is rectangle: " + rectangle);
        }


// trick. Only where predicate is true, pattern variable can be used. Also && and || example
        if (!(shape instanceof Rectangle r)) {
            // You cannot use the pattern variable r here because
            // the predicate s instanceof Rectangle is false.
            throw new RuntimeException();
        }
        // You can use r here.
        System.out.println(r);
    }
}

