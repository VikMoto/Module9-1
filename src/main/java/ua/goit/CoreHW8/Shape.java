package ua.goit.CoreHW8;

class Shape implements ShapeInfo{
    @Override
    public void name() {
        System.out.println("Shape.getClass() = " + this.getClass().getSimpleName());
    }
}

class Circle extends Shape {
    private final int radius;

    public int getRadius() {
        System.out.println("radius = " + radius);
        return radius;
    }
    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public void name() {
        System.out.println("Коло = " + this.getClass().getSimpleName());
    }
}

class IsoscelesTriangle extends Shape {

    @Override
    public void name() {
        System.out.println("Рівнобедрений трикутник = " + this.getClass().getSimpleName());
    }
}

class Rectangle extends Shape {

    @Override
    public void name() {
        System.out.println("Прямокутник = " + this.getClass().getSimpleName());
    }
}

class Quad extends Shape {

    @Override
    public void name() {
        System.out.println("Квадрат = " + this.getClass().getSimpleName());
    }
}

class Polygon extends Shape {

    @Override
    public void name() {
        System.out.println("Багатокутник = " + this.getClass().getSimpleName());
    }
}



class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle(5);
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        Rectangle rectangle = new Rectangle();
        Quad quad = new Quad();
        Polygon polygon = new Polygon();

        shape.name();
        circle.name();
        circle.getRadius();
        isoscelesTriangle.name();
        rectangle.name();
        quad.name();
        polygon.name();

    }
}