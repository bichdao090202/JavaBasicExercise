package oopExercise;

public class Circle extends Shape {
    private double diameter;
    
    public Circle(double diameter) {
        this.diameter = diameter;
    }
    
    @Override
    public double getPerimeter() {
        return Math.PI * diameter;
    }
    
    @Override
    public double getArea() {
        double radius = diameter / 2;
        return Math.PI * radius * radius;
    }
}
