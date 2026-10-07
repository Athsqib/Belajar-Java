public class cAbstract {
    public static abstract class Shape{
        abstract double area(); //ABSTRACT

        void display(){ //CONCRETE
            System.out.println("This is a shape");
        }
    }

    public static class Circle extends Shape{
        double radius;

        Circle(double radius){
            this.radius = radius;
        }

        @Override
        double area(){
            return Math.PI * radius * radius;
        }
    }

    public static class Triangle extends Shape{
        double base;
        double height;

        Triangle(double base, double height){
            this.base = base;
            this.height = height;
        }

        @Override
        double area(){
            return 0.5 * base * height;
        }
    }

    public static class Rectangle extends Shape{
        double length;
        double width;

        Rectangle(double length, double width){
            this.length = length;
            this.width = width;
        }

        @Override
        double area(){
            return length * width;
        }
    }

    public static void main(String[] args){
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(2, 3);
        Rectangle rectangle = new Rectangle(2, 5);
        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}