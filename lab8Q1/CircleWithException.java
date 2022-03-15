package lab8Q1;


public class CircleWithException {

    private double radius;
    private final static double PI = 3.14;

    public CircleWithException() {

        this.radius = 0; // default

    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius < 0) 
            throw new IllegalArgumentException();
        
        this.radius = radius;
    }

    public double getArea() throws Exception {
        double area = PI*radius*radius;

        if (area > 1000)
            throw new Exception();
        
        return area;
    }

    

    public double getDiameter() {
        return this.radius * 2;
    }

}
