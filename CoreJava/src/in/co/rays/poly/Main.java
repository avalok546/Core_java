package in.co.rays.poly;
//Superclass
class Shape {
 private String color;
 private int borderWidth;

 public Shape(String color, int borderWidth) {
     this.color = color;
     this.borderWidth = borderWidth;
 }

 public String getColor() {
     return color;
 }

 public void setColor(String color) {
     this.color = color;
 }

 public int getBorderWidth() {
     return borderWidth;
 }

 public void setBorderWidth(int borderWidth) {
     this.borderWidth = borderWidth;
 }

 // Generic area method to be overridden
 public double area() {
     System.out.println("Area of generic shape not defined.");
     return 0.0;
 }
}

//Rectangle Subclass
class Rectangle extends Shape {
 private int length;
 private int width;

 public Rectangle(String color, int borderWidth, int length, int width) {
     super(color, borderWidth);
     this.length = length;
     this.width = width;
 }

 public int getLength() {
     return length;
 }

 public void setLength(int length) {
     this.length = length;
 }

 public int getWidth() {
     return width;
 }

 public void setWidth(int width) {
     this.width = width;
 }

 @Override
 public double area() {
     return length * width;
 }
}

//Circle Subclass
class Circle extends Shape {
 private double radius;

 public Circle(String color, int borderWidth, double radius) {
     super(color, borderWidth);
     this.radius = radius;
 }

 public double getRadius() {
     return radius;
 }

 public void setRadius(double radius) {
     this.radius = radius;
 }

 @Override
 public double area() {
     return Math.PI * radius * radius;
 }
}

//Triangle Subclass
class Triangle extends Shape {
 private int base;
 private int height;

 public Triangle(String color, int borderWidth, int base, int height) {
     super(color, borderWidth);
     this.base = base;
     this.height = height;
 }

 public int getBase() {
     return base;
 }

 public void setBase(int base) {
     this.base = base;
 }

 public int getHeight() {
     return height;
 }

 public void setHeight(int height) {
     this.height = height;
 }

 @Override
 public double area() {
     return 0.5 * base * height;
 }
}

//Main class to test the code (as shown on the right side of the slide)
public class Main {
 public static void main(String[] args) {
     // Polymorphism: Reference of type Shape pointing to a Circle object
     Shape s = new Circle("Red", 2, 5.0);

     System.out.println("Color: " + s.getColor());
     System.out.println("Border Width: " + s.getBorderWidth());
     
     // This calls the overridden area() method in the Circle class
     System.out.println("Area: " + s.area());
 }
}