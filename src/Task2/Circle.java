package Task2;

public class Circle implements Shape{
    private String fillColor;
    private String backgroundColor;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    @Override
    public double calculatePerimeter() {
        return  2 * Math.PI * this.radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    @Override
    public void setBackgroundColor(String color) {
        this.backgroundColor = color;
    }
}
