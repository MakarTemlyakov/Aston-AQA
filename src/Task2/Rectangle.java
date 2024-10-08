package Task2;

public class Rectangle implements Shape {
    private double length;
    private double width;
    private String fillColor;

    public String getFillColor() {
        return fillColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    private String backgroundColor;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.length *  this.width);
    }

    @Override
    public double calculateArea() {
        return this.length * this.width;
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
