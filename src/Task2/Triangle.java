package Task2;

public class Triangle implements Shape{
    private String fillColor;
    private String backgroundColor;
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    @Override
    public double calculatePerimeter() {
        return this.a + this.b + this.c;
    }

    @Override
    public double calculateArea() {
        double p = this.calculatePerimeter();
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
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
