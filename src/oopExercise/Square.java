package oopExercise;

public class Square extends Shape {
    private double height;
    
    public Square(double height) {
        this.height = height;
    }
    
    @Override
    public double getPerimeter() {
        return 4 * height;
    }
    
    @Override
    public double getArea() {
        return height * height;
    }
}