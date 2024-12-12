import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Shape3DInterface[] shapes = new Shape3DInterface[10];

        for (int i = 0; i < shapes.length; i++) {
            int shapeType = random.nextInt(3);
            switch (shapeType) {
                case 0:
                    shapes[i] = new Sphere(1 + random.nextDouble() * 9);
                    break;
                case 1:
                    shapes[i] = new Cylinder(1 + random.nextDouble() * 9, 5 + random.nextDouble() * 15);
                    break;
                case 2:
                    shapes[i] = new Cube(1 + random.nextDouble() * 9);
                    break;
            }
        }

        for (Shape3DInterface shape : shapes) {
            System.out.println("Shape: " + shape);
            System.out.printf("Surface Area: %.2f\n", shape.surfaceArea());
            System.out.printf("Volume: %.2f\n", shape.volume());
            System.out.println("----------------------");
        }
    }
}

interface Shape3DInterface {
    double surfaceArea();
    double volume();
}

class Sphere implements Shape3DInterface {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere";
    }
}

class Cylinder implements Shape3DInterface {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder";
    }
}

class Cube implements Shape3DInterface {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return "Cube";
    }
}
